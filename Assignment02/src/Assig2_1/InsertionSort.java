 package Assig2_1;
 import java.util.Scanner;
//1  3 2 5 4
public class InsertionSort {
	public static void insertionSort(int arr[]) {
		int comparisons=0;
		System.out.println("Array before sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			int j=i-1;
			for(;j>=0;j--) 
			{
				comparisons++;
				if(arr[j] > temp) {
					
					arr[j+1] = arr[j];
				}
				else {
					break;
				}
			}
			arr[j+1] =temp;
		}
		System.out.println("Number of Comparisons required: "+comparisons);

		System.out.println("Array after sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {20,10,50,30,40};
		insertionSort(arr);
	}

}
