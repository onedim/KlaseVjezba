/**
 * Class Student,contains name, surname and student ID number
 * @author nedimomerovic
 * for future - needs to contain more information maybe a parent class Person
 */
public class Student extends Person
{
	String name;
	String surname;
	int studentId;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 * 
	 */
	public void setStudentId(int studentIdinp) {
		studentId = studentIdinp;
	}

	public Student(String nameInp, String surnameinp, int studentIdinp) {//constructor
		name = nameInp;
		surname = surnameinp;
		studentId = studentIdinp;

	}

}
