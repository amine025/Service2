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
    id_client INTEGER AUTO_INCREMENT,
    birth_day VARCHAR(50) NOT NULL,
    username VARCHAR(50)NOT NULL,
    machine_name VARCHAR(50)NOT NULL,
    time_stamp  VARCHAR(50),
    CONSTRAINT id_client_client_PK PRIMARY KEY (id_client)
);

/*
{"birthDay":1950,"username":"1895101","machineName":"LI-H023-0T04"}
*/