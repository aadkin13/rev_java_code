--Create the schema
create schema nfl authorization postgres;

--Create the tables teams and players within nfl schema
create table nfl.teams(
	team_id int not null,
	team_name varchar(255) not null,
	primary key (team_id)
);

create table nfl.players(
	player_id int not null,
	player_name varchar(255) not null,
	team_id int,
	primary key (player_id)
);

--Alter players to have team_id as a foreign key
alter table nfl.players
add foreign key (team_id) references nfl.teams(team_id);

--print all of the info in both players and teams table
select * from nfl.players;
select * from nfl.teams;

--inner join
select players.player_id, players.player_name, players.team_id, teams.team_name
from nfl.players
inner join nfl.teams
on players.team_id = teams.team_id;

--left join
select players.player_id, players.player_name, players.team_id, teams.team_name
from nfl.players
left join nfl.teams
on players.team_id = teams.team_id;

--right join
select teams.team_name, players.player_id, players.player_name
from nfl.players
right join nfl.teams
on players.team_id = teams.team_id;

--full join
select players.player_id, players.player_name, players.team_id, teams.team_name
from nfl.players
full join nfl.teams
on players.team_id = teams.team_id;

--cross join
select players.player_id, players.player_name, players.team_id, teams.team_name
from nfl.players
cross join nfl.teams;

--operators - union
select team_name,team_id from nfl.teams
union
select player_name,team_id from nfl.players
order by team_id;

--aggregate functions - count and sum
select count(team_id) from nfl.players where team_id = 102;
select sum(team_id) from nfl.players where team_id = 102;

--non aggregate functions - length and now
select length(player_name) from nfl.players;
select player_name, now() from nfl.players; 