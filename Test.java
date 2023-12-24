class Employee
{
	private String name;
	private String post;
	private int salary,age;

	public Employee(String name,String post,int salary,int age)
	{
		this.name=name;
		this.post=post;
		this.salary=salary;
		this.age=age;
	}

	
	public String toString()
	{
		String detail="Name:"+this.name+"\n"+"Post:"+this.post+"\n"+"Salary:"+this.salary+"\n"+"Age:"+this.age;
		return detail;
	}
}

class Test
{
	public static void main(String [] args)
	{
		Employee emp=new Employee("Aayushman","Senior Developer",20000,21);
		System.out.print(emp);
	}
}	