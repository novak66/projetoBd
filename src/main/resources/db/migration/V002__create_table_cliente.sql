CREATE TABLE cliente (
	id 			    bigint not null auto_increment,
	nome 		    varchar(50) not null,
    cpf             varchar(13) not null,
    
    primary key(id)
) engine=InnoDB default charset=utf8;
