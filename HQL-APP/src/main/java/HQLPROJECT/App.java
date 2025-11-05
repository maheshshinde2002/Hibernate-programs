package HQLPROJECT;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class App {

    public static void main(String[] args) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
       // System.out.println(factory);

        StudentAccess s=new StudentAccess();
        s.setName1("Mahesh");
        s.setAddress1("Pune");

        StudentAccess s1=new StudentAccess();
        s1.setName1("Akash");
        s1.setAddress1("Mumbai");



        Session session=factory.openSession();
        Transaction tx = session.beginTransaction();
//        session.persist(s);
//        session.persist(s1);
//
//        tx.commit();

//


      //  System.out.println(session.get(StudentAccess.class,2));

//        Query q = session.createQuery("select address1,name1 from StudentAccess s where id1 = 2 and address1 = 'Mumbai'");
//        System.out.println(q.uniqueResult());

//        Query q=session.createQuery("delete from StudentAccess where id1=1");
//        int i =q.executeUpdate();
//        System.out.println("Delete successfully");
//
        Query q= session.createQuery("update StudentAccess set address1='Rashin' where id1=1 ");
        int i=q.executeUpdate();
        System.out.println(i + "Updated successfully");

tx.commit();
        System.out.println("Registerd successfully");
         factory.close();
         session.close();
    }
}