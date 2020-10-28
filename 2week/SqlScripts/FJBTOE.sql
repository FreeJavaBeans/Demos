create schema trick_or_eat;
set schema 'trick_or_eat';



--food table
create table Food(
	food_id serial primary key, --serial is an auto incrementing int4, don't ever input a value for the serial column
	"name" text,
	culture text,
	spiciness int not null,
	calories numeric(12,3) not null,
	"type" text not null
);

-- don't insert values into a field that auto increments
insert into food ("name", culture, spiciness, calories, "type")
			values('IceCream', 'Chinese', 0, 450, 'Dessert'),
				  ('Curry', 'Indian', 8, 600, 'Entree');
begin;
select * from food;
commit;

--users table? user <- livingbeing <- Eater(I)
create table users (
	hunger_level numeric(12,3),
	"name" text,
	username text,
	"password" text,
	address text,
	user_id serial primary key
);


insert into users (hunger_level, "name", username, "password", address)
			values(2000, 'Alec', 'AB', 'password', 'Mulberry Lane'),
				  (2000, 'Berin', 'BH', 'password', 'Lichtenstein');





--order table
--?? how to connect to food?
-- many different food can be on a single order
-- many different orders can have the same kind of food
create table orders (
	orderer int4 references users (user_id),
	order_id serial primary key
);

insert into orders (orderer)
	values(1),
		  (1),
		  (2);
		 
select * from orders;

--make a join tabler for orders and food

--each food can only be ordered once per order
--if we want to support multiple orders, we have to change the pk to something else
create table ordersfood (
	order_id int4 references orders (order_id),
	food_id int references food (food_id),
	ordersfood_id serial primary key
);

insert into ordersfood (order_id, food_id)
						values (1,1),
							  (2,1),
							  (2,2),
							  (3,1),
							  (3,2);
							 
							 
--what food was on order with id of 1
select * from food f2 where f2.food_id in 
	(select food_id from ordersfood o2 where o2.order_id in 
		(select order_id from orders o where o.order_id = 3));
							 

--table table

update users set "name" ='Ben', username = 'BP' where user_id = 1;

-- '' is for a string literal anywhere you would put "" in java becomes '' in sql
--"" is specifically for identifiers like table names/ column names
--"" is to tell postgres instead of all Lowercase I want the exact identifier in the quotes


select * from users u ;

