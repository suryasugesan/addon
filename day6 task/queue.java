package addon;

import java.util.Arrays;

public class queue {
	int arr[]=new int[5];
	int rear;
	int front;
	public queue()
	{
		rear=-1;
		front=-1;
		
	}
	public void enqueue(int num)
	{
		if(rear==4)
		{
			System.out.println("queue spreadout");
		}
		else
		{
			arr[++rear]=num;
		}
	}
	public void dequeue(int num)
	{
		if(front==4)
		{
			System.out.println("empty queue");
			
		}
		else
		{
			arr[++front]=0;
		}
	}
	public void display()
	{
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[])
	{
		queue q= new queue();
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(9);
		q.enqueue(8);
		q.enqueue(7);
		q.dequeue(2);
		q.dequeue(5);
		q.display();
	}
	

}
