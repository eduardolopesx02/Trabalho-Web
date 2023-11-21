-- Conteúdo do arquivo "tables.sql" para PostgreSQL

-- Criando a tabela "prato"
CREATE TABLE prato (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    ingredientes TEXT,
    tipo VARCHAR(50)
);

-- Criando a tabela "pedido"
CREATE TABLE pedido (
    id SERIAL PRIMARY KEY,
    data DATE NOT NULL,
    entrada INT,
    principal INT,
    sobremesa INT
);
