package Assig1_6;

import java.util.Scanner;

public class LinearSearch {
public static int linearSearch(int arr[],int key,int occurrence) {
	int index =0;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i] == key) {
			 index = i;
			 count++;
			 if(count == occurrence) {
					System.out.println("Number of Occurences: "+count);
					return index;
				}
			 }
	}
	
	return -1;
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int arr[] = {10,20,30,40,20,50,20,40};
	System.out.println("Enter a key want to search: ");
	int key = sc.nextInt();
	System.out.println("Enter number of occurrence  of "+key+": ");
	int occurrence = sc.nextInt();
	int result = linearSearch(arr, key,occurrence);
	
	System.out.println("Key found at "+result+" index");
}

}

