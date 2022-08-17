import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveUser {
	
	public static void main(String[] args) {
		
		
		User user =  new User();
		
		user.setName("Ramya");
		user.setEmail("Ramya@mail.com");
		user.setPassword("Ramya@123");
		user.setPhone(9965321478l);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager manager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = manager.getTransaction();
		
		entityTransaction.begin();
		
		manager.persist(user);
		
		entityTransaction.commit();
		
		System.out.println("Data Stored");
			
	}

}
