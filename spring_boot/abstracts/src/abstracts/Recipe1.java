package abstracts;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("GEt the raw materials");
		System.out.println("GEt the utensils");
		
	}

	@Override
	void doTheDish() {
		System.out.println("Do the dish");
		
	}

	@Override
	void cleanup() {
		System.out.println("Clean the utensils");
		
	}

}
