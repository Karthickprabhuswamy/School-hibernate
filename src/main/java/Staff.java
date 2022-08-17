import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	private LocalDateTime dateofjoin;
	private LocalTime birthtime;
	private LocalDate birthdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDateofjoin() {
		return dateofjoin;
	}

	public void setDateofjoin(LocalDateTime dateofjoin) {
		this.dateofjoin = dateofjoin;
	}

	public LocalTime getBirthtime() {
		return birthtime;
	}

	public void setBirthtime(LocalTime birthtime) {
		this.birthtime = birthtime;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

}
