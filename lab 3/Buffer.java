import java.io.*;

class Buffer
{
    public static void main(String [] args) 
    {
        try
        {
            FileInputStream fis = new FileInputStream("asar.mp3");
            FileOutputStream fos = new FileOutputStream("Copy2.mp3");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int data;

            while((data=bis.read())!=-1)
            {
                bos.write(data);
            }
            bos.close();
            bis.close();
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