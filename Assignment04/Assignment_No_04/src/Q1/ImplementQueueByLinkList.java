package Q1;

public class ImplementQueueByLinkList {
	public class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data=value;
			next=null;
		}
	}
	
	private Node head;
	public ImplementQueueByLinkList()
	{
		head=null;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty())
		{
			head=newnode;
		}
		else
		{
			Node trav = head;
			while(trav.next!=null)
			{
				trav=trav.next;
			}
			
			trav.next=newnode;
			
		}
		
	}
	
	public void display()
	{
		Node trav = head;
		System.out.print("Queue :");
		while(trav!=null)
		{
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println();
	}
	
	public void deleteLast()
	{
		Node trav =head;
		while(trav.next.next!=null)
		{
			trav=trav.next;
		}
		trav.next=null;
	}
	public static void main(String[] args) {
		ImplementQueueByLinkList l= new ImplementQueueByLinkList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.display();
		l.deleteLast();
		l.display();

	}

}
