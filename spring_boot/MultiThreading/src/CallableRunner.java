import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	
	private String name;

	public CallableTask(String name) {
		this.name = name;
	}
	
	//create a call method to return some value back
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
		}
}
	
public class CallableRunner {
	
	public static void main(String[] args) throws Exception, ExecutionException{
	
	ExecutorService executorService = Executors.newFixedThreadPool(1);
	Future<String> welcomeFuture = executorService.submit(new CallableTask("in28Minutes")); //can be used to execute a called thing
	System.out.println("\nnew CallableTask(in28Minutes)");
	
	String welcomeMessage = welcomeFuture.get();
	System.out.println(welcomeMessage);
	
	//executed on the end of the main method
	System.out.println("\ncompleted");
	
  }
}
