import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.DatabaseLogger;
import core.EmailLogger;
import core.FileLogger;
import core.Logger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {


        Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new EmailLogger() };

        Course course1 = new Course(01, "Github", 39);
        Course course2 = new Course(02, "Gitlab", 49);
        List<Course> courses = new ArrayList<Course>();

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
        courseManager.add(course1);
        courseManager.add(course2);

        Category category1 = new Category(1, "Software");
        Category category2 = new Category(2, "Software");
        List<Category> categories = new ArrayList<Category>();

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
        categoryManager.add(category1);
        categoryManager.add(category2);

        Instructor instructor = new Instructor(1, "Engin");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor);


    }
}