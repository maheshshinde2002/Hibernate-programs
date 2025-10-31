package OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Address d=new Address(101,"permenent","Delhi");
        Address d1=new Address(102,"Office","pune");

        List<Address> list =new ArrayList<>();
        list.add(d);
        list.add(d1);

        Empdetls e=new Empdetls();
        e.setId(201);
        e.setName("Kumar");
        e.setAddress(list);

        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
       session.persist(d);
        session.persist(d1);

        session.persist(e);
        System.out.println("Insert successfully");

        tx.commit();

        session.close();
        factory.close();
    }
}
