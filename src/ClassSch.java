/**
 * Class for subjects which are graded,contains name of class and profesors name
 * @author nedimomerovic
 *for future - needs a diferent class for profesor who graded,does't need to be the same 
 */
public class ClassSch {
	String NameClass;
	String NameProf;

	/**
	 * @return the nameClass
	 */
	public String getNameClass() {
		return NameClass;
	}

	/**
	 * @param nameClass
	 *            the nameClass to set
	 */
	public void setNameClass(String nameClass) {
		NameClass = nameClass;
	}

	/**
	 * @return the nameProf
	 */
	public String getNameProf() {
		return NameProf;
	}

	/**
	 * @param nameProf
	 *            the nameProf to set
	 */
	public void setNameProf(String nameProf) {
		NameProf = nameProf;
	}

	public ClassSch(String nameClassInp, String nameProfInp) {// constructor
		NameClass = nameClassInp;
		NameProf = nameProfInp;
	}

}
