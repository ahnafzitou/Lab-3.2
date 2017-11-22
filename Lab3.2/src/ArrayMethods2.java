import java.util.Arrays;

public class ArrayMethods2 {
	public static void main (String args[]) 
	{
		String[] temp1 = {"banana","cat"};
		String[] temp2 = {"ahnaf","corgi","for","my","zebra"};
		int[] temp3 = {5,4,6,2,1,13,3};
		printArray(merge(temp1, temp2));
		printArray(mergeSort(temp1));
		partition(temp3);
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
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
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
		int larger = countLarge(list);
		int newPos = (list.length - larger) - 1;
		swap(list,0,newPos);
		for(int  i = 0; i < newPos; i++)
		{
			if(list[i] > list[newPos])
			{
				for(int j = newPos + 1; j < list.length; j++)
				{
					if(list[j] <= list[newPos])
					{
						swap(list, i, j);
					}
				}
			}
		}
		printArray2(list);
		return newPos;
	}
	public static int countLarge(int[] list)
	{
		int count = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[0] < list[i])
			{
				count++;
			}
		}
		return count;
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
	public static void printArray2(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("[" + arr[i] + "]");
		}
		System.out.println();
	}
	
}
