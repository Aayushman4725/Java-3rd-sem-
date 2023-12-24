import java.io.*;
class Student implements Serializable{
    String name;
    public Student(String name){
        this.name = name;
    }
    public void print(){
        System.out.println(this.name);
    }
}
class Serial{
    public static void writeobject(Student obj){
        try{
            FileOutputStream fos= new FileOutputStream("obj.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(obj);
            System.out.println("Object written");
            oos.close();
            fos.close();
        }catch(IOException e){
            System.out.println("e.getMessage()");
        }
    }
    public static void readObject(){
        try{
            FileInputStream fis= new FileInputStream("obj.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Student obj =(Student) ois.readObject();
            obj.print();
            ois.close();
            fis.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args){
        Student S= new Student("Akhil");
        writeobject(S);
        readObject();
    }
}