import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateBankAccount {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");

		EntityManager manager = entityManagerFactory.createEntityManager();

		EntityTransaction entityTransaction = manager.getTransaction();

		BankAccount account = manager.find(BankAccount.class, 1);

		if (account != null) {

			account.setName("SudhaRani-T");

			entityTransaction.begin();

			manager.merge(account);

			entityTransaction.commit();

		} else {
			System.out.println("No Account Found");
		}

	}
}
