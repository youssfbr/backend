CREATE TABLE tb_customers (
    id BIGINT NOT NULL AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    email VARCHAR(100),
    cpf VARCHAR(14) ,
    birth_date DATE,
    note TEXT,

    cep VARCHAR(11),
    public_place VARCHAR(100),
    house_number VARCHAR(20),
    supplement VARCHAR(40),
    neighborhood VARCHAR(30),
    city VARCHAR(20),
    uf CHAR(2),
    state VARCHAR(20),
    region VARCHAR(20),

    active BIT NOT NULL,
    created_at DATETIME,
    updated_at DATETIME,

    PRIMARY KEY (id)
)  ENGINE=INNODB;