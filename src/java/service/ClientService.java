package service;

import dao.ClientDao;
import entities.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private static ClientDao clientDao;

    public ClientService() {
        clientDao = new ClientDao();
    }

    public void persist(Client entity) {
        clientDao.openCurrentSessionwithTransaction();
        clientDao.persist(entity);
        clientDao.closeCurrentSessionwithTransaction();
    }

    public void persistFromJson(String infosJson) {
        clientDao.openCurrentSessionwithTransaction();
        ArrayList<Client> clients = Gestionnaire.getClientFromJson(infosJson);
        for(Client client : clients){
            clientDao.persist(client);
        }
        clientDao.closeCurrentSessionwithTransaction();
    }

    public void update(Client entity) {
        clientDao.openCurrentSessionwithTransaction();
        clientDao.update(entity);
        clientDao.closeCurrentSessionwithTransaction();
    }

    public Client findById(Integer id) {
        clientDao.openCurrentSession();
        Client client = clientDao.findById(id);
        clientDao.closeCurrentSession();
        return client;
    }

    public void delete(Integer id) {
        clientDao.openCurrentSessionwithTransaction();
        Client client = clientDao.findById(id);
        clientDao.delete(client);
        clientDao.closeCurrentSessionwithTransaction();
    }

    public List<Client> findAll() {
        clientDao.openCurrentSession();
        List<Client> clients = clientDao.findAll();
        clientDao.closeCurrentSession();
        return clients;
    }

    public void deleteAll() {
        clientDao.openCurrentSessionwithTransaction();
        clientDao.deleteAll();
        clientDao.closeCurrentSessionwithTransaction();
    }

    public ClientDao clientDao() {
        return clientDao;
    }

}
