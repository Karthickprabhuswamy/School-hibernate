import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestEmbeddeKey {
	
	
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction =  manager.getTransaction();
		
		CartAccount account = new CartAccount();
		
		account.setName("Karthick");
		account.setGender("Male");
		account.setPassword("aB73#$");
		
		AccountId id =  new AccountId();
		
		id.setEmail("Karthick2210");
		id.setPhone(7894561330l);
		
		account.setAcid(id);
		
		entityTransaction.begin();
		
		manager.persist(account);

	    entityTransaction.commit();
	    
	    System.out.println("Data Saved");
		
		
	}

}
