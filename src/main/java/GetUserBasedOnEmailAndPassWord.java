import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetUserBasedOnEmailAndPassWord {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = entityManagerFactory.createEntityManager();

		String jpql = "Select s from User s where s.email=?1 and s.password=?2";

		Query q = manager.createQuery(jpql);

		q.setParameter(1, "Pinky@mail.com");
		q.setParameter(2, "Pinky@123");

		List<User> us = q.getResultList();

		for (User user : us) {
			System.out.println("Id:" + user.getId());
			System.out.println("Name:" + user.getName());
			System.out.println("Email" + user.getEmail());
			System.out.println("PassWord" + user.getPassword());
			System.out.println("Phone Number:" + user.getPhone());
			System.out.println("---------------------------");

		}

	}

}
