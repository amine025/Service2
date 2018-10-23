/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  1895101
 * Created: 2018-10-23
 */
DROP TABLE client;
CREATE TABLE client
(

    id INTEGER(10)AUTO_INCREMENT,
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    ddn VARCHAR(50) NOT NULL,
    username VARCHAR(50)NOT NULL,
    machine_name VARCHAR(50)NOT NULL,
    time_stamp  TIMESTAMP DEFAULT NOW(),
    CONSTRAINT id_client_client_PK PRIMARY KEY (id)
);

/*
{"nom":"Ghodbane","prenom":"Amine","ddn":1950,"username":"1895101","machineName":"LI-H023-0T04"}
*/