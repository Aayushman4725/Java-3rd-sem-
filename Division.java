import java.util.*;

class Division
{
    public static void main(String [] args)
    {
        try
         {

            Scanner scan=new Scanner(System.in);
            System.out.println("Enter first int");
            int a=scan.nextInt();
            System.out.println("Enter Second int");
            int b=scan.nextInt();
            int ans=a/b;

            System.out.println(ans);

            
        } catch (ArithmeticException e)
         {
            System.out.println(e.getMessage());
         }catch (InputMismatchException e)
         {
            System.out.println(e.getMessage());
         }finally
         {
            System.out.println("End");
         }
           
    }
}