package Data;

import mavenSample.Student;
import mavenSample.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class DeleteEntityStudent {
    public static void main(String[] args) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            long id =7854;
            Student student =session.get(Student.class,id);
            if(student!=null){
                session.beginTransaction();
                session.remove(student);
                session.getTransaction().commit();
            }else {
                System.out.println("Student dosent exist");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
