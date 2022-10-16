package dataBaseAccess;

import entites.Category;
import entites.Course;
import entites.Person;

public class HibernateDao extends ProductDuoAbstract implements ProductDuo {

	@Override
	public void Add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi:" + category.getName());
		
	}

	@Override
	public void AddPerson(Person person) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanına eklendi:" + person.getName());
		
	}

	@Override
	public void AddCourse(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Hibernate ile veritabanına eklendi:" + course.getName());
		
	}
	

}
