package ch3;

public class GradeBook {
	//
	public String courseName;
	public String teacherName;
	
	public GradeBook()
	{
		
	}
	
	public GradeBook( String courseName, String teacherName )
	{
		this.courseName = courseName;
		this.teacherName = teacherName;
	}
	
	public GradeBook( String name )
	{
		courseName = name;
	}
	
	public void setCourseName( String name )
	{
		courseName = name;
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public void setTeacherName( String name )
	{
		teacherName = name;
	}
	
	public String getTeacherName()
	{
		return teacherName;
	}
	
	public void displayMssage()
	{
		System.out.printf( "Welcome to the Grade Book for %s\n", getCourseName() );
		System.out.printf( "This course is presented by: %s\n", getTeacherName() );
	}
}
