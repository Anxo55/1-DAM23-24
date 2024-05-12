USE dam;

CREATE TABLE centros(
CeCodigo INT UNSIGNED AUTO_INCREMENT,
CeNombre VARCHAR(30),
CeDireccion VARCHAR(100),
PRIMARY KEY (CeCodigo)
);

CREATE TABLE empleados(
EmCodigo INT UNSIGNED AUTO_INCREMENT,
EmCodigoDepartamento INT UNSIGNED,
EmExTelefono SMALLINT UNSIGNED,
EmFecNacimiento DATE,
EmFecIngreso DATE,
EmSalario DECIMAL(6,2) UNSIGNED,
EmComision DECIMAL(4,2),
EmNumHijos SMALLINT UNSIGNED,
EmNombre VARCHAR(20),
PRIMARY KEY (EmCodigo)
);

CREATE TABLE departamentos(
DeCodigo INT UNSIGNED AUTO_INCREMENT,  #clave ajena relacionada con centros
DeCodigoCentro INT UNSIGNED,
DeTipoDirector ENUM('P', 'F'),
DePresupuesto DECIMAL(8,0) UNSIGNED,
DeDepartamento INT UNSIGNED,
DeNombre VARCHAR(30),
DeDirector INT UNSIGNED,
PRIMARY KEY (DeCodigo),
FOREIGN KEY (DeDirector) REFERENCES empleados(EmCodigo),
FOREIGN KEY (DeCodigoCentro) REFERENCES centros(CeCodigo),
FOREIGN KEY (DeDepartamento) REFERENCES departamentos(DeCodigo)
);

ALTER TABLE departamentos ADD FOREIGN KEY (EmCodigoDepartamento) REFERENCES departamentos(DeCodigo);