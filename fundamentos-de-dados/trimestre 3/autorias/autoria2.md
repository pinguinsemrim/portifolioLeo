# abaixo está o codigo
## create table digimon(
  nome VARCHAR(10) not NULL,
  tipo VARCHAR(6) not NULL,
  ataesp VARCHAR(15) not NULL,
  PRIMARY KEY (nome)
## )
## create table treinador(
  nome VARCHAR(10) not NULL,
  idade INTEGER not NULL,
  ia VARCHAR(15) not NULL,
  nome_digimon VARCHAR(10) NOT NULL, 
  PRIMARY KEY (ia),
  FOREIGN key (nome_digimon)
  REFERENCES digimon (nome)  
## )
## create table digivice(
  id_ VARCHAR(10) not NULL,
  versao INTEGER not NULL,
  ia VARCHAR(15) not NULL,
  nome_digimon VARCHAR(10) not NULL, 
  PRIMARY KEY (id_),
  FOREIGN key (nome_digimon)
  REFERENCES digimon (nome), 
  FOREIGN key (ia)
  REFERENCES treinador (ia) 
## )