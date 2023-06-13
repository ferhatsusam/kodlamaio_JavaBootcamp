package dataAccess;
import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    public void add(Instructor instructor) {
        System.out.println("Added to database with jdbc trainer");
    }
}
