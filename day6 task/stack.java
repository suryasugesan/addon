package addon;

public class stack {
	int top=-1;
	int mystack[]=new int[5];
	public void push(int data)
	{
		if(top==4)
		{
			System.out.println("stack underflow");
		}
		else
		{
			mystack[++top]=data;
		}
	}
	public void pop()
	{
if(top==-1)
{
	System.out.println("stack underflow");
	
}
else {
	mystack[top]=0;
	top--;
}
	
		
	}
	public void display()
	{
		for(int i=0;i<mystack.length;i++)
		{
			System.out.println(mystack[i]);
		}
	}
	public static void main(String args[])
	{
		stack sc =new stack();
		sc.push(2);
		sc.push(5);
		sc.push(4);
		sc.push(5);
		sc.push(7);
		sc.push(8);
		//sc.pop();
		sc.display();
	}

}
