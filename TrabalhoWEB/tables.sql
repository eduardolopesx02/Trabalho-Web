 CREATE TABLE prato (
  id INT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255) NOT NULL,
  ingredientes VARCHAR(255) NOT NULL,
  tipo VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE pedido (
  id INT NOT NULL AUTO_INCREMENT,
  data DATE NOT NULL,
  entrada INT NOT NULL,
  principal INT NOT NULL,
  sobremesa INT NOT NULL,
  PRIMARY KEY (id)
);
