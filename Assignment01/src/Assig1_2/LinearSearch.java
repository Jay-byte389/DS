//Algorithm : 
//	1. First iterate through array
//	2. While iterating through array check if current element is equal key then store value of current index in temp variable.
//	3. Follow this process until end of array and after end of iteration return index.


package Assig1_2;
import java.util.Scanner;
public class LinearSearch {
	public static int linearSearch(int arr[],int key) {
		int index =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				 index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,20,50};
		System.out.println("Enter a key want to search: ");
		int key = sc.nextInt();
		int result = linearSearch(arr, key);
		System.out.println("Key found at "+result+" index");
	}

}
