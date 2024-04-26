package com.devi.Demo_Hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        devi d = new devi();
        d.setD_id(7);
        d.setD_name("Praveen Raj");
        Configuration con = new Configuration().configure().addAnnotatedClass(devi.class);
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        
        Transaction tx = s.beginTransaction();
        s.save(d);
        tx.commit();
           
    }
}
