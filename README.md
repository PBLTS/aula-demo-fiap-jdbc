
Instalação do MYSQL via DOCKER

#DOCKER RUN
#docker run -p 3306:3306 --name mysql1 -e MYSQL_ROOT_PASSWORD=root -d mysql --default-authentication-plugin=mysql_native_password -h 127.0.0.1
<br>
#docker exec -it ID /bin/bash
#mysql -uroot -p
#show databases;
#use db_aluno;
CREATE TABLE aluno (
    id int NOT NULL,
    nome varchar(255) NOT NULL,
    email varchar(255),
    PRIMARY KEY (id)
);
