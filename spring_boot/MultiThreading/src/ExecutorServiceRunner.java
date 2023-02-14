import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//another exercice with constructor to create some tasks
class Task extends Thread {
	
	private int number;


	public Task(int number) {
		this.number = number;
	}
	
	
	public void run() {//SIGNATURE
		// Task1
		System.out.print("\nTask " + number + " Starter");
		for(int i =number *100;i<number*100 + 99;i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask " + number + " Done");
	
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		//ExecutorService executorService = Executors.newSingleThreadExecutor(); //provide facilities to execute one thread at time
		
		//To execute some threads at time
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		//executorService.execute(new Task1());
		//or create a new thread to execute task2, only when task1 is complete will execute the task2
		//executorService.execute(new Thread(new Task2()));
		
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		
		//System.out.print("\nTask3 kicked off");
		
		//task3 will be executed in the main method, not follow the order
		//for(int i =301;i<399;i++) {
			//System.out.print(i + "");
		//}
		//System.out.print("\nTask3 Done");
		//System.out.print("\nMain Done");
		
		//Recommended in the last line if not the program continuum running
		executorService.shutdown();
	}

}
