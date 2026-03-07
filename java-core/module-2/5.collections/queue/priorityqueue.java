
import java.util.PriorityQueue;
import java.util.Queue;
public class priorityqueue {
    /*
    PriorityQueue :
	It is an implementation class of Queue interface
	It is present inside java.util package
	It was introduced in JDK 1.5	
	It follows priority-based ordering, not insertion order
	By default, it follows Min-Heap (smallest element has highest priority)
	Elements are retrieved using FIFO based on priority, not on insertion time
	It does not allow null elements
	It allows duplicate elements
	It cn store only same type of objects.
	It is internally implemented using Heap data structure
	It is used to perform priority-based queue operations
	
Heap Data Structure :
	It is a non-linear data structure
	It follows Complete Binary Tree property
	
	Heap is of two types : 
		Min-Heap : Parent node value is smaller than or equal to its child nodes
		Max-Heap : Parent node value is greater than or equal to its child nodes
    */


	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(10);
		pq.offer(15);
		pq.offer(26);
		pq.offer(7);
		pq.offer(13);
		pq.offer(10);
		pq.offer(14);
//		pq.offer(null); NullPointerException
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
	}
}

