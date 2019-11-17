-- Database: agenda
-- ------------------------------------------------------

CREATE DATABASE agenda;
USE agenda;

-- Table structure for table `contactos`
-- -------------------------------------

DROP TABLE IF EXISTS contactos;
CREATE TABLE contactos (
	idcontacto INT AUTO_INCREMENT PRIMARY KEY,
	nombre VARCHAR(45) NOT NULL,
	email VARCHAR(45),
	telefono VARCHAR(30)
);

-- END
