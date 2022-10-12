package business;

import core.logging.Logger;
import dataAccess.EducatorDao;
import entities.Educator;

public class EducatorManager {
    private EducatorDao educatorDao;
    private Logger[] loggers;

    public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }
    public void add(Educator educator){
        educatorDao.add(educator);
        for (Logger logger:loggers){
            logger.log("Eğitmen eklendi : "+ educator.getName());
        }
    }
}
