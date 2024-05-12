USE dam;
CREATE TABLE IF NOT EXISTS usuarios (id INTEGER UNIQUE KEY);
CREATE DATABASE IF NOT EXISTS prueba;

CREATE TABLE equipos (
nombre VARCHAR(30) PRIMARY KEY, 
presidente VARCHAR(50), 
estadio VARCHAR(30), 
anhoFundacion YEAR, 
numSocio INT);

CREATE TABLE futbolista ( 
numFicha INT PRIMARY KEY, 
nombre VARCHAR(20),
 apellidos VARCHAR(50), 
 fecNacimiento DATE, 
 peso INT unsigned, 
 altura INT unsigned);
 
 CREATE TABLE contrato( 
 NumContrato INT PRIMARY KEY, 
 fichaAnual INT, 
 duracion INT, 
 fecContrato DATE, 
 clausula VARCHAR(20), 
 nombreEquipo VARCHAR(30) REFERENCES equipos(nombre), 
 numFicha INT REFERENCES futbolista(numFicha));
 


SHOW CREATE TABLE futbolista;