package addon;

public class frontrear {
	
	    private int[] queue;
	    private int front;
	    private int rear;
	    private int capacity;
	    private int size;

	    
	    public frontrear(int capacity) {
	        this.capacity = capacity;
	        queue = new int[capacity];
	        front = 0;
	        rear = -1;
	        size = 0;
	    }

	   
	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue " + item);
	            return;
	        }
	        rear = (rear + 1) % capacity; // Circular increment
	        queue[rear] = item;
	        size++;
	        System.out.println("Enqueued: " + item);
	    }

	   
	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;
	        }
	        int item = queue[front];
	        front = (front + 1) % capacity; 
	        size--;
	        System.out.println("Dequeued: " + item);
	        return item;
	    }

	  
	    public boolean isEmpty() {
	        return size == 0;
	    }

	   
	    public boolean isFull() {
	        return size == capacity;
	    }

	   
	    public int getSize() {
	        return size;
	    }

	    
	    public void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Queue elements: ");
	        for (int i = 0; i < size; i++) {
	            System.out.print(queue[(front + i) % capacity] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        frontrear queue = new frontrear(5);

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.enqueue(50);
	        queue.display();

	        queue.dequeue();
	        queue.dequeue();
	        queue.display();

	        queue.enqueue(60);
	        queue.display();
	    }
	}


