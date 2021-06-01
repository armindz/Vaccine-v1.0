package management;

import java.util.ArrayList;

import database.UserDb;
import models.User;
import models.Vaccine;
public class UserManagement {

	
	// create user by forwarding user's data
	public void createUser (String name, String surname, long JMBG, int vaccineId, Boolean isVaccinated) {
		VaccineManagement vaccineMg = new VaccineManagement();
		UserDb userDb = new UserDb();
		Vaccine vaccine = vaccineMg.getVaccineByVaccineID(vaccineId);
		int userID = userDb.generateUserId(); 
		User user = new User(userID, name, surname, JMBG, vaccine, isVaccinated);
		userDb.storeUser(user);
	}
	
	// return user obj by forwarding it's ID
	public User getUserByUserID(int userID) {
		
		try {
			UserDb userDb = new UserDb();
			
			ArrayList <User> listOfUsers = userDb.fetchUserDatabase();
			
			for (int i=0; i<listOfUsers.size(); i++) {
				
				if (listOfUsers.get(i).getUserId() == userID) {
					return listOfUsers.get(i);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// remove user with user obj
	public void removeUserFromDatabase(User user) {
		try {
			UserDb userDb = new UserDb();
			userDb.removeUser(user);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// remove user with userID
	public void removeUserFromDatabase(int userId) {
		try {
			UserDb userDb = new UserDb();
			userDb.removeUser(getUserByUserID(userId));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList <User> getListOfUsers() {
		
		try {
			UserDb userDb = new UserDb();
			return userDb.fetchUserDatabase();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList <User> getListOfVaccinatedUsers() {
		try {
			UserDb userDb = new UserDb();
			ArrayList <User> listOfAllUsers = userDb.fetchUserDatabase();
			ArrayList <User> listOfVaccinatedUsers = new ArrayList<User>();
			
			for(int i=0; i<listOfAllUsers.size(); i++) {
				if(listOfAllUsers.get(i).isVaccinated()) {
					listOfVaccinatedUsers.add(listOfAllUsers.get(i));
				}
			}
			return listOfVaccinatedUsers;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList <User> getListOfNonVaccinatedUsers() {
		try {
			UserDb userDb = new UserDb();
			ArrayList <User> listOfAllUsers = userDb.fetchUserDatabase();
			ArrayList <User> listOfNonVaccinatedUsers = new ArrayList<User>();
			
			for(int i=0; i<listOfAllUsers.size(); i++) {
				if(!listOfAllUsers.get(i).isVaccinated()) {
					listOfNonVaccinatedUsers.add(listOfAllUsers.get(i));
				}
			}
			return listOfNonVaccinatedUsers;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
