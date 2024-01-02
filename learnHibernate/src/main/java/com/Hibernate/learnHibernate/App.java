package com.Hibernate.learnHibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hii Kausar Padh Lo!" );
        
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        System.out.println(factory);
        
        StudentDb st = new StudentDb();
        Address ad = new Address();
        ad.setCity("Deoria");
        ad.setDist("Gorakhpur");
        ad.setStreet("Tarkulwa");
        ad.setB(true);
        ad.setAddedDate(new Date());
        FileInputStream fs = new FileInputStream("src/main/java/com/Hibernate/learnHibernate/pancard.jpg");
        byte[] b = new byte[fs.available()];
        fs.read(b);
        ad.setImg(b);
        st.setId(1);
        st.setName("Raza");
        st.setEmail("raza349@gmail.com");
        st.setNumb("80525467345");
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
    }
}
