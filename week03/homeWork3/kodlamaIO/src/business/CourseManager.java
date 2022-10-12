package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;

public class CourseManager {
    private ArrayList<String> availableCourses = new ArrayList<String>();
    private CourseDao courseDao;
    private Logger[] loggers;
    public CourseManager(CourseDao courseDao, Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;
    }
    public void add(Course course) throws Exception{
        if (course.getPrice()<0){
            throw new Exception("Kurs fiyatı 0 TL'den daha az olamaz");
        }
        if (availableCourses.contains(course.getName())){
            throw new Exception("Bu isimde bir kurs zaten mevcut");
        }
        availableCourses.add(course.getName());
        courseDao.add(course);
        for (Logger logger:loggers){
            logger.log("Yeni kurs eklendi : "+course.getName());
        }
    }
}
