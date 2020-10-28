set schema 'public';

--in Postgres, everything defaults to lowercase
-- we can use "" around identifiers ( tables, columns ) to take the string literally
create table USERS(
	"USERNAME" text
);

create table types_table (
	numbers_small int2 check (numbers_small < 100 ),
	numbers_normal int default 10,
	numbers_normal_cont int4 unique,
	numbers_large int8 not null,
	standard_number numeric(10,2) primary key,--numeric takes in 2 params, the first is the total number of digits, the second is how many digits can be in the decimal place 
	boolean_like_java boolean,
	fixed_length char(10), --always is 10 characters
	variable_length varchar(10), --from 0 to 10 characters
	unlimited_length text references "USERS" ("USERNAME"), --postgres has done a lot of work to optimize unlimited length strings, so use them
	time_format timestamp--YYYY-MM-DD HH-MM-SS
);



--thin wrapper around the now function
create function timeget() returns timestamp as $$
	select now();
$$ language sql;

select timeget();


select upper(lower('hello')); 
select round(10.6);




