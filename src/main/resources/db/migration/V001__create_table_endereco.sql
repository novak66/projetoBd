CREATE TABLE endereco (
	id 			    bigint not null auto_increment,
    estado          varchar(30),
    cidade          varchar(30),
    bairro          varchar(30),
    numero          varchar(10),
    complemento     varchar(50),
    cep             varchar(20),
    
    primary key(id)
) engine=InnoDB default charset=utf8;


