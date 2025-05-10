ALTER TABLE tb_phones
       ADD CONSTRAINT FK_tb_phones_customers
       FOREIGN KEY (customer_id)
       REFERENCES tb_customers (id);