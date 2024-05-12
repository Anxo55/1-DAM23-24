USE dam;

CREATE TABLE libros (
IdLibro INT PRIMARY KEY,
Titulo VARCHAR(50),
IdIdioma INT,
IdEditorial INT,
IdAutor INT,
IdTema INT,
AnhoPublicacion SMALLINT,
DiasMaxPrestamo INT);
DROP TABLE ejemplares;
CREATE TABLE ejemplares(
IdLibro INT,
IdEjemplar INT,
Ubicacion CHAR(15),
Edicion CHAR(15),
Precio DOUBLE,
Disponible BOOL,
PRIMARY KEY (IdLibro,IdEjemplar),
FOREIGN KEY(IdLibro) REFERENCES libros(IdLibro),INDEX (IdLibro),INDEX(IdEjemplar))
;

CREATE TABLE socios(
IdSocio INT PRIMARY KEY,
Nombre VARCHAR(20),
Apellidos VARCHAR(30),
Direccion VARCHAR(50),
Telefono CHAR(9),
Sexo ENUM('Hombre','Mujer'));

DROP TABLE prestamos;
CREATE TABLE Prestamos(
IdPrestamo INT PRIMARY KEY,
IdLibro INT,
IdEjemplar INT,
IdSocio INT,
FechaPrestamo DATE,
FechaDevolucion DATE,
 CONSTRAINT fk1 FOREIGN KEY (IdLibro) REFERENCES ejemplares(IdLibro),
 CONSTRAINT fk2  FOREIGN KEY (IdEjemplar) REFERENCES ejemplares (IdEjemplar),
 FOREIGN KEY (idSocio) REFERENCES socios(IdSocio));









