package hibernate.demo;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudent {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();

            //retrieve using createQuery and populating the list
            List<Student> students1 = session.createQuery("from Student").getResultList();

            displayStudents(students1);
            System.out.println("******");

            List<Student> students2 = session.createQuery("from Student s where s.firstName='naruto'").getResultList();
            // can use other such queries as well

            displayStudents(students2);


            session.getTransaction().commit();

            System.out.println("Done");


        }
        finally {
            sessionFactory.close();
        }
    }
    public static void displayStudents(List students)
    {
        for (var tempStudent: students) {
            System.out.println(tempStudent);
        }
    }
}
