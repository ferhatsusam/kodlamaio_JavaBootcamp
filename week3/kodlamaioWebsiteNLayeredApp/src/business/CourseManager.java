package business;
import core.Logger;
import dataAccess.CourseDao;
import entities.Course;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {

        if (course.getCoursePrice() < 0)
            throw new Exception("Course price can't be less than 0");

        for (Course c : courses) {
            if (c.getCourseName().equals(c.getCourseName()))
                throw new Exception("Course information can't be the same");
        }

        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers)
            logger.log(course.getCourseName());

    }
}
