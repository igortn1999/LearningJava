--Criando a Tabela ESTADO

create table ESTADOS (
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	nome VARCHAR(45) NOT NULL,
	sigla VARCHAR(2) NOT NULL,
	regiao ENUM('Norte', 'Nordeste', 'Sul', 'Sudeste', 'Centro-Oeste') NOT NULL,
	populacao DECIMAL(5,2) NOT NULL,
	PRIMARY KEY(id),
	UNIQUE KEY(nome),
	UNIQUE KEY(sigla)
);
