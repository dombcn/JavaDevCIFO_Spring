CREATE DATABASE  IF NOT EXISTS arxiumusical;
USE arxiumusical;

-- Table: autors
-- ------------------------------------------------------
DROP TABLE IF EXISTS autors;
CREATE TABLE autors (
  idautor INT AUTO_INCREMENT PRIMARY KEY,
  nom VARCHAR(50) UNIQUE NOT NULL,
  info VARCHAR(255)
);

-- Table: generes
-- ------------------------------------------------------
DROP TABLE IF EXISTS generes;
CREATE TABLE generes (
  idgenere INT AUTO_INCREMENT PRIMARY KEY,
  nom VARCHAR(50) UNIQUE NOT NULL
);

-- Table: gravacions
-- ------------------------------------------------------
DROP TABLE IF EXISTS gravacions;
CREATE TABLE gravacions (
  idgravacio INT AUTO_INCREMENT PRIMARY KEY,
  idinterpret INT NOT NULL,
  idcompositor INT,
  album VARCHAR(100) NOT NULL,
  idgenere INT,
  anygrav INT, 
  ntemes INT,
  KEY fk_interpret_idx (idinterpret),
  CONSTRAINT fk_interpret FOREIGN KEY (idinterpret) REFERENCES autors (idautor),
  KEY fk_compositor_idx (idcompositor),
  CONSTRAINT fk_compositor FOREIGN KEY (idcompositor) REFERENCES autors (idautor),
  KEY fk_genere_idx (idgenere),
  CONSTRAINT fk_genere FOREIGN KEY (idgenere) REFERENCES generes (idgenere)
);

-- Table: localitzacions
-- ------------------------------------------------------
DROP TABLE IF EXISTS localitzacions;
CREATE TABLE localitzacions (
  idlocalitzacio INT AUTO_INCREMENT PRIMARY KEY,
  desclloc VARCHAR(50) UNIQUE NOT NULL
);

-- Table: formats
-- ------------------------------------------------------
DROP TABLE IF EXISTS formats;
CREATE TABLE formats (
  idformat INT AUTO_INCREMENT PRIMARY KEY,
  nom VARCHAR(50) UNIQUE NOT NULL
);

-- Table: localitzaciogravacions
-- ------------------------------------------------------
DROP TABLE IF EXISTS localitzaciogravacions;
CREATE TABLE localitzaciogravacions (
  idlocgrav INT AUTO_INCREMENT PRIMARY KEY,
  idgravacio INT NOT NULL,
  idlocalitzacio INT NOT NULL,
  idformat INT NOT NULL,
  UNIQUE KEY idx_locgrav (idlocalitzacio,idgravacio),
  KEY fk_gravacio_idx (idgravacio),
  CONSTRAINT fk_gravacio FOREIGN KEY (idgravacio) REFERENCES gravacions (idgravacio),
  KEY fk_localitzacio_idx (idlocalitzacio),
  CONSTRAINT fk_localitzacio FOREIGN KEY (idlocalitzacio) REFERENCES localitzacions (idlocalitzacio),
  KEY fk_format_idx (idformat),
  CONSTRAINT fk_format FOREIGN KEY (idformat) REFERENCES formats (idformat)
);

-- Table: users
-- ------------------------------------------------------
DROP TABLE IF EXISTS users;
CREATE TABLE users (
  username VARCHAR(50) NOT NULL PRIMARY KEY,
  password VARCHAR(68) NOT NULL,
  enabled BOOLEAN NOT NULL
);

-- Table: authorities
-- ------------------------------------------------------
DROP TABLE IF EXISTS authorities;
CREATE TABLE authorities (
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  UNIQUE KEY ix_auth_username (username,authority),
  CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES users (username)
);

-- END --------------------------------------------------
