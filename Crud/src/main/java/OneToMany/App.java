package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Address d=new Address(101,"pune","permenent");
        Address d1=new Address(102,"delhi","Office");
        Address d2=new Address(103,"nashik","home");


        List<Address> list =new ArrayList<>();
        list.add(d);
        list.add(d1);
        list.add(d2);


        Empdetls e=new Empdetls();
        e.setId(201);
        e.setName("Kumar");
        e.setAddress(list);

        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();

        session.persist(e);
        System.out.println("Insert successfully");

        tx.commit();

        session.close();
        factory.close();
    }
}
