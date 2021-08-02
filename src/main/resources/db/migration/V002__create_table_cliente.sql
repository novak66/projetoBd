CREATE TABLE cliente (
	id 			    bigint not null auto_increment,
	nome 		    varchar(50) not null,
    cpf             varchar(13) not null,
    endereco_id     bigint,
    
    primary key(id)
) engine=InnoDB default charset=utf8;

ALTER TABLE cliente
    ADD CONSTRAINT endereco_id_fkey
        FOREIGN KEY (endereco_id) REFERENCES endereco (id);