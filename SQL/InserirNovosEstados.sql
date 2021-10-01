INSERT INTO ESTADOS (ID, NOME, SIGLA, REGIAO, POPULACAO)
VALUES (1000, 'Novo', 'NV', 'Sul', 2.54);-- determinando ID manualmente

SELECT * FROM ESTADOS;

INSERT INTO ESTADOS (NOME, SIGLA, REGIAO, POPULACAO)
VALUES ('Mais Novo', 'MN', 'Norte', 2.51);-- Perceber que a contagem automatica de ID continua a partir do ID colocado manualmente
