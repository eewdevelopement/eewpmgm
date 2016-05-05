
package com.main.service;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author minu
 */
public class databaseMaster {
    static Session session;
    static Transaction transaction;
    static {
      session=NewHibernateUtil.getSessionFactory().openSession();
        transaction=session.beginTransaction();  
    }
    public static void saveEntity(Object object)
    {
        
        session.save(object);
        transaction.commit();
    }
    public static void updateEntity(Object object)
    {
        session.update(object);
        transaction.commit();
    }
    public static void deleteEntity(Object object)
    {
        session.delete(object);
        transaction.commit();
    }
    public static List<Object> getList(String tblname)
    {
        return session.createQuery("from "+ tblname).list();
    }
}
