DROP DATABASE IF EXISTS p81Nerea;
CREATE DATABASE  IF NOT EXISTS p81Nerea;
USE p81Nerea;

DROP TABLE IF EXISTS factura;
CREATE TABLE factura (
  codigo int NOT NULL AUTO_INCREMENT,
  fechaEmision datetime DEFAULT NULL,
  descripcion varchar(60) DEFAULT NULL,
  totalImporte decimal(7, 2) DEFAULT NULL,
  constraint pk_factura primary key (codigo)
) ENGINE=InnoDB;