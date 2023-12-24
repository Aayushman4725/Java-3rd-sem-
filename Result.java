class Student
{

	private String name;
	private int roll;
	private static String college="NCIT";


	void setName(String name)
	{
		this.name=name;
	}

	void setRoll(int roll)
	{
		this.roll=roll;
	}



	String getCollege()
	{
		return this.college;
	}

	String getName()
	{
		return this.name;
	}

	Integer getRoll()
	{
		return this.roll;
	}
  }


class Result
{
public static void main(String [] args)
 {
	Student s1=new Student();
	s1.setName("Aayushman");
	s1.setRoll(8);
	System.out.println(s1.getName());
	System.out.println(s1.getRoll());
	System.out.println(s1.getCollege());
	
}
}

