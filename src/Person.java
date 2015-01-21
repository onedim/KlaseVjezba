/**
 * parent class for student and prof name,surname,dateofbirth,socialID
 * 
 * @author nedimomerovic
 *
 */
public class Person {

	String name;
	String surname;
	int dateOfBirth;
	int socialId;

	public Person(String nameInp, String surnameInp, int dateOfBirthIntint,
			int socialIdInp) {
		name = nameInp;
		surname = surnameInp;
		dateOfBirth = dateOfBirthIntint;
		socialId = socialIdInp;
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

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getSocialId() {
		return socialId;
	}

	public void setSocialId(int socialId) {
		this.socialId = socialId;
	}

}
