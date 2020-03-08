
public class Instructor extends Person {

	/**
	   An instructor is represented by a name, a birth year, and a salary.
	   You must enter the class name, instance variable(s), and constructor below
	 */
	private String name;
	private int birthYear;
	private int salary;
	
	public Instructor(String inName, int inBirthYear, int inSalary) {
		super(inName, inBirthYear);
		salary = inSalary;
	}



	/**
	      Returns the string represention of the object.
	      @return a string representation of the object
	 */
	public String toString()
	{
		return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
	}

}
