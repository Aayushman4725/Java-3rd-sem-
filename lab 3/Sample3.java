import java.util.*;
import java.io.*;


class Sample3
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        
        try
        {
            System.out.println("Enter a message:");
            String msg=scan.nextLine();
            FileOutputStream fos = new FileOutputStream("sample.txt");
            FileInputStream fis = new FileInputStream("sample.txt");
            byte [] b=msg.getBytes();
            fos.write(b);
            fos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}