import java.util.*;
import java.io.*;

class Salary
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fos = new FileOutputStream("sample.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        
        Scanner scan=new Scanner(System.in);
        int Count=0;
        while(true)
        {
            System.out.println("Enter name: ");
            String name = scan.next();
            System.out.println("Enter address: ");
            String address = scan.next();
            System.out.println("Enter Salary: ");
            float salary=scan.nextFloat();
            dos.writeUTF(name);
            dos.writeUTF(address);
            dos.writeFloat(salary);
            Count++;

            System.out.println("Type N to exit and press any key to continue");
            String prompt=scan.next();

            if(prompt.toLowerCase().startsWith("n"))
            {
                break;
            }
        }

        System.out.print("Records added:" + Count);
        dos.close();
        fos.close();
    }
}