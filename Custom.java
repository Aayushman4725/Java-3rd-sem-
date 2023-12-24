class SemesterException extends Exception
{
    public SemesterException(String msg)
    {
        super(msg);
    }
}

class Student
{
    String name;
    int sem;

    public Student(String name,int sem)throws SemesterException
    {
        if(sem<1 || sem>8)
        {
            System.out.println("Invalid semester:");
        }

        this.name = name;
        this.sem = sem;
    }
}

class Custom
{
    public static void main(String [] args)
    {
        try
        {
            Student s= new Student("Aayushman",9);
        }catch(SemesterException e)
        {
            System.out.println("e.getMessage()");
        }
    }
}