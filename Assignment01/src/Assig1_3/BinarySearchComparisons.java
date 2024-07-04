package Assig1_3;
import java.util.Scanner;
public class BinarySearchComparisons {
	
	public static int binarySearch(int arr[],int key) {
		int left=0;
		int right = arr.length - 1;
		int comparison=0;
		int mid = (left + right)/2;
	
		while(left<=right) {
			
			if(arr[mid] == key) {
				comparison++;
				return comparison;
			}
			else if(key > arr[mid]) {
				right = mid - 1;
			}
			else {
				left = mid +1;
			}
			mid = (left+right)/2;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int arr[] = {10,20,30,40,50,60,70,80,90,100};//
		int arr[] = {100,90,80,70,60,50,40,30,20,10};

		System.out.println("Enter a key want to find: ");
		int key = sc.nextInt();
		
		int result = binarySearch(arr, key);
		System.out.println("Number of comparison requied: "+result);
		
		
	}

}
