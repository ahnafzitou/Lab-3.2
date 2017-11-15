
public class ArrayMethods2 {
	public static void main (String args[]) 
	{
		String[] temp1 = {"apple","banana","cat","dog","elephant"};
		String[] temp2 = {"cat","corgi","for","my","young","zebra"};
		printArray(merge(temp1, temp2));
	}
	public static String[] merge(String[] list1, String[]list2) 
	{
		String[] merged = new String[list1.length + list2.length];
		for(int j = 0; j < list1.length; j++){
			for(int k = j; k < list2.length; k++){
				for(int i = 0; i < (list1.length + list2.length); i++){
					if(list1[j].substring(0, 1).compareTo(list2[k].substring(0, 1)) > 0) {
						merged[i] = list1[j];
				}
					if(list1[j].substring(0, 1).compareTo(list2[k].substring(0, 1)) < 0) {
						merged[i] = list2[k];
				}
				merged[i]= list1[j];
			}
		}
	}
		return merged;
	}
	public static String[] mergeSort(String[] list)
	{
		return null;
	}
	public static int partition(int[] list)
	{
		return 0;
	}
	public 	static int[] copyArray(int[] intArray)
	{
		int[] copy = new int[intArray.length];
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
