USE arxiumusical;

-- Add data to security tables
-- ------------------------------------------------------
LOCK TABLES users WRITE;
INSERT INTO users VALUES
	('jose','$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('jordi','$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('maria','$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('josep','$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('toni','$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1),
	('angela','$2a$15$Pk2wIJ0vSYjyMrxCPo5JbuA391nPVS3AMitHqwgAk8Fs/SxpGHdgu',1);
UNLOCK TABLES;

LOCK TABLES authorities WRITE;
INSERT INTO authorities VALUES
	('jose','ROLE_EDITOR'),
	('jordi','ROLE_EDITOR'),
	('maria','ROLE_ADMIN'),
	('josep','ROLE_ADMIN'),
	('toni','ROLE_LECTOR'),
	('angela','ROLE_LECTOR');
UNLOCK TABLES;

-- Add data to model tables
-- ------------------------------------------------------
LOCK TABLES autors WRITE;
INSERT INTO autors VALUES
	(1,'Bob Dylan','Bob Dylan (Duluth, Minnesota 1941) és un compositor i cantant estatunidenc, considerat un dels músics més influents i prolífics del segle XX i guardonat el 2016 amb el Premi Nobel de Literatura...'),
	(2,'Rosalía','El 2018, després d\'estrenar una sèrie de vídeos al seu canal de YouTube, va presentar el seu nou projecte titulat El mal querer, un àlbum conceptual amb les relacions tòxiques masclistes com a tema principal'),
	(3,'Chet Baker','Chet Baker (1929-1988) va ser un trompetista i cantant estatunidenc, un dels músics de jazz més populars de la història...'),
	(4,'Morrisey','Steven P. Morrissey (Manchester, 1959), és un cantant i compositor britànic. Amb Johnny Marr va liderà els Smiths en 1982, ...'),
	(5,'Mozart','Wolfgang Amadeus Mozart (1756−1791) fou un compositor austríac, àmpliament considerat un dels més destacats de la història de la música occidental...'),
	(6,'Chopin','Frédéric Chopin (1810–1849) és generalment considerat el millor compositor polonès de la història i un dels millors compositors de piano ...'),
	(7,'London Symphony Orchestra',''),
	(8,'Arthur Rubinstein','Arthur Rubinstein (1887-1982) fou un pianista polonès, cèlebre per llurs interpretacions de Chopin i d\'altres compositors.');
UNLOCK TABLES;

LOCK TABLES generes WRITE;
INSERT INTO generes VALUES
	(1,'Jazz'),
	(2,'Rock'),
	(3,'Clàssica'),
	(4,'Flamenc');
UNLOCK TABLES;

LOCK TABLES gravacions WRITE;
INSERT INTO gravacions VALUES
	(1,1,NULL,'Blonde on Blonde',2,1966,14),
	(2,2,NULL,'El mal querer',4,2018,11),
	(3,3,NULL,'Chet Baker Sings and Plays',1,1955,11),
	(4,4,NULL,'Years of Refusal',2,2009,12),
	(5,7,5,'Symphonies N°40 & N°41',3,1987,8),
	(6,8,6,'Vol. 49: Chopin: Nocturnes',3,1999,19);
UNLOCK TABLES;

LOCK TABLES localitzacions WRITE;
INSERT INTO localitzacions VALUES
	(1,'Armari 1'),
	(2,'Armari 2'),
	(3,'HD1'),
	(4,'HD2');
UNLOCK TABLES;

LOCK TABLES formats WRITE;
INSERT INTO formats VALUES
	(1,'Físic: LP'),
	(2,'Físic: CD'),
	(3,'Digital: MP3'),
	(4,'Digital: WAV');
UNLOCK TABLES;

LOCK TABLES localitzaciogravacions WRITE;
INSERT INTO localitzaciogravacions VALUES
	(1,1,1,1),
	(2,1,3,3),
	(3,2,4,3),
	(4,3,2,2),
	(5,4,2,2),
	(6,4,3,4),
	(7,5,1,1),
	(8,6,2,2);
UNLOCK TABLES;

-- END --------------------------------------------------
