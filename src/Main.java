import management.UserManagement;
import management.VaccineManagement;

public class Main {

	public static void main(String[] args) {
	/*	VaccineManagement vaccineMg = new VaccineManagement();
		vaccineMg.createVaccine("Astra", "Bosnia");

		*/
		UserManagement userMg = new UserManagement();
		userMg.createUser("Armin", "Dzibric", 2002997180070L, 0, false);
	}

}
