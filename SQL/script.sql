/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  1895101
 * Created: 2018-10-23
 */

CREATE TABLE client
(
    id_client NUMBER,
    machine_name VARCHAR(50) NOT NULL,
    time_stamp VARCHAR(50) NOT NULL,
    birth_day INTEGER NOT NULL,
    userName VARCHAR(50)NOT NULL,
    CONSTRAINT id_client_client_PK PRIMARY KEY (id_client)
);