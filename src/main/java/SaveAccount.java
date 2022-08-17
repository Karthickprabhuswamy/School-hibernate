import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveAccount {
	
	public static void main(String[] args) 
	{
		
		
		BankAccount account = new BankAccount();
		
		account.setName("Kishore P");
		account.setAddress("ITPL-Branch");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager manager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = manager.getTransaction();
		
		entityTransaction.begin();
		
		manager.persist(account);
		
		entityTransaction.commit();
		
		System.out.println("Data Stored");
		
	}

}
