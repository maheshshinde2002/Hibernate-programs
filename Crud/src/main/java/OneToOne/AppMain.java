package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AppMain {
    public static void main(String[] args) {
    SessionFactory factory =HibernateUtil.getSessionFactory();

    Address d=new Address();
    d.setId(101);
    d.setAddess("Odisha");


    Empdetls e= new Empdetls();
    e.setId(201);
    e.setName("Pavy");
    e.setAddress(d);

        Session session =factory.openSession();
        Transaction tx=session.beginTransaction();
        session.persist(d);
        session.persist(e);

        tx.commit();
        session.close();

        System.out.println(factory);
        factory.close();

}}
