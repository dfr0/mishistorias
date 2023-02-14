package abstracts;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("GEt the raw materials");
		System.out.println("GSwitch On the Microwave");
		
	}

	@Override
	void doTheDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put in the microwave");
		
	}

	@Override
	void cleanup() {
		System.out.println("Clean the utensils");
		System.out.println("GSwitch OFF the Microwave");
		
	}

}
