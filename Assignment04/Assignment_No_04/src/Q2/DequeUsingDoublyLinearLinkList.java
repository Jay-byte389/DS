package Q2;

import java.util.Scanner;

public class DequeUsingDoublyLinearLinkList {

	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value)
		{
			data=value;
			next=prev=null;
		}
	}
	
	private Node tail;
	private Node head;
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode=new Node(value);
		if(isEmpty())
		{
			head=tail=newnode;
		}
		else
		{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;
		}
	}
	
	public void display()
	{
		if(isEmpty())
		{
			return;
		}
		else
		{
			Node trav= head;
			System.out.print("Deque :");
			while(trav!=null)
			{
				System.out.print(trav.data+" ");
				trav=trav.next;
			}
			System.out.println(" ");
		}
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head=tail=newnode;
		}
		else
		{
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.print("Queue is empty");;
		}
		
		else if(head==tail)
		{
			head=tail=null;
		}
		else
		{
			head=head.next;
			head.prev=null;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.print("Queue is empty");
		}
		else if(head==tail)
		{
			head=tail=null;
		}
		else
		{
			tail=tail.prev;
			tail.next=null;
		}
	}
	public static void main(String[] args) {
		DequeUsingDoublyLinearLinkList l = new DequeUsingDoublyLinearLinkList();
		int choice=0;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("0: Exit");
			System.out.println("1: Push at first");
			System.out.println("2: Pop from first");
			System.out.println("3: Push at last");
			System.out.println("4: Pop from last");
			System.out.println("5: Display updated queue");
			System.out.println("Enert choice :");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.print("Thank You");
				break;
			case 1:
				System.out.print("Enter value add first :");
				int value= sc.nextInt();
				l.addFirst(value);
				break;
			case 2:
				l.deleteFirst();
				break;
			case 3:
				System.out.print("Enter value add last :");
				int num= sc.nextInt();
				l.addLast(num);
				break;
			case 4:
				l.deleteLast();
				break;
			case 5:
				l.display();
				break;
			default:
					System.out.print("Invalid choice");
				break;
			}
			
		}while(choice!=0);
		

	}

}
