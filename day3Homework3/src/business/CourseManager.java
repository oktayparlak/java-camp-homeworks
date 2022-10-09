package business;

import core.logging.Logger;
import dataAccess.course.CourseDao;
import entities.Course;

public class CourseManager {

    private CourseDao[] courseDaos;
    private Logger[] loggers;

    public CourseManager(CourseDao[] courseDaos, Logger[] loggers) {
        this.courseDaos = courseDaos;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0 || course.getCourseName() == "Database") {
            throw new Exception("Kurs ücreti 0'dan küçük olamaz!");
        } else {
            for (CourseDao courseDao : courseDaos) {
                courseDao.add(course);
                for (Logger logger : loggers) {
                    logger.log(course.getCourseName());
                }
            }
        }

    }
}
