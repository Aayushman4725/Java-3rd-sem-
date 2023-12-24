class Employee
{
	private String name;
	private int id,monthlySalary;

	public Employee(String name,int id,int mS)
	{
		this.name=name;
		this.id=id;
		this.monthlySalary=mS;
	}

	public int getYearlySalary()
	{
		return monthlySalary*12;
	}

	public String getDetail()
	{
		return "Name:"+this.name+"\n"+"ID:"+this.id+"\n"+"Monthly:"+this.monthlySalary+"\n"+"Annual:"+this.getYearlySalary();
	}
}

class Teacher extends Employee
{
	private int numSub;

	public Teacher(String name,int id,int mS,int numSub)
	{
		super(name,id,mS);
		this.numSub=numSub;
	}

	
	public int getYearlySalary()
	{
		return super.getYearlySalary()+this.numSub*1000;
	}

	public String getDetail()
	{
		return super.getDetail()+"\nNo. of Subject:"+this.numSub;
	}
}

class Test2
{
	public static void main(String [] args)
	{
		Teacher t=new Teacher("Umesh",201,200000,3);
		Employee e=new Employee("Aayushman",201,200000);
	      System.out.println(t.getDetail());
		System.out.println(e.getDetail());
	}	
}