
public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList stk = new LinkedList();
		
		Object item;
        stk.push('A'); // push 3 items onto stack
        stk.push('B');
        stk.push('C');
        stk.push('D');

        System.out.println("size(): " + stk.size());
        item = stk.pop(); // delete item
        System.out.println(item + " is deleted");
        stk.push('D'); // add three more items to the stack
        stk.push('E');
        System.out.println(stk.pop() + " is deleted");
        stk.push('G'); // push one item
        item = stk.peek(); // get top item from the stack
        System.out.println(item + " is on top of stack");
        System.out.println("Size of the Stack : " + stk.size());
//        ArrayStack stk1 = new ArrayStack(4);
//        stk1.push("Java");
//        stk1.push(20);
//        stk1.push(30);
		
        stk.display();

	}

}
