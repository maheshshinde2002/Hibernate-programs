package CRUDOperations;

import mavenSample.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session =factory.openSession();
        EmployeeData  e = new EmployeeData();
        e.setName("ram");
        e.setDepartment("comp");
        e.setId(100);
        e.setSalary(50000);

//        EmployeeData  e1 = new EmployeeData();
//        e.setName("ram1");
//        e.setDepartment("comp1");
//        e.setId(101);
//        e.setSalary(50001);

      Transaction tx= session.beginTransaction();
        session.persist(e);
        //session.persist(e1);

        tx.commit();
        System.out.println("data saved succeesfully : ");
        session.close();
        factory.close();
    }
}
