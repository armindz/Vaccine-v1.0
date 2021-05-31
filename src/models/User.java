package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User {
	
	@Id
	@Column (name="id")
	private int userId;
	@Column (name="name")
	private String name;
	@Column (name="surname")
	private String surname;
	@Column (name="jmbg")
	private int JMBG;
	@OneToMany
	@JoinColumn (name="vaccine_ID", referencedColumnName="vaccine_id")
	private Vaccine vaccine;
	@Column (name="is_vaccinated")
	private boolean isVaccinated;
	
	
	public User (int userId, String name, String surname, int JMBG, Vaccine vaccine, boolean isVaccinated) {
		
		this.userId = userId;
		this.name = name;
		this.surname = surname;
		this.JMBG = JMBG;
		this.vaccine = vaccine;
		this.isVaccinated = isVaccinated;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public Vaccine getVaccine() {
		return vaccine;
	}


	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getJMBG() {
		return JMBG;
	}


	public void setJMBG(int jMBG) {
		JMBG = jMBG;
	}


	public boolean isVaccinated() {
		return isVaccinated;
	}


	public void setVaccinated(boolean isVaccinated) {
		this.isVaccinated = isVaccinated;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", surname=" + surname + ", JMBG=" + JMBG + ", vaccine="
				+ vaccine + ", isVaccinated=" + isVaccinated + "]";
	}

	
}
