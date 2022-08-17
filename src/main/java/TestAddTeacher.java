import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestAddTeacher {

	public static void main(String[] args) {

		Teacher teacher = new Teacher();

		teacher.setId(2);

		teacher.setName("Pinky");

		teacher.setEmail("Pinky99@gmail.com");

		teacher.setPhone(9988774455l);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		manager.persist(teacher);

		transaction.commit();

		System.out.println("------------Data Saved--------");

	}

}
