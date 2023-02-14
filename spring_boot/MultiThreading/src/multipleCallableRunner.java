import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class multipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"),
				new CallableTask("Ragnagagna"),new CallableTask("PericoPalotes"));
		
		//put the list of task in a list
		List<Future<String>> results = executorService.invokeAll(tasks);
		
		//show the results
		for(Future<String> result:results) {
			 System.out.println(result.get());
		}
		
		executorService.shutdown(); 
		
	}

}
