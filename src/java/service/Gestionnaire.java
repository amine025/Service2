/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import entities.Client;
import java.util.ArrayList;

/**
 *
 * @author 1895101
 */
public class Gestionnaire {
    
    private static ArrayList<Client> clients;
    
    public Gestionnaire(){
        
    }
    
    public static ArrayList<Client> getClientFromJson(String jsonInfos){
        Gson gson = new Gson();
        clients = gson.fromJson(jsonInfos, ArrayList.class);
        return clients;
    }
}
