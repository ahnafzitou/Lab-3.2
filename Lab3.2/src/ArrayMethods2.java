import java.util.Arrays;

public class ArrayMethods2 {
	public static void main (String args[]) 
	{
		String[] temp1 = {"banana","cat"};
		String[] temp2 = {"ahnaf","corgi","for","my","zebra"};
		printArray(merge(temp1, temp2));
		printArray(mergeSort(temp1));
	}
	public static String[] merge(String[] list1, String[]list2) 
	{
		String[] merged = new String[list1.length + list2.length];
		int count = 0;
		
		int l1 = 0;
		int l2 = 0;
		while(l1 + l2 < merged.length) {
			if(l1 == list1.length)
			{
				for(int i = l2; i < list2.length; i++)
				{
					merged[count] = list2[l2];
					count++;
					l2++;
				}
				break;
			}
			if(l2 == list2.length)
			{
				for(int i = l1; i < list1.length; i++)
				{
					merged[count] = list1[l1];
					count++;
					l1++;
				}
				break;
			}
			if(list1[l1].compareTo(list2[l2]) < 0)
			{
				merged[count] = list1[l1];
				count++;
				l1++;
				continue;
			}
			if(list2[l2].compareTo(list1[l1]) < 0)
			{
				merged[count] = list2[l2];
				count++;
				l2++;
				continue;
			}
			if(list1[l1].compareTo(list2[l2]) == 0)
			{
				merged[count] = list1[l1];
				count++;
				l1++;
				merged[count] = list2[l2];
				count++;
				l2++;
				continue;
			}
		}
		return merged;
	}
	public static void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static String[] mergeSort(String[] list)
	{
		System.out.println("debug"+list.length);
		if(list.length == 1)
		{
			return list;
		}
		else
		{
			list = merge(mergeSort(Arrays.copyOfRange(list, 0, list.length/2)), mergeSort(Arrays.copyOfRange(list, (int) list.length/2, list.length)));
		}
		return list;
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
