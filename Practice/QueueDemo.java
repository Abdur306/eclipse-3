package Practice;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
static String myArray[]= {"ramu","sonu","janu","monu"};

public static void queue_offer(Queue<String>myQueue  ) {
for(int i=0;i<5;i++) {
	myQueue.offer(myArray[i]);
}
}
public static void queue_poll(Queue<String>myQueue) {
System.out.println("size is :"+myQueue.size());
int size=myQueue.size();
for(int i=0;i<5;i++) {
	String elements=myQueue.poll();
	System.out.println(elements);
}
}
	public static void main(String[] args) {
  Queue<String>myQueue=new LinkedList<String>();
  queue_offer(myQueue);
  queue_poll(myQueue); 
	}
	
}

