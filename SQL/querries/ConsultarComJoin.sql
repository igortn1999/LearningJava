SELECT E.NOME AS Estado, C.NOME AS Cidade, E.REGIAO AS Região
FROM ESTADOS E, CIDADES C
WHERE E.ID = C.ESTADO_ID;

SELECT E.NOME AS Estado, C.NOME AS Cidade, E.REGIAO AS Região
FROM ESTADOS E
INNER JOIN CIDADES C 
ON E.ID = C.ESTADO_ID;