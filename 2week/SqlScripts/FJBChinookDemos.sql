set schema 'chinook';
--we use the select statement to get data from the db
--basic syntax of select is select column_names, we_want, to_see, from table_name;

select "ArtistId" from "Artist";
--if you want all the data from a table, use * instead of column names
select * from "Artist";
--next big keyword in selecting data is the where clause
--where allows us to specify condition(s) to restrict the result set from the table
select * from "Artist" where "ArtistId" < 50 and "ArtistId" > 10;
select * from "Artist" where ("ArtistId" + 2 = 10) or ("ArtistId" - 2 = 10);
--where is pretty similar to java, we have and or not, > < =, in (basically = but for a set of data) if 1 in (1,2,3)
 select * from "Artist" where "ArtistId" between 10 and 50;
 --when you want to match partially a string we can use like
select * from "Artist" where "Name" like 'A%';--Starts with Capital A then any number of chars of any types
--the rules for like, _ matches a single random char % matches any number of random Chars
select * from "Artist" where "Name" like 'A_r%';
--the in clause is used to match equality when you have a set of numbers
select * from "Artist" where "ArtistId" in (1,5,10,19,25,97);

--we can combine multiple select queries together to get more interesting data

--I want albums that belong to an Artist that starts with the letter A
select * from "Album" where "ArtistId" in 
	(select "ArtistId" from "Artist" where "Name" like 'A%');--this gets artists that start with letter A
--I want every song on an album that belongs to an artist that starts with the letter A
	
select * from "Track" where "AlbumId" in 
	(select "AlbumId" from "Album" where "ArtistId" in 
		(select "ArtistId" from "Artist" where "Name" like 'A%'))	
		
		
--where clause is our first and most import clause for modifying the result sets we get back
--we do have some other ways to modify the results
--order by clause which allows us to specify how the data will be ordered when we get it
select * from "Track" where "AlbumId" in 
	(select "AlbumId" from "Album" where "ArtistId" in 
		(select "ArtistId" from "Artist" where "Name" like 'A%')) 
order by "TrackId" asc;--we start with the smallest name and end with the largest, desc for reverse		

--next two clauses are genrally put together and they give us the ability to further refine data search
-- group by, having clause
-- group by - smushes all rows based on equivalent values in a column
-- if ten rows had the same unitPrice, group by on unit price condenses them to a single row
-- all of the non grouped data is lost unless we can also combine it into a single value 
--group by normally gets combined with aggregate functions to transform data

select max("Bytes"), avg("Milliseconds"), "UnitPrice" from "Track" group by "UnitPrice";-- so .99 all becomes one row, 1.99 becomes one row etc...

--we can use the as keyword to give a column or table an alias
--we give it a temporary name to either make reults or query easier to read
select avg("Total") as "Average", max("Total") as "Most", min("Total") as "Least", "BillingCountry" 
	from "Invoice" 
	group by "BillingCountry"
	having avg("Total") < 6 
	order by "BillingCountry" ;


--the having is basically just tthe where clause but it executes after the group by instead of before
--this way we can select against grouped data as well
-- 1st where, 2nd group by, 3rd having, 4th order by 


--Problem case, I like ac dc songs, I want to find more songs like ac dc songs
--find every single song that is on a playlist with an ac/dc song, 
--but I don't want results to include the ac dc songs I already know
--results you give should be a number of tracks that doesn't include any ac dc songs
--3272 songs ( use distinct )

select * from "Track" t2 where t2."TrackId" in (
	select "TrackId" from "PlaylistTrack" where "PlaylistId" in
		(select "PlaylistId" from "PlaylistTrack" where "TrackId" in   
			(select "TrackId" from "Track" t where t."AlbumId" in
				(select "AlbumId" from "Album" a2 where a2."ArtistId" in
					(select "ArtistId" from "Artist" as a where a."Name" like 'AC/DC')))))
and t2."TrackId" not in 
	(select "TrackId" from "Track" t where t."AlbumId" in
		(select "AlbumId" from "Album" a2 where a2."ArtistId" in
			(select "ArtistId" from "Artist" as a where a."Name" like 'AC/DC')));

		

select distinct("PlaylistId") from "PlaylistTrack" pt inner join 
	(select "TrackId" from "Track" t where t."AlbumId" in
		(select "AlbumId" from "Album" a2 where a2."ArtistId" in
			(select "ArtistId" from "Artist" as a where a."Name" like 'AC/DC'))) as sq on pt."TrackId" = sq."TrackId";


select c."CustomerId", c."FirstName", c."LastName" , sum(i."Total") as "SumTotal" from "Customer" c inner join "Invoice" i on i."CustomerId" =c."CustomerId" group by c."CustomerId" order by "SumTotal" desc;


--who doesn;t have an employee? -right
--who doesn;t have a boss? - left

select e."FirstName", e."LastName", e."ReportsTo" , e2."FirstName" , e2."LastName" from "Employee" e right join "Employee" e2 on e."ReportsTo" = e2."EmployeeId"; 

select * from "Track" t inner join "Genre" g2 on t."GenreId" = g2."GenreId";



select c."FirstName", c."LastName", c."Address" from "Customer" c intersect (select e2."FirstName", e2."LastName", e2."Address" from "Employee" e2) 

select "Name" from "Artist" a intersect (select "Title" from "Album" a2);

create view acdc_songs as 
	(select * from "Track" t where t."AlbumId" in
		(select "AlbumId" from "Album" a2 where a2."ArtistId" in
			(select "ArtistId" from "Artist" as a where a."Name" like 'AC/DC')));
			
		
		select * from acdc_songs; 