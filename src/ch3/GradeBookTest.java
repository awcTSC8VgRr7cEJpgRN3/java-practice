package ch3;

import java.util.Scanner;

public class GradeBookTest {
	public static void main ( String[] args )
	{
		Scanner input = new Scanner( System.in );
		String nameOfCourse;
		String nameOfTeacher;
		
		GradeBook myGradeBook1, myGradeBook2;
		myGradeBook1 = new GradeBook();
		myGradeBook2 = new GradeBook();
		System.out.printf( "Initial course name is: %s\n\n", myGradeBook1.getCourseName());
		System.out.printf( "Initial course name is: %s\n\n", myGradeBook2.getCourseName());

		System.out.print( "Please enter the course name 1:" );
		nameOfCourse = input.next();
		myGradeBook1.setCourseName( nameOfCourse );
		System.out.print( "Please enter the teacher name 1:" );
		nameOfTeacher = input.nextLine();
		myGradeBook1.setTeacherName( nameOfTeacher );
		
		System.out.print( "Please enter the course name 2:" );
		nameOfCourse = input.nextLine();
		myGradeBook2.setCourseName( nameOfCourse );
		System.out.print( "Please enter the teacher name 2:" );
		nameOfTeacher = input.next();
		myGradeBook2.setTeacherName( nameOfTeacher );
		
		myGradeBook1.displayMssage();
		myGradeBook2.displayMssage();
		/*		
		System.out.println( myGradeBook1.courseName );
		System.out.println( myGradeBook2.courseName );
*/
	}
}
