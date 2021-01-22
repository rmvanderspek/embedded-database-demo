create table test.person (
  id            char(36) primary key not null,
  first_name    varchar(255)       not null,
  last_name     varchar(255)       not null
);

create table test.car (
  id            char(36) primary key not null,
  type          varchar(255)        not null,
  speed         integer
);

insert into test.person (id, first_name, last_name) values ('b5e9fd10-d046-40ee-89e9-15c42f66ed70', 'Dave', 'Syer');
insert into test.car (id, type, speed) values ('b5e9fd10-d046-40ee-89e9-15c42f66ed70', 'car', 3);