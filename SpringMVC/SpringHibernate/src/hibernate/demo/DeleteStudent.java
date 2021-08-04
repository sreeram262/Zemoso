package hibernate.demo;

import entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();

            //retrieve the object then delete here and then reflect the changes to the database during commit
            Student student=session.get(Student.class,2);
            session.delete(student);

            session.getTransaction().commit();

            // or you can make use of the createQuery
            //new session
            session=sessionFactory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("delete from Student where id=4").executeUpdate();

            // database updated
            session.getTransaction().commit();

            System.out.println("Done");


        }
        finally {
            sessionFactory.close();
        }
    }

}
