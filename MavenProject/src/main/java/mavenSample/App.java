package mavenSample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws IOException {
//        Student d=new Student();
//        d.setAge(454567);
//        d.setId(765646);
//        d.setName("eh65656t");

        // creating object of address class
        Adrress a=new Adrress();
        a.setStreet("street9");
        a.setCity("dubai");
        a.setOpen(false);
        a.setAddedDate(new Date());
        a.setX(134.5356);


        Configuration com=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Adrress.class);
        SessionFactory s= com.buildSessionFactory();
        Session session=s.openSession();
        Transaction tx=session.beginTransaction();
       // session.persist(d);
        session.persist(a);
        tx.commit();
        System.out.println("Done");
    }

}
