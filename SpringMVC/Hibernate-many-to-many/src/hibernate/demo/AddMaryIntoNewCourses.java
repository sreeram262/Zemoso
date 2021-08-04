package hibernate.demo;

import entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddMaryIntoNewCourses {
    public static void main(String[] args) {

        //Session Factory
        SessionFactory sessionFactory= new Configuration().configure("hibernate.cfg.xml").
                                           addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).
                                           addAnnotatedClass(Course.class).
                                           addAnnotatedClass(Review.class).
                                           addAnnotatedClass(Student.class).
                                           buildSessionFactory();
        //Session
        Session session=sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();

            // create a course or courses
           Course course1=new Course("Solving rubiks cube");
            Course course2=new Course("Game development");

            //retrieving mary

            Student mary=session.get(Student.class,2);
            //adding mary to the new courses
            course1.addStudents(mary);
            course2.addStudents(mary);

            //save the courses
            System.out.println("saving courses");
            session.save(course1);
            session.save(course2);


            session.getTransaction().commit();
            System.out.println("Done");


        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
