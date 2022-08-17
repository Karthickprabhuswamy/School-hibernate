import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentById {
	public static void main(String[] args) 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = factory.createEntityManager();

		Student student = manager.find(Student.class, 4);

		if (student != null) 
		{
			System.out.println(student);
			
		} else {
			System.out.println("Data Not found");
		}

	}
}
