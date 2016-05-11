package com.eew.service;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author minu
 */
public class DatabaseMaster {

    static Session session;
    static Transaction transaction;

    static {
        session = DatabaseUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
    }

    public static void saveEntity(Object object) {
        session = DatabaseUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(object);
        transaction.commit();
    }

    public static void updateEntity(Object object) {
        session.update(object);
        transaction.commit();
    }

    public static void deleteEntity(Object object) {
        session.delete(object);
        transaction.commit();
    }

    public static List<Object> getList(String tblname) {
        return session.createQuery("from " + tblname).list();
    }

    public static <T> List<T> listEntity(T entity) throws Exception {
        session = DatabaseUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(entity.getClass());
        return criteria.list();
    }

    public static List<Serializable> listEntityByQuery(String query) throws Exception {
        session = DatabaseUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(query);
        return criteria.list();
    }

}
