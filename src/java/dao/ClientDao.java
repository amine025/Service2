/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Client;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author 1895101
 */
public class ClientDao implements IDAO<Client, Integer> {

    private Session currentSession;

    private Transaction currentTransaction;

    public ClientDao() {
    }

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    @Override
    public void persist(Client entity) {
        getCurrentSession().save(entity);
    }

    @Override
    public void update(Client entity) {
        getCurrentSession().update(entity);
    }

    @Override
    public Client findById(Integer id) {
        Client client = (Client) getCurrentSession().get(Client.class, id);
        return client;
    }

    @Override
    public void delete(Client entity) {
        getCurrentSession().delete(entity);
    }

    @Override
    public List<Client> findAll() {
        List<Client> clients = (List<Client>) getCurrentSession().createQuery("from Client").list();
        return clients;
    }

    @Override
    public void deleteAll() {
        List<Client> entityList = findAll();
        for (Client entity : entityList) {
            delete(entity);
        }
    }
}
