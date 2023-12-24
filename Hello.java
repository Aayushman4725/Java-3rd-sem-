class Hello
{
  public static void main(String [] args)
   {
      for(int i=1;i<=50;i++)
		{
			
		     if(i%3==0 && i%5==0)
			{
				System.out.println("Aayushman Amatya");
			}
			else if(i%3==0)
			{		
			  System.out.println("Three");
			}

			

			else if(i%5==0)
			{
				System.out.println("Five");
			}

			else
			{
				System.out.println(i);
			}
		}
   }
}