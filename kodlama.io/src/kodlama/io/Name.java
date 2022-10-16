package kodlama.io;
   import business.CategoryManager;
	import business.CourseManager;
	import business.PersonManager;
	import core.logging.DatabaseLogger;
	import core.logging.FıleLogger;
	import core.logging.Logger;
	import core.logging.MailLogger;
	import dataBaseAccess.HibernateDao;
	import entites.Category;
	import entites.Course;
	import entites.Person;
public class Name {
	
	


	public static void main(String[] args) {
        Logger[] loggers = {new DatabaseLogger(),new FıleLogger(),new MailLogger()};
		
		Category category1=new Category(4,"Programlama");
		
		CategoryManager categoryManager = new CategoryManager (new HibernateDao(),loggers);
		categoryManager.Add(category1); 
		
		Course course = new Course(1,"Programlama","Java",9);
		CourseManager courseManager=new CourseManager(new HibernateDao(),loggers);
		courseManager.add(course);
		
		Person person = new Person(1,"Kemal","Doruk");
		PersonManager personManager = new PersonManager(new HibernateDao(),loggers);
		personManager.add(person);

	}

}
