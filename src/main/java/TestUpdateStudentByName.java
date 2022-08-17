import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateStudentByName {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Student student = new Student();

		student.setId(1);
		student.setAge(25);
		student.setName("pinky-Monkey");

		transaction.begin();

		manager.merge(student);

		transaction.commit();

		System.out.println("----------Data Updated----------");

	}

}
