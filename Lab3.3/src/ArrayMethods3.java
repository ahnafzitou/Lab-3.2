public class ArrayMethods3 {
	public static void main(String args[]){
		int[] temp = {3,6,7,2,1,7,12,11};
		System.out.println(indexOfMin(06, temp));
	}
	public static void insertSort(int[] list1){
		int x = list1[0];
		int count = 0;
		int temp = 0;
		boolean sorted = false;
		while(!sorted)		
		{
			sorted = true;
			for(int j = 0; j < list1.length; j++)
			{
				if(x > list1[j])
				{
					sorted = false;
					x = list1[j];
					count = j;
					System.out.println("Min"+list1[count]+"index:"+count);
				}
			}
			swap(list1, temp, count);
			temp++;
			//System.out.println("Switching:"+list1[i] + list1[count]);
			//swap(list1, , count);
		}
	}		
	public static int indexOfMin(int first, int[] list1)
	{
		int temp = list1[first];
		int index = first;
		for(int i  = first; i < list1.length; i++)
		{
			if(temp > list1[i]) {
				temp = list1[i];
				index = i;
			}
		}
		return index;
	}
	public static void selectionSort(double[] list1) {
		int count = 0;
		for(int i = 0; i < list1.length; i++)
		{
			swap(list1, count ,indexOfMin(i, list1));
		}
	}
	public static int indexOfMin(int first, double[] list1)
	{
		double temp = list1[first];
		int index = first;
		for(int i  = first; i < list1.length; i++)
		{
			if(temp > list1[i]) {
				temp = list1[i];
				index = i;
			}
		}
		return index;
	}
	public static void bubbleSort(String[] list1) {
		
	}
	public static void printArray(String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	public static void printArray2(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	public 	static String[] copyArray(String[] intArray)
	{
		String[] copy = new String[intArray.length];
		for(int i = 0; i < intArray.length; i++)
		{
			copy[i] = intArray[i];
		}
		return copy;
	}
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void swap(double[] arr, int i, int j)
	{
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
