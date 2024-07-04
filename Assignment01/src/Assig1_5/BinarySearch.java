package Assig1_5;
import java.util.Scanner;
public class BinarySearch {
	public static int binarySearch(int arr[],int key) {
		int left = 0;
		int right = arr.length-1 ;
		int mid;
		while(left<=right) {
			 mid = (left+right)/2;
			 
			if(arr[mid] == key) {
				return mid;
			}
			else if(key > arr[mid]) {
				right = mid -1;	
			}
			else {
				left = mid +1;
			}
		}
		return  -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {100,90,80,70,60,50,40,30,20,10};
		System.out.println("Enter a key want to find: ");
		int key = sc.nextInt();
		int result = binarySearch(arr, key);
		if(result == -1 ) {
			System.out.println("key not found :(");
		}
		else {
			System.out.println("Key found at "+result+" index");
		}
	}

}
