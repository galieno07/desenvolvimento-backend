create database db_escola_tech;
USE db_escola_tech;

Create table tb_endereco(
id INT AUTO_INCREMENT PRIMARY KEY,
logradouro VARCHAR(255)NOT null,
bairro VARCHAR(255)NOT NULL,
numero INT NOT NULL,
uf CHAR(2)NOT NULL,
 pais VARCHAR(255) NOT NULL
 );
 
 create table tb_filial(
 id INT AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(255)NOT NULL,
 cnpj CHAR(14)NOT NULL,
 id_endereco INT ,
 FOREIGN KEY (id_endereco) REFERENCES tb_endereco(id)
);

INSERT INTO tb_endereco(logradouro, bairro, numero, uf, pais)
VALUE ('Avenida Paulista', 'Bela Vista', 1000, 'SP', 'BRASIL');

 SELECT id FROM tb_endereco WHERE logradouro = 'Avenida Paulista' AND numbero = 1000;
 
 INSERT INTO tb_filial  (nome, cnpj, id_endereco) 
VALUES ('Filial São Paulo', '12345678000199', 1);

