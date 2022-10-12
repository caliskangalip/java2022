import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.logging.ConsoleLogger;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.Logger;
import dataAccess.CategoryHibernateDao;
import dataAccess.CourseJdbcDao;
import dataAccess.EducatorHibernateDao;
import entities.Category;
import entities.Course;
import entities.Educator;

public class Main {
    public static void main(String[] args) throws Exception{
        Course course=new Course(1,"Lambada",4999.0);
        Course course1=new Course(2,"Lambada",8999.99);
        Course course2=new Course(3,"Salsa", -5.0);
        CourseManager courseManager=new CourseManager(new CourseJdbcDao(),new Logger[]{new DatabaseLogger(),new ConsoleLogger(),new EmailLogger()});
        courseManager.add(course);
        //courseManager.add(course1); //Kurs ismi tekrar edemez!
        //courseManager.add(course2); //Kurs fiyatı 0'dan az olamaz!

        Category category=new Category(1,"Dans");
        Category category1=new Category(2,"Dans");
        CategoryManager categoryManager=new CategoryManager(new CategoryHibernateDao(),new Logger[]{new EmailLogger(),new ConsoleLogger(),new DatabaseLogger()});
        categoryManager.add(category);
        //categoryManager.add(category1); //Kategori ismi tekrar edemez!

        Educator educator=new Educator(1,"Michael Jackson");
        EducatorManager educatorManager=new EducatorManager(new EducatorHibernateDao(),new Logger[]{new DatabaseLogger(),new ConsoleLogger(), new EmailLogger()});
        educatorManager.add(educator);
    }
}