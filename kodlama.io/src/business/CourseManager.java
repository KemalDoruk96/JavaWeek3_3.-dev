package business;

import core.logging.Logger;
import dataBaseAccess.HibernateDao;
import entites.Course;


public class CourseManager {
	
	private HibernateDao hibernateDao;
	private Logger[] loggers;
	
	public CourseManager(HibernateDao hibernateDao,Logger[] loggers) {
		this.hibernateDao=hibernateDao;
		this.loggers=loggers;
		
		
	}
	
	public void add(Course course) throws Exception {
		Course[] courses = {new Course(1,"Programlama","Java",10),new Course(1,"Programlama","C#",10)};
		for(Course c :courses) {
		
		if(course.getName()==c.getName() ) {
			throw new Exception("Kursu ismi mevcut");
			
		}
		
		if(course.getFiyat() < 0) {
			throw new Exception("Fiyat 0'dan küçük olamaz");
		}
		
		
	 hibernateDao.AddCourse(course);
	 
	 for(Logger logger:loggers) {
		 
		 logger.log(course.getName());
	 }
			
	}
		
		
		
		
		
	}

}
