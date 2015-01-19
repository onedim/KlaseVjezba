import java.util.Scanner;

/**
 * Main class for testing and binding program together
 * 
 * @author nedimomerovic
 *
 */

public class GradeList {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Grade[] gradeList = new Grade[3];// new list of grades,needs to be extendable i'm not shure how
		String classname;// variable for name of class subject
		Scanner user_input = new Scanner(System.in);//standard input class
		System.out.println("enter class name for avg");
		classname = user_input.next();//user inputs name of the subject class

		for (int i = 0; i < gradeList.length; i++) {
			System.out.println("enter student name");
			String name = user_input.next();//somehow make this show up only once or make some condition if your gona change the student
			System.out.println("enter student surname");
			String surname = user_input.next();//this too
			System.out.println("enter student ID");
			int studentID = user_input.nextInt();//and this may be store it in a file???
			
			Student s = new Student(name, surname, studentID);//calls student class
			
			//implement date later here
			System.out.println("enter class name");
			String className = user_input.next();
			System.out.println("enter proffesor name");
			String profName = user_input.next();//may be better to automate to insert profesors name from file
			
			ClassSch c = new ClassSch(className, profName);

			System.out.println("enter GRADE ");
			int grade = user_input.nextInt();

			gradeList[i] = new Grade(grade, s, c);//cals Grade class

		}
		/**
		 * cals for averageGrade method outside of main
		 */
		double avgForClass = averageGrade(classname, gradeList); 
		System.out.println("average" + avgForClass);

	}

	/**
	 * Function for calculating the average score of grades in single class,
	 * 
	 * @param classname
	 * @param gradeList
	 * @return
	 */
	public static double averageGrade(String classname, Grade[] gradeList) {
		double avg = 0;
		int count = 0;
		for (int i = 0; i < gradeList.length; i++) {
			if (gradeList[i].getClassgrade().getNameClass().equals(classname)) {
				/**
				 * it should take class grade if it's same class for calculation,I'm not sure if it's correct
 				 * in this instance
				 */
				avg = avg + gradeList[i].getSingleGrade();
				count++;
			}

		}

		avg = avg / count;
		return avg;
	}

}
