
DROP DATABASE IF EXISTS project06;

create database project06;
use project06;

create table menu(
id_menu int primary key auto_increment,
name varchar(100) not null,
precio float not null
);

create table mesas(
id_mesa int primary key  auto_increment,
num_personas int,
id_menu int,
foreign key (id_menu) references menu(id_menu)
);
 
create table cliente(
id_cliente int primary key auto_increment,
name varchar(100) not null,
telefono int,
id_mesa int,
foreign key (id_mesa) references mesas(id_mesa) 
);

