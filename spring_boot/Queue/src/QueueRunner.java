import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLenghtComparator implements Comparator<String>{

	@Override
	public int compare(String value1,String value2) {
		
		return Integer.compare(value1.length(),value2.length());
		//return Integer.compare(value2.length(),value1.length()); //Reverse the order
	}
		
}

public class QueueRunner {

	public static void main(String[] args) {
		//Queue Arrange in order of processing, for example a to do list.
		//Queue interface extends collections, support all collections methods
		//Queue<String> queue = new PriorityQueue<>();
		Queue<String> queue = new PriorityQueue<>(new StringLenghtComparator()); //Defined a another sort order
		//Retrives the head of the queue if empty, null, each time is called, this consume each element until that empty
		queue.poll();
		queue.offer("Apple");
		System.out.println(queue);
		//By default the Priority is a natural order.
		queue.addAll(List.of("Monkey","Cat","Bear"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
