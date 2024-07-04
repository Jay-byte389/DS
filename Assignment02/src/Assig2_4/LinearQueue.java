package Assig2_4;
import java.util.Scanner;

class Queue{
	private int arr[];
	private final int SIZE;
	private int front;
	private int rear;
	
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front=rear=-1;
	}
	
	public void push(int element) {
		arr[rear++] = element;
	}
	
	public int pop() {
		int value = arr[front+1];
		front++;
		return value;
	}
	
	public int peek() {
		return arr[front];
	}
	public boolean isEmpty() {
		return front == rear;
	}
	public boolean isFull() {
		return rear == SIZE-1;
	}
	public void display() {
	for(int i=0;i<SIZE;i++) {
		
	}
}
}
public class LinearQueue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack: ");
		int size = sc.nextInt();
		Queue queue = new Queue(size);
		
		int choice;
		do {
			System.out.println("0.Exit\n1.Push\n2.Pop\n3.Peek\n4.Is Empty?\n5.Is Full\n6.Display stack");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 0:
				System.out.println("Dhanyawad! Ya parat :)");
				break;
			case 1:
				if(queue.isFull()) {
					System.out.println("Stack is full.");
				}
				else {
					System.out.println("Enter element want to push: ");
					int element = sc.nextInt();
					queue.push(element);
				}
				
				break;
			case 2:
				if(queue.isEmpty()) {
					System.out.println("Stack is Empty.");
				}
				else {
					int popedEle = queue.pop();
					System.out.println("Popped element is "+popedEle);
				}
			
				break;
			case 3:
				System.out.println("Peek element is "+queue.peek());
				break;
			case 4:
				if(queue.isEmpty()) {					
					System.out.println("Stack is empty.");
				}
				else {
					System.out.println("Queue is not empty");
				}
				break;
			case 5:
				if(queue.isFull()) {
					System.out.println("Queue is full.");
				}
				else {
					System.out.println("Queue is not full.");
				}
				break;
			case 6:
				queue.display();
				break;

			default: 
				System.out.println("Enter correct choice!!!");
				break;
			}
		}while(choice!=0);
	}
	}

