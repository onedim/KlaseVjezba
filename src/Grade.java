/**
 * Class Grade contains single grade,name of student,classneme where he should get his grade 
 * @author nedimomerovic
 *for future implementation - needs date of grading
 */
public class Grade {
	int singleGrade;
	Student student;
	ClassSch classgrade;
	
	public Grade (int singleGradeInp,Student studentInp,ClassSch classgradeInp){//constructor
		singleGrade=singleGradeInp;
		student=studentInp;
		classgrade=classgradeInp;
		
	}
	
	
	/**
	 * @return the singleGrade
	 */
	public int getSingleGrade() {
		return singleGrade;
	}
	/**
	 * @param singleGrade the singleGrade to set
	 */
	public void setSingleGrade(int singleGrade) {
		this.singleGrade = singleGrade;
	}
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}
	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	/**
	 * @return the classgrade
	 */
	public ClassSch getClassgrade() {
		return classgrade;
	}
	/**
	 * @param classgrade the classgrade to set
	 */
	public void setClassgrade(ClassSch classgrade) {
		this.classgrade = classgrade;
	}

	

}
