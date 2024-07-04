package Q1;

public class ImplementStackByLinkList {

	
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
		public ImplementStackByLinkList()
		{
			head=null;
		}
		
		public boolean isEmpty()
		{
			return head==null;
		}
		
		public void addFirst(int value)
		{
			Node newnode=new Node(value);
		
				newnode.next=head;
				head=newnode;
		}
		
		public void display()
		{
			Node trav= head;
			System.out.print("Stack :");
			while(trav!=null)
			{
				System.out.print(trav.data+" ");
				trav=trav.next;
				
			}
			System.out.println(" ");
		}
		
		public void deleteFirst()
		{
			if(isEmpty())
			{
				return;
			}
			else
			{
				head=head.next;
			}
		}
	
	public static void main(String[] args) 
	{
		ImplementStackByLinkList l = new ImplementStackByLinkList();
		l.addFirst(30);
		l.addFirst(20);
		l.addFirst(10);
		l.display();
		l.deleteFirst();
		l.display();
	}

}
