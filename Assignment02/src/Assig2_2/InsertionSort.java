package Assig2_2;
import java.util.*;
//Sort array in descending order
public class InsertionSort {
	public static void insertionSort(int arr[]) {
		System.out.print("Array before sort: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i-1;
			for(;j>=0;j--) {
				if(arr[j] < temp) {
					arr[j+1] = arr[j];
				}
				else 
				{
					break;
				}
			}
			arr[j+1] = temp;
		}
		System.out.println();
		System.out.print("Array After sort: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,50,30,20,40};
		insertionSort(arr);
	}

}
