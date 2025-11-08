package HQLPROJECT;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.Arrays;
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

        StudentAccess s2=new StudentAccess();
        s2.setName1("Akash2");
        s2.setAddress1("Mumbai2");

        StudentAccess s3=new StudentAccess();
        s3.setName1("Akash3");
        s3.setAddress1("Mumbai3");

        StudentAccess s4=new StudentAccess();
        s4.setName1("Akash4");
        s4.setAddress1("Mumbai4");

        StudentAccess s5=new StudentAccess();
        s5.setName1("Akash5");
        s5.setAddress1("Mumbai5");

        StudentAccess s6=new StudentAccess();
        s6.setName1("Akash6");
        s6.setAddress1("Mumbai6");

        StudentAccess s7=new StudentAccess();
        s7.setName1("Akash7");
        s7.setAddress1("Mumbai7");

        StudentAccess s8=new StudentAccess();
        s8.setName1("Akash8");
        s8.setAddress1("Mumbai8");



        Session session=factory.openSession();
        Transaction tx = session.beginTransaction();
//       session.persist(s);
//        session.persist(s1);
//        session.persist(s2);
//        session.persist(s3);
//        session.persist(s4);
//        session.persist(s5);
//        session.persist(s6);
//        session.persist(s7);
//        session.persist(s8);



    // tx.commit();

//


      //  System.out.println(session.get(StudentAccess.class,2));

//        Query q = session.createQuery("select address1,name1 from StudentAccess s where id1 = 2 and address1 = 'Mumbai'");
//        System.out.println(q.uniqueResult());

//        Query q=session.createQuery("delete from StudentAccess where id1=1");
//        int i =q.executeUpdate();
//        System.out.println("Delete successfully");
//
//        Query q= session.createQuery("update StudentAccess set address1='Rashin' where id1=1 ");
//        int i=q.executeUpdate();
//        System.out.println(i + "Updated successfully");
//
//
//        Query query=session.createQuery("from StudentAccess");
//
//        //impleminting pagination using hibernate
//
//        query.setFirstResult(4);
//        query.setMaxResults(8);
//
//        List<StudentAccess> list =query.list();
//        for(StudentAccess st:list){
//            System.out.println(st.getId1()+" : "+st.getName1()+" :  "+st.getAddress1());
//        }




//
//        // implementing native sql queries;
//        List<Object[]> users = session.createNativeQuery("SELECT id1, name1, address1 FROM student_access").list();
//
//        for(Object[] row : users) {
//            //System.out.println(Arrays.deepToString(row));
//            System.out.println(row[2]);
//        }




        tx.commit();
        System.out.println("Registerd successfully");
         factory.close();
         session.close();
    }
}