CREATE DATABASE db_floricultura;


USE db_floricultura;


CREATE TABLE tb_flores (
    id INT PRIMARY KEY,                 
    especie VARCHAR(255) ,       
    preco DECIMAL(5,2));


INSERT INTO tb_flores (id, especie, preco) VALUES
(1, 'Rosa Vermelha', 12.50),          
(2, 'Orquídea Branca', 35.00);