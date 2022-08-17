import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class  CartAccount  {

	@EmbeddedId
	private AccountId acid;
	private String name;
	private String password;
	private String gender;

	public AccountId getAcid() {
		return acid;
	}

	public void setAcid(AccountId acid) {
		this.acid = acid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
