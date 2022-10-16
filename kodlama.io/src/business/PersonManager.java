package business;

import core.logging.Logger;
import dataBaseAccess.HibernateDao;
import entites.Person;

public class PersonManager {
	
	private HibernateDao hibernateDao;
	private Logger[] loggers;
	
	public PersonManager(HibernateDao hibernateDao,Logger[] loggers) {
		this.hibernateDao=hibernateDao;
		this.loggers=loggers;
		
	}
	
	public void add(Person person) {
		hibernateDao.AddPerson(person);
		
		for(Logger logger:loggers) {
			
			logger.log(person.getName() + "    " + person.getLastName());
		}
		
	}

}
