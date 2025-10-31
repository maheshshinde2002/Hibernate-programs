package DemoProgram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class App {
        public static void main(String[] args) throws IOException {
// create table
//            EmployeeData emp = new EmployeeData();
//            emp.setEmpName("Mahesh Shinde");
//            emp.setDepartment("Development");
//            emp.setSalary(85000.75);
//            emp.setJoiningDate(new Date());
//            emp.setBonusAmount(5000.00);  // transient field, not stored in DB
//
//            EmployeeData emp1 = new EmployeeData();
//            emp.setEmpName("akash shinde");
//            emp.setDepartment("Development");
//            emp.setSalary(80000.75);
//            emp.setJoiningDate(new Date());
//            emp.setBonusAmount(6000.00);  // transient field, not stored in DB

           Configuration cfg = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(EmployeeData.class);
            SessionFactory factory = cfg.buildSessionFactory();
            Session session = factory.openSession();
//
           Transaction tx = session.beginTransaction();
//
//            session.persist(emp);
//            session.persist(emp1);
  //         tx.commit();
//

            //read data
  //          List<EmployeeData> list=session.createQuery("from EmployeeData " ,EmployeeData.class).list();
    //        list.forEach(e-> System.out.println(e));

            //get by id
//            EmployeeData e3=session.get(EmployeeData.class,1);
  //          System.out.println(e3);



//            //update data
//            EmployeeData e3=session.get(EmployeeData.class,1);
//            e3.setEmpName("akash shinde update ");
//            e3.setDepartment("Development update");
//            e3.setSalary(80000.75);
//            e3.setJoiningDate(new Date());
//            e3.setBonusAmount(6000.00);
//
//            session.merge(e3);



            //delete data
            EmployeeData e4=session.get(EmployeeData.class,1);
            session.remove(e4);
            tx.commit();
            session.close();
            factory.close();

            System.out.println("Employee record saved successfully!");
        } }


