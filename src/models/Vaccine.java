package models;

public class Vaccine {
	
	private int vaccineId;
	private String name;
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
