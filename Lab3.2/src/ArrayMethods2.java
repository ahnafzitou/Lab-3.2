
public class ArrayMethods2 {
	public static void main (String args[]) 
	{
		String[] temp1 = {"zebra","banana","cat","dog","elephant"};
		String[] temp2 = {"zebra","bong","my","for","young","zebra"};
		printArray(merge(temp1, temp2));
	}
	public static String[] merge(String[] list1, String[]list2) 
	{
		String[] merged = new String[list1.length + list2.length];
		String[] t1 = copyArray(list1);
		String[] t2 = copyArray(list2);
		for(int i = 0; i < list1.length; i++)
		{
			merged[i] = t1[i];
		}
		for(int n = list1.length; n < merged.length; n++)
		{
			merged[n] = t2[n - list1.length];
		}
		String[] m1 = copyArray(merged);
		boolean condition = false;
		while(!condition)
		{
			for(int l = 0; l < m1.length-1; l++)
			{
				condition = true;
				if(m1[l].compareTo(m1[l+1]) > 0)
				{
					System.out.println("Switching:" +m1[l]+" and "+m1[l+1]);
					String temp = m1[l];
					m1[l] = m1[l + 1];
					m1[l + 1] = temp;
					condition = false;
				}
			}
		}
		return m1;
	}
	public static void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static String[] mergeSort(String[] list)
	{
		return null;
	}
	public static int partition(int[] list)
	{
		return 0;
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
	public static void printArray(String[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	
}
