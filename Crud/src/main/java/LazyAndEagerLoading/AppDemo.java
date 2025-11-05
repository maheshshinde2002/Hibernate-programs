package LazyAndEagerLoading;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


    public class AppDemo {
        public static void main(String[] args) {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Address1 d = new Address1(101, "permenent", "Delhi");
            Address1 d1 = new Address1(102, "Office", "pune");

            List<Address1> list = new ArrayList<>();
            list.add(d);
            list.add(d1);

            Employee1 e = new Employee1();
            e.setId(201);
            e.setName("Kumar");
            e.setAddress(list);

            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            session.persist(d);
            session.persist(d1);
            session.persist(e);
            System.out.println("Insert successfully");

            tx.commit();
            session.close();

            // Lazy Loading Example

            Session session2 = factory.openSession();
            Employee1 emp = session2.get(Employee1.class, 201);

            System.out.println("Employee fetched addresses not loaded");

            System.out.println("Employee Name- " + emp.getName());

            System.out.println("Now trying to access addresses (Hibernate will hit DB now):");
            System.out.println(emp.getAddress());


            session2.close();
            factory.close();
        }
    }

