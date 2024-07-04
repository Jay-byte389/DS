package Assig3_1;

class List{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public List() {
		head = null;
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	public void addLast(int value) 
	{
		Node newnode = new Node(value);
		if(isEmpty()) {
			head = newnode;
		}
		else 
		{
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newnode;
		}
	}
	
	public void addPosition(int value, int pos) {
		Node newnode = new Node(value);
		
		if(head==null) {
			head = newnode;
		}
		else if(pos <= 1) {
			addFirst(value);	
		}
		else 	
		{
			Node trav = head;
			for(int i=1; i<pos-1 &&trav.next!=null; i++) 
			{
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}
	
	public void deleteFirst()
	{
		if(isEmpty()) {
			return;
		}
		else {
			head = head.next;
		}
	}
	public void deleteLast() {
		if(head == null) {
			return;
		}
		if(head.next == null) {
			head = null;
		}
		else {
			Node trav = head;
			while(trav.next.next!=null) {
				trav = trav.next;
			}
			trav.next = null;
		}
	}
	
	public void deletePosition(int pos) {
		if(head == null) {
			return;
		}
		else if(pos<=1) 
		{
		deleteFirst();	
		}
		else if(head.next == null) {
			head = null;
		}
		else {
			Node trav = head;
			for(int i=1;i<pos-1;i++) {
				trav = trav.next;
			}
			 	trav.next = trav.next.next;
		}
	}
	public void displayList() {
		System.out.println(head.data);
		Node trav = head;
		System.out.print("List :: ");
		while(trav != null) 
		{
			System.out.print(trav.data+" ");
			trav = trav.next;
		}
		System.out.println();
	}
}

public class SinglyLinearLinkedList {
		public static void main(String[] args) {
			List list = new List();
			
			list.addFirst(10);
			
			list.addPosition(40,1 );
			list.addPosition(60,2);
			list.addPosition(10,3);
//			list.addPosition(20,2);
			
//			list.deleteFirst();
//			list.deleteLast();
			list.deletePosition(4);
//			list.addLast(50);
			list.displayList();

			
	}

}
