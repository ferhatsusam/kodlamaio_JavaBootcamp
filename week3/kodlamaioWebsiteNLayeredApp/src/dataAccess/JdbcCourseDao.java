package dataAccess;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("Added to database with jdbc course");
    }
}