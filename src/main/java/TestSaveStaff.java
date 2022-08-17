import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveStaff {
	public static void main(String[] args) 
	
	{
		Staff  staff = new Staff();
		
		LocalDate date = LocalDate.of(1997, 12, 027);
		
		LocalTime time =  LocalTime.of(12, 25, 23);
		
		LocalDateTime  date1 = LocalDateTime.of(2007, 10, 23, 10, 30);
	
		staff.setName("Sudharani");
		staff.setDateofjoin(date1);
		staff.setBirthtime(time);
		staff.setBirthdate(date);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		
		EntityManager manager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = manager.getTransaction();
		
		entityTransaction.begin();
		
		manager.persist(staff);
		
		entityTransaction.commit();
		
		System.out.println("data saved");
		
	}
	
	
    

}
