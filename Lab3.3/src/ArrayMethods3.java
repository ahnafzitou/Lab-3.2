public class ArrayMethods3 {
	public static void main(String args[]){
		int[] temp = {3,6,7,2,1,7,12,11};
		System.out.println(indexOfMin(06, temp));
		String[] temp2 = {"cat","zebra","dog","elephant","elephant",""};
		bubbleSort(temp2);
		printArray(temp2);
		double[] temp3 = {0.1,7.1,4.0,3.2};
		selectionSort(temp3);
		printArray(temp3);
	}
	public static void insertionSort(int[] list1)
	{
		int index = 0;
		for (int i = 0; i < list1.length - 1; i++)
		{
			if (list1[i] > list1[i + 1])
			{
				index = i + 1;
				for (int j = i; j > -1; j--)
				{
					if (list1[index] < list1[j])
					{
						swap(list1, index, j);
						index = j;
					}
				}
			}
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
		for(int i = 0; i < list1.length; i++)
		{
			swap(list1, i, indexOfMin(i, list1));
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
	public static void bubbleSort(String[] list) {
		boolean sorted = false;
		while(!sorted){
			sorted = true;
			for(int i = 0; i < list.length-1; i++) {
				if(list[i].compareTo(list[i+1])>0)
				{
					swap(list, i, i + 1);
					sorted = false;
				}
			}
		}
	}
	public static void printArray(String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	public static void printArray(double[] arr)
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
	public static void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
