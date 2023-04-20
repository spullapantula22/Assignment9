
interface Stack1{
	
	public void push(Object ob);
	public Object pop();
    public Object peek();
    public boolean isEmpty();
    public int size();
}

public class LinkedList implements Stack1 {
	
	int size = 0;
	Node head;
	
	class Node{
		
		Node next;
		Object val;
		
		Node(Object val){
			
			this.val = val;
		}
	}

	@Override
	public void push(Object ob) {
		
		Node newnode = new Node(ob);
		
		if(head == null) {
			
			head = newnode;
		}
		
		else {
			newnode.next = head;
			head = newnode;
		}
		
		size++;
	}
	
	@Override
	public Object pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		
		else {
			
			head = head.next;
			size--;
			
			return head.val;
		}
	}

	@Override
	public Object peek() {
		
		if(isEmpty()) return null;
		
		else {
			return head.val;
		}
				
		
	}
	
	@Override
	public boolean isEmpty() {
		return (head == null);
	}

	@Override
	public int size() {
		return size;
	}
	
	public void display() {
		
		Node current = head;
		
		if(current == null) return;
		
		while (current != null) {
        	
            System.out.println(current.val + " ");
            current = current.next;
        }
	}

}
