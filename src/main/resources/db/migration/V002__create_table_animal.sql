CREATE TABLE animal (
	id 			            bigint not null auto_increment,
	nome                    varchar(50),
    tipo                    varchar(20) not null,
    porte                   varchar(20) not null,
    raca                    varchar(30),
    cor                     varchar(20),
    endereco_id     bigint,
    
    primary key(id)
) engine=InnoDB default charset=utf8;

ALTER TABLE animal
    ADD CONSTRAINT animal_endereco_id_fkey
        FOREIGN KEY (endereco_id) REFERENCES endereco (id);