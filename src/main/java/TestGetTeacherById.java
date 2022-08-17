import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetTeacherById {

	public static void main(String[] args)

	{

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		Teacher teacher = manager.find(Teacher.class, 5);

		if (teacher != null) {

			System.out.println(teacher);

		} else {
			System.out.println("Data not found");
		}
	}

}
