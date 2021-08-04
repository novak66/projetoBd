CREATE TABLE vacina_animal (
	id 			    bigint not null auto_increment,
	animal_id 		bigint not null,

    primary key(id)
) engine=InnoDB default charset=utf8;

ALTER TABLE vacina_animal
    ADD CONSTRAINT vacina_animal_animal_id_fkey
        FOREIGN KEY (animal_id) REFERENCES animal (id);
