package Assig1_8;
import java.util.*;

public class RankOfElement {
	
	public static int rankOfElement(int arr[],int key) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] <= key) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter a key want to find: ");
		int key = sc.nextInt();
		int result = rankOfElement(arr, key);
		if(result == -1) {
			System.out.println("Element not found :(");
		}
		else {
			System.out.println("Element found having rank "+result);
		}	
	}
}
