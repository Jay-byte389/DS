package Assig1_7;
import java.util.Scanner;
public class NonRepeatingElement {
	public static int nonRepeatingElement(int arr[]) {
		
		for(int i=0;i<arr.length;i++) 
		{
			boolean flag = false;
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[j] == arr[i]) {
					flag =true;
					break;
				}
		}
			if(flag == false) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int arr[] = {1,2,3,-1,2,1,0,4,-1,7,8};
		int result = nonRepeatingElement(arr);
		System.out.println("First non repeating element: "+result);
	}

}
