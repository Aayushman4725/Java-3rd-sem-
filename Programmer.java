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

class Developer extends Employee
{
	private boolean backend;

	public Developer(String name,int id,int mS,boolean backend)
	{
		super(name,id,mS);
		this.backend=backend;
	}

	
	public int getYearlySalary()
	{
        if(backend==true)
		return super.getYearlySalary()+5000;

        else
        return super.getYearlySalary();
	}

	public String toString()
	{
		return super.getDetail()+"\n Developer:"+(this.backend?"Backend":"Frontend");
	}
}

class Programmer
{
	public static void main(String [] args)
	{
		Developer t=new Developer("Umesh",201,200000,true);
		// Employee e=new Employee("Aayushman",201,200000);
	      System.out.println(t);
		
	}	
}