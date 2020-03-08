
public class Student extends Person{

	/**
	   A student is represented by the name, birth year, and major.
	   You must enter the class name, instance variable(s), and constructor below
	 */
	private String name;
	private int birthYear;
	private String major;
	
	public Student(String inName, int inBirthYear, String inMajor) {
		super(inName, inBirthYear);
		major = inMajor;
	}


	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	 */
	public String toString()
	{
		return "Student[super=" + super.toString() + ",major=" + major + "]";
	}

}
