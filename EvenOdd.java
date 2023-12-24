public class EvenOdd {

	// Print array method
	public static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		int n = 10;
		// array with N size
		int array[] = { 2, 5, 4, 9, 7, 6, 3, 1, 0, 8 };

		int evenSize = 0;
		int oddSize = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0)
				evenSize++;
			else
				oddSize++;
		}
		// odd and even arrays with size
		int[] even = new int[evenSize];
		int[] odd = new int[oddSize];
		// odd and even array iterator
		int j = 0, k = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0)
				even[j++] = array[i];
			else
				odd[k++] = array[i];
		}
		// print array method
		System.out.print("Even Array contains: ");
		printArray(even);
		System.out.print("Odd Array contains: ");
		printArray(odd);
	}
}
