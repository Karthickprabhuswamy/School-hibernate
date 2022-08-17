import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestAddStudent {

	public static void main(String[] args) {

		Student student = new Student();

		student.setId(6);
		student.setName("Rukmini");
		student.setAge(24);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		transaction.begin();

		manager.persist(student);

		transaction.commit();

		System.out.println("--------Data Saved--------------");

	}

}
