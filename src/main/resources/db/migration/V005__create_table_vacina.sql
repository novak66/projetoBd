CREATE TABLE vacina (
	id 			        bigint not null auto_increment,
	nome 		        varchar(50) not null,
	marca               varchar(30),
    doses_aplicadas     INTEGER,
    vacina_animal_id    bigint,

    primary key(id)
) engine=InnoDB default charset=utf8;

ALTER TABLE vacina
    ADD CONSTRAINT vacina_vacina_animal_id_fkey
        FOREIGN KEY (vacina_animal_id) REFERENCES vacina_animal (id);