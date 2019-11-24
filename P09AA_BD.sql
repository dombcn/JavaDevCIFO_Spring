CREATE DATABASE  IF NOT EXISTS segurweb;
USE segurweb;

-- Table: users
-- ------------------------------------------------------
DROP TABLE IF EXISTS users;
CREATE TABLE users (
  username VARCHAR(50) NOT NULL PRIMARY KEY,
  password VARCHAR(68) NOT NULL,
  enabled TINYINT(1) NOT NULL
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

-- Add data
-- ------------------------------------------------------
LOCK TABLES `users` WRITE;
INSERT INTO `users` VALUES
	('jose_martinez','{bcrypt}$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('maria_comin','{bcrypt}$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('jordi_comin','{bcrypt}$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('josep_roca','{bcrypt}$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('jordi_farre','{bcrypt}$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('antoni_prat','{bcrypt}$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('lluisa_fernandez','{bcrypt}$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('angela_lopez','{bcrypt}$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1);
UNLOCK TABLES;

LOCK TABLES `authorities` WRITE;
INSERT INTO `authorities` VALUES
	('jose_martinez','ROLE_EMPLEADO'),
	('jose_martinez','ROLE_ADMINISTRADOR'),
	('jose_martinez','ROLE_EDITOR'),
	('maria_comin','ROLE_EMPLEADO'),
	('maria_comin','ROLE_ADMINISTRADOR'),
	('jordi_comin','ROLE_EMPLEADO'),
	('jordi_comin','ROLE_EDITOR'),
	('lluisa_fernandez','ROLE_EMPLEADO'),
	('lluisa_fernandez','ROLE_EDITOR'),
	('antoni_prat','ROLE_EMPLEADO'),
	('angela_lopez','ROLE_EMPLEADO'),
	('josep_roca','ROLE_COLABORADOR'),
	('jordi_farre','ROLE_COLABORADOR');
UNLOCK TABLES;
-- END --------------------------------------------------
