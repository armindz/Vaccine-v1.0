package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccines")
public class Vaccine {
	@Id
	@Column(name="vaccine_ID")
	private int vaccineId;
	@Column(name="vaccine_name")
	private String name;
	@Column(name="vaccine_country")
	private String country;
	
	public Vaccine (int vaccineId, String name, String country) {
		
		this.vaccineId = vaccineId;
		this.name = name;
		this.country = country;
		
	}

	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Vaccine [vaccineId=" + vaccineId + ", name=" + name + ", country=" + country + "]";
	}
	
	
}
