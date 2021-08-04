package hibernate.demo;

import entities.Instructor;
import entities.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").
                                           addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).
                                           buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {


            session.beginTransaction();
            Instructor instructor=session.get(Instructor.class,2);
            System.out.println("deleting "+instructor);
              //it will also delete the inst-detail object cuz of cascade
            if(instructor!=null)
            session.delete(instructor);

            System.out.println("deleted");

            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            sessionFactory.close();
        }
    }
}
