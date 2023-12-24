import java.io.*;

class Address
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileInputStream fis = new FileInputStream("sample.txt");
        DataInputStream dis = new DataInputStream(fis);

        while(dis.available()>0)
        {
            String name=dis.readUTF();
            String address=dis.readUTF();
            float salary=dis.readFloat();

            if(address.equalsIgnoreCase("Kathmandu"))
            {
                System.out.println("Name:\t"+ name + "\nAddress:\t"+ address+ "\nSalary:\t"+ salary);
            }
        }

        dis.close();
        fis.close();
    }
}