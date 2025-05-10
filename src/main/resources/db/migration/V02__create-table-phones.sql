CREATE TABLE tb_phones (
        customer_id BIGINT NOT NULL,
        id BIGINT NOT NULL AUTO_INCREMENT,
        number VARCHAR(20) NOT NULL,
        type ENUM ('CELULAR','COMERCIAL','RESIDENCIAL','WHATSAPP'),

        PRIMARY KEY (id)
    ) ENGINE=INNODB;