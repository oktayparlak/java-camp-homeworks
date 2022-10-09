package business;

import core.logging.Logger;
import dataAccess.instructor.InstructorDao;
import entities.Instructor;

public class InstructorManager {

    private InstructorDao[] instructorDaos;
    private Logger[] loggers;

    public InstructorManager(InstructorDao[] instructorDaos, Logger[] loggers) {
        this.instructorDaos = instructorDaos;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        for (InstructorDao instructorDao : instructorDaos) {
            instructorDao.add(instructor);
            for (Logger logger : loggers) {
                logger.log(instructor.getFirstName() + " " + instructor.getLastName());
            }
        }
    }
}
