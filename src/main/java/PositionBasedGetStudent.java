import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PositionBasedGetStudent 
{
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager manager = entityManagerFactory.createEntityManager();
		
	
		
		String jpql = "Select s from Student s where s.age>?1";
		
		Query q  = manager.createQuery(jpql);
		
		q.setParameter(1, 10);
		
		List<Student> ls = q.getResultList();
		
		for (Student student : ls) 
		{
			System.out.println("Id:"+student.getId());
			System.out.println("Name:"+student.getName());
			System.out.println("Age:"+student.getAge());
			System.out.println("---------------------------");
			
		}
		
	
	}
}
