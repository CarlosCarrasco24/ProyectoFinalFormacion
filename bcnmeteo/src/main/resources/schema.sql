DROP TABLE ESTACIONES IF EXISTS;
DROP TABLE SECUENCIAS		IF EXISTS;

CREATE TABLE SECUENCIAS(
	SEQ_NAME			VARCHAR(100)	NOT NULL,
	SEQ_VALUE			BIGINT			NOT NULL,
	
	PRIMARY KEY (SEQ_NAME)
);

CREATE TABLE ESTACIONES(
	ID 					INT 			NOT NULL,
	NOMBRE 				VARCHAR(150)	,
	LATITUD 			DOUBLE			,
	LONGITUD 			DOUBLE			,
	FECHA_ALTA 			DATE			,
	ULTIMA_REVISION 	DATE			,
	INTERVALO_TIEMPO 	INT				,
	ESTADO				VARCHAR(20)		,
	CALLE 				VARCHAR (200)	,
	CODIGO_POSTAL 		VARCHAR (200)	,
	POBLACION 			VARCHAR (200)	,
	PROVINCIA 			VARCHAR (200)	,
	PAIS 				VARCHAR (200)	,
	
	PRIMARY KEY (ID)
	
);