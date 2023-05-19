drop database if exists bdfutbol;
create database if not exists bdfutbol;
use bdfutbol;

drop table if exists estadios;


drop table if exists entrenadores;
create table if not exists entrenadores
(
	codEntrenador int auto_increment not null,
	nomCompleto varchar(60),
    apodo varchar(20),
    fecNac date,
    paisNac varchar(20),
    foto varchar(120),
    constraint pk_entrenadores primary key (codEntrenador)
);

drop table if exists equipos;
create table if not exists equipos
(
	codEquipo int auto_increment not null,
	nomEquipo varchar(60),
    foto varchar(120),
    codEntrenador int not null,
    constraint pk_equipos primary key (codEquipo),
    constraint fk_equipos_entrenador foreign key (codEntrenador)
		references entrenadores(codEntrenador)
);


drop table if exists clasificacion;
create table if not exists clasificacion
(
	codClasificacion int auto_increment not null,
	codEquipo int not null,
    puntos int default 0,
    partJugados int default 0,
    partGanados int default 0,
    partEmpatados int default 0,
    partPerdidos int default 0,
    golesAFavor int default 0,
    golesEnContra int default 0,
    difGoles int default 0,
    constraint pk_clasificacion primary key (codClasificacion),
    constraint fk_clasificacion_equipos foreign key (codEquipo) 
		references equipos(codEquipo)
);

drop table if exists partidos;
create table if not exists partidos
(
	codPartido int auto_increment not null,
	codEquipo1 int not null,
    codEquipo2 int not null,
    fecha date,
    lugar varchar(60),
    resultado varchar(3),
    constraint pk_partidos primary key (codPartido),
    constraint fk_partidos_equipo1 foreign key (codEquipo1) 
		references equipos(codEquipo),
	constraint fk_partidos_equipo2 foreign key (codEquipo2) 
		references equipos(codEquipo)
);

/*
insert into entrenadores
	(nomCompleto, apodo, fecNac, paisNac, foto)
values
	('Xavier Hernández Creus', 'Xavi', '1980/01/25', 'España', 'src/imagenes/entrenadores/xavi.webp'),
    ('Carlo Ancelotti', 'Carlo Ancelotti', '1959/06/10', 'Italia', 'src/imagenes/entrenadores/carloAncelotti.jpeg'),
    ('Diego Pablo Simeone', 'Diego Simeone', '1970/04/28', 'Argentina', 'src/imagenes/entrenadores/simeone.webp'),
    ('Imanol Alguacil Barrenetxea', 'Imanol Alguacil', '1971/07/04', 'España', 'src/imagenes/entrenadores/imanol.jpeg'),
    ('Enrique Setién Solar', '1958/09/27', 'src/imagenes/entrenadores/quique.jpeg'),
    ('Manuel Luis Pellegrini Ripamonti', '1953/09/16', 'src/imagenes/entrenadores/pellegrini.jpeg'),
    ('Miguel Ángel Sánchez Muñoz', '1975/10/30', 'src/imagenes/entrenadores/michel.jpeg'),
    ('Ernesto Valverde Tejedor', '1964/02/09', 'src/imagenes/entrenadores/ernesto.jpeg'),
    ('Jagoba Arrasate Elustondo', '1978/04/22', 'src/imagenes/entrenadores/jagoba.jpeg'),
    ('José Luis Mendilibar Etxebarria', '1961/03/14', 'src/imagenes/entrenadores/mendilibar.jpeg'),
    ('Andoni Iraola', '1982/06/22', 'src/imagenes/entrenadores/andoni.jpeg'),
    ('Javier Aquirre Onaindía', '1958/12/01', 'src/imagenes/entrenadores/javierAguirre.jpg'),
    ('Carlos Augusto Soares da Costa Faria Carvalhal', '1965/12/04', 'src/imagenes/entrenadores/carlosCarvalhal.jpeg'),
    ('Rubén Baraja Vegas', '1975/07/11', 'src/imagenes/entrenadores/ruben.jpeg'),
    ('Joan Francesc Ferrer Sicilia', '1970/02/05', 'src/imagenes/entrenadores/rubi.jpeg'),
    ('Sergio González Soriano', '1976/11/10', 'src/imagenes/entrenadores/sergio.jpeg'),
    ('Paulo César Pezzolano Suárez', '1983/04/25', 'src/imagenes/entrenadores/paulo.jpeg'),
    ('José Bordalás Jiménez', '1964/03/05', 'src/imagenes/entrenadores/jose.jpeg'),
    ('Luis García Fernández', '1981/02/06', 'src/imagenes/entrenadores/luis.jpeg'),
    ('Sebastián Andrés Beccacece', '1980/12/17', 'src/imagenes/entrenadores/sebastian.jpeg');
*/

/* alter table estadios
	add column codPostal char(5); */


    