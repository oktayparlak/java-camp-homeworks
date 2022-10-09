package dataAccess.course;

import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " jdbc ile eklendi!");
    }
}
