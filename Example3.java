import java.util.*;
class Example3
{
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		int []arr=new int[5];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element"+i);
            arr[i]=scan.nextInt();
		}

        // for(int i:arr)
        // {
        //     System.out.println(" "+i+" ");
        // }
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter index to delete:");
        int index=scan.nextInt();

      
        arr=removeIndex(arr,index);
        System.out.println(Arrays.toString(arr));
	}	

    public static int [] removeIndex(int [] arr,int index)
    {
       if(arr==null || index<0 || index>=arr.length)
       {
        return arr;
       } 

       int [] cpy=new int[arr.length-1];

       for(int i=0,j=0;i<arr.length;i++)
       {
        if(index==i)
        {
            continue;
        }

        cpy[j]=arr[i];
        j++;
       } 
      return cpy; 
    }
}