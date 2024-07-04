package Assig1_9;
import java.util.Scanner;
public class SelectionSort {
	public static void selectionSort(int arr[]) {
		System.out.println("Array before sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		int comp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j< arr.length;j++) {
				comp++;
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("No of comparisons are "+comp);
		System.out.println("Array after sorting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {10,30,50,20,40,70,50};
		selectionSort(arr);
		
	}

}
