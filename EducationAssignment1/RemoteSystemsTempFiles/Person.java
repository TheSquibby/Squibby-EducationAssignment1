import java.util.*;
import java.util.ArrayList;

package Oregon;

/**
 * @author Squibby
 * This Class Hold the demographic information for the student 
 * and employee classes to pull from
 */
public class Person {

	private String fName, lName, Street, City, State, ZipCode, Phone;
	private int ID, Age;
	private boolean isStudent, isEmployee;
	
	public Person(String PersonfName, String PersonlName, String PersonStreet, String PersonCity, 
		String PersonState, String PersonZipCode, String PersonPhone, int PersonID, int PersonAge, 
		boolean PersonisStudent, boolean PersonisEmployee) {

		fName = PersonfName;
		lName = PersonlName;
		Street = PersonStreet;
		City = PersonCity;
		State = PersonState;
		ZipCode = PersonZipCode;
		Phone = PersonPhone;
		ID = PersonID;
		isStudent = false;
		isEmployee = false;
	}

	private String getfName() {
		return this.fName;
	}
	
	public String setfName(){
		set this.fName;
	}
}
