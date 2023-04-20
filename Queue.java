
public class Queue  {
	
	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	
	public void push(int ob) {
		// TODO Auto-generated method stub
		if(size() == arr.length) resize();
		
		if(front == -1) front++;
		arr[rear++] = ob;
	}
	
	public int dequeue() {
		
		if(isEmpty()) {
			
			System.out.println("Stack is Empty.");
			
			return -1;
		}
		
		int item = arr[front];
		front++;
		
		return item;
	}

	public int peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) return -1;
		
		return arr[front];
	}
	
	public boolean isEmpty() {
		
		return (front == rear || front == -1);
	}

	public int size() {
		return rear - front;
	}
	
	public void resize() {
		
		System.out.println("resizing...");
		
		int len = arr.length;
		int newlen = 2*len;
		
		int temp[] = new int[newlen];
		
		System.arraycopy(arr, 0, temp, 0, len);
		
		arr = temp;
	}
	
	public void display() {
		
		int temp[] = new int[rear-front];
		System.arraycopy(arr, front, temp, 0, rear-front);
		
		for(int m: temp) {
			
			System.out.println(m);
		}
	}

}
