import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacherByName {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Teacher teacher = new Teacher();

		teacher.setId(1);
		teacher.setName("Sudharani T");
		teacher.setEmail("Sudha71@gmail.com");
		teacher.setPhone(9916345461l);

		transaction.begin();

		manager.merge(teacher);

		transaction.commit();

		System.out.println("----------Data Updated----------");
	}

}
