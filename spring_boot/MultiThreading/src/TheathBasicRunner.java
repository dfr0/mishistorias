//Two kind of forms of create multitheathing:
// extends theats
// implements Runnable

//STATES:
//NEW -> Ready to run but not running yet
//RUNNABLE -> ready to chance of execution
//RUNNING -> the task is running on particular point of time
//BLOCKING/WAITING -> blocked for a external service, a execution of db etc.. or waiting for the dependency of another thread
//TERMINATED/DEAD -> Is when i completed the execution

// for communications betweens theads we need to use a interruptions, can you generated with cntrol+1 add trows declaration

class Task1 extends Thread {
	public void run() {//SIGNATURE
		// Task1
		System.out.print("\nTask1 Starting");
		for(int i =101;i<199;i++) {
			System.out.print(i + "");
		}
		System.out.print("\nTask1 Done");
	
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {//SIGNATURE
		// Task2
		System.out.print("\nTask2 Starting");
		for(int i =201;i<299;i++) {
			System.out.print(i + "");
		}
		System.out.print("\nTask2 Done");
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}

public class TheathBasicRunner {

	public static void main(String[] args) throws InterruptedException { //used to wait
		
		System.out.print("Task1 Kick Off");
		Task1 task1 = new Task1();
		task1.setPriority(10); //set priority, only is a request, not a order, only a hint.
		task1.start(); //task1.run() beginner mistake, not execution like a thread 
		
		System.out.print("Task2 Kick Off");
		Task2 task2 = new Task2();
		Thread task2thread  = new Thread(task2); //Additional instances of thread class
		task2thread.start();
		
		//wait for task1 is completed, we need to use join for that
		task1.join();
		task2thread.join();
		
		//another states of threads
		//Thread.yield(); provides a mechanism to inform the “scheduler” that the current thread is willing to relinquish
		//its current use of processor but it'd like to be scheduled back soon as possible. only a request
		//Thread.sleep(10000); //waiting time for theads in miliseconds
		//and thread syncronize, only one thead would be able to execute that code on instance, all that code that want to
		// execute syncronized code in that specific instance should be wait. 
		
		// Task3
		for(int i =301;i<399;i++) {
			System.out.print(i + "");
		}
		System.out.print("\nTask3 Done");
		System.out.print("\nMain Done");

	}
}
