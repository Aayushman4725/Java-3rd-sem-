import java.io.*;

class Sample2
{
    public static void main(String [] args) 
    {
        try
        {
            FileInputStream fis = new FileInputStream("asar.mp3");
            FileOutputStream fos = new FileOutputStream("Copy.mp3");
            int data;

            while((data=fis.read())!=-1)
            {
                fos.write(data);
            }
            fos.close();
            fis.close();
        }catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}