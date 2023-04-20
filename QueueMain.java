
public class QueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.push(20);
		q.push(34);
		q.push(50);
		q.push(60);
		q.dequeue();
		
		q.display();
		
		System.out.println(q.size());
		
	}

}
