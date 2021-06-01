package management;

import java.util.ArrayList;

import database.VaccineDb;
import models.Vaccine;

public class VaccineManagement {

	// create vaccine by forwarding vaccine's data
	public void createVaccine(String name, String country) {
		
		
		VaccineDb vaccineDb = new VaccineDb();
		int vaccineId = vaccineDb.generateVaccineId();
		Vaccine vaccine = new Vaccine(vaccineId, name, country);
		vaccineDb.storeVaccine(vaccine);
	}
	
	public Vaccine getVaccineByVaccineID(int vaccineID) {
		
		try {
		VaccineDb vaccineDb = new VaccineDb();
		ArrayList <Vaccine> listOfVaccines = vaccineDb.fetchVaccineDatabase();
		
		for (int i= 0; i < listOfVaccines.size(); i++) {
			if (listOfVaccines.get(i).getVaccineId() == vaccineID) {
				return listOfVaccines.get(i);
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void removeVaccineFromDatabase(Vaccine vaccine) {
		
		try {
			VaccineDb vaccineDb = new VaccineDb();
			vaccineDb.removeVaccine(vaccine);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void removeVaccineFromDatabase(int vaccineId) {
		
		try {
			VaccineDb vaccineDb = new VaccineDb();
			vaccineDb.removeVaccine(getVaccineByVaccineID(vaccineId));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList <Vaccine> getListOfVaccines() {
		
		try {
			VaccineDb vaccineDb = new VaccineDb();
			return vaccineDb.fetchVaccineDatabase();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
