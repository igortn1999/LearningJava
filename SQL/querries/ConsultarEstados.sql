SELECT * FROM ESTADOS;

SELECT SIGLA, NOME AS 'Nome do Estado' FROM ESTADOS;

SELECT SIGLA, NOME AS 'Nome do Estado' FROM ESTADOS
WHERE REGIAO = 'SUL';

SELECT NOME, REGIAO FROM ESTADOS
WHERE POPULACAO >= 10
ORDER BY POPULACAO; -- ORDEM CRESCENTE

SELECT NOME, REGIAO, POPULACAO FROM ESTADOS
WHERE POPULACAO >= 10
ORDER BY POPULACAO DESC; -- ORDEM DESCENDENTE