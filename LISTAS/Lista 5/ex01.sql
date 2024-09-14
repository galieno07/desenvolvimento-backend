CREATE DATABASE db_empresa_eventos;


USE db_empresa_eventos;


CREATE TABLE tb_eventos (
    id INT PRIMARY KEY,                     
    nome VARCHAR(255) NOT NULL,             
    localizacao VARCHAR(255) NOT NULL,      
    preco_ingresso DECIMAL(6,2) NOT NULL    
);


INSERT INTO tb_eventos (id, nome, localizacao, preco_ingresso) VALUES
(1, 'Concerto de Rock', 'Arena da Cidade', 150.00),   
(2, 'Feira de Inovação', 'Centro de Convenções', 50.00); 