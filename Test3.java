class Shape
{
	private int x,y,w,h;

	

	
	

	public Shape(int x,int y,int w,int h)
	{
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}

	

	public Shape(int w,int h)
	{
		this(1,1,0,0);
	}

	public Shape()
	{
		this(1,1,2,2);
	}

	public String toString()
	{
		String det="x:"+this.x+"\n"+"y:"+this.y+"\n"+"w:"+this.w+"\n"+"h:"+this.h;
		return det;
	}
}

class Test3
{
	public static void main(String [] args)
	{
		Shape s=new Shape(2,3,4,3);
		Shape s1=new Shape();
		Shape s2=new Shape(3,3);
		System.out.print(s);
		System.out.print(s1);
		System.out.print(s2);
	}
}