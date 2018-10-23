/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import service.ClientService;

/**
 *
 * @author 1895101
 */
@WebService(serviceName = "PersistanceService")
public class PersistanceService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "persist")
    @Oneway
    public void persist(@WebParam(name = "json") String json) {
        ClientService clientService = new ClientService();
        clientService.persistFromJson(json);
    }

}
