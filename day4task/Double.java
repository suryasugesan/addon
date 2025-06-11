package addon;

 
class Double {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	public void insert(int data)
	{
		Node newnode = new Node(data);
		if(head==null)
		{
			head=newnode;
			newnode. next=null;
			newnode.prev=null;
			
			
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
		Node temp=head;
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
	public static void main(String args[])
	{
		Double d =new Double();
		d.insert(3);
		d.insert(7);
		d.insert(8);
		d.insert(6);
		d.display();
	}
	}
	