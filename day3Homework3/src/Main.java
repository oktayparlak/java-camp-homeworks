import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EMailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.category.CategoryDao;
import dataAccess.category.HibernateCategoryDao;
import dataAccess.category.JdbcCategoryDao;
import dataAccess.course.CourseDao;
import dataAccess.course.HibernateCourseDao;
import dataAccess.course.JdbcCourseDao;
import dataAccess.instructor.HibernateInstructorDao;
import dataAccess.instructor.InstructorDao;
import dataAccess.instructor.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = {new DatabaseLogger(), new EMailLogger(), new FileLogger()};

        //Category
        Category category1 = new Category(1, "front-end");

        CategoryDao[] categoryDaos = {new HibernateCategoryDao(), new JdbcCategoryDao()};

        CategoryManager categoryManager = new CategoryManager(categoryDaos, loggers);
        categoryManager.add(category1);

        System.out.println("**********************************************");
        //Course
        Course course2 = new Course(2, "javascript", 500);

        CourseDao[] courseDaos = {new HibernateCourseDao(), new JdbcCourseDao()};

        CourseManager courseManager = new CourseManager(courseDaos, loggers);
        courseManager.add(course2);

        System.out.println("**********************************************");
        //Instructor
        Instructor instructor3 = new Instructor(3, "Engin", "Demiroğ");

        InstructorDao[] instructorDaos = {new HibernateInstructorDao(), new JdbcInstructorDao()};

        InstructorManager instructorManager = new InstructorManager(instructorDaos, loggers);
        instructorManager.add(instructor3);


    }
}