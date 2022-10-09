package dataAccess.instructor;

import entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " jdbc ile eklendi!");
    }
}
