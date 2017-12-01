import java.util.Arrays;

public class ArrayMethods4 
{
	public static void main(String args[]){
		int[] arr = {5,1,8,3,9,4,2};
		//printArray2(arr);
		partition(arr,0,6);
		quickSort(arr,0,6);
	}
	public static int partition(int[] list1,int front,int back ){ 
		int pivot = (front+back)/2;
		boolean partition = false;
		while(!partition)
		{
			partition = true;
		
		for(int i = 0; i < pivot; i++)
		{
			
			if(list1[i] > list1[pivot])
			{
				System.out.println("Pivot: "+list1[pivot]);
				System.out.println(i);
				System.out.println(pivot);
				partition = false;
				System.out.println("Switching: "+list1[i]+" "+list1[pivot]);
				swap(list1, pivot, i);
				pivot = i;

			}
			if(i == pivot)
			{
				break;
			}
		}
		for(int j = back; j > pivot; j--)
		{
			
			if(list1[j] < list1[pivot])
			{
				System.out.println("Pivot: "+list1[pivot]);
				System.out.println(j);
				System.out.println(pivot);
				partition = false;

				System.out.println("Switching: "+list1[j]+" "+list1[pivot]);
				swap(list1, pivot, j);
				pivot = j;

			}
			if(j == pivot)
			{
				break;
			}
		}
	}
		printArray2(list1);
		return pivot;
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		if(front==back)
		{
			printArray2(list1);
		}
		else
		{
			int temp1 = partition(Arrays.copyOfRange(list1, front, back/2));
			int temp2 = partition(Arrays.copyOfRange(list1, front/2, back));
		}
	}
	public static int indexOfMin(int[] list)
	{
		int temp = list[0];
		int index = 0;
		for(int i  = 0; i < list.length; i++)
		{
			if(temp > list[i]) {
				temp = list[i];
				index = i;
			}
		}
		return index;
	}
	public static int indexOfMax(int[] list)
	{
		int temp = list[0];
		int index = 0;
		for(int i  = 0; i < list.length; i++)
		{
			if(temp < list[i]) {
				temp = list[i];
				index = i;
			}
		}
		return index;
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
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
