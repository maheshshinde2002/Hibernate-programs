package ManyToMany;

import OneToOne.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();


        Emp e=new Emp();
        Emp e1=new Emp();

        e.setEid(30);
        e.setName("ram");

        e1.setEid(31);
        e1.setName("vivek");

        Project p = new Project();
        Project p1 = new Project();
        p.setPid(21);
        p.setPname("development ");
        p1.setPid(22);
        p1.setPname("android");

        List<Emp> list = new ArrayList<Emp>();
        List<Project> list1=new ArrayList<Project>();

        list.add(e);
        list.add(e1);

        list1.add(p);
        list1.add(p1);

        e.setProjects(list1);
        p1.setEmps(list);


        Session s=factory.openSession();
        Transaction tx=s.beginTransaction();

        s.persist(e);
        s.persist(e1);
        s.persist(p);
        s.persist(p1);

tx.commit();
        factory.close();
    }
}
