package abstracts;

public abstract class AbstractRecipe {
			//prepare
			//recipe 
			//cleanup
			public void execute() {
				getReady();
				doTheDish();
				cleanup();
			}
			
			abstract void getReady();
			abstract void doTheDish();
			abstract void cleanup();
}
