/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import entities.Client;

/**
 *
 * @author 1895101
 */
public class Gestionnaire {
    
    private static Client client;
    
    public Gestionnaire(){
        
    }
    
    public static Client getClientFromJson(String jsonInfos){
        Gson gson = new Gson();
        client = gson.fromJson(jsonInfos, Client.class);
        return client;
    }
    
}
