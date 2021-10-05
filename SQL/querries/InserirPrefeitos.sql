SELECT * FROM CIDADES;

INSERT INTO PREFEITOS (NOME, CIDADE_ID)
VALUES ('Rodrigo Neves', 2),
	   ('Raquel Lyra', 3),
	   ('Zenaldo Coutinho', null);

INSERT INTO PREFEITOS(NOME, CIDADE_ID)
VALUES ('Rafael Greca', null);

SELECT * FROM PREFEITOS;