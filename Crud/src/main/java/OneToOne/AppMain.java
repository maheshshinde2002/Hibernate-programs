package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppMain {
    public static void main(String[] args) {
    SessionFactory factory =HibernateUtil.getSessionFactory();

    Address d=new Address();
    d.setAddess("Odisha");


    Empdetls e= new Empdetls();
    e.setName("Pavy");
    e.setAddress(d);


        Address d1=new Address();
        d1.setAddess("munnar");


        Empdetls e1= new Empdetls();
        e1.setName("ravi");
        e1.setAddress(d1);

        Session session =factory.openSession();
        Transaction tx=session.beginTransaction();

        session.persist(e);
        session.persist(e1);
        tx.commit();
        session.close();

        System.out.println(factory);
        factory.close();

}}
