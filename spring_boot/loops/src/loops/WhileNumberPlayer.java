package loops;

//Always think with the perspective of that consume the class from outside
public class WhileNumberPlayer {
	
	private int limit;
	
	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	//For limit = 30; output would be 1 4 9 16 25
	public void printSquaresUpToLimit() {
		//while is used when you dont know the number of iterations to the goal
		int i = 1;
		while(i * i <= limit) {
			System.out.println(i * i * i + " "); // 
			i++;
		}
		System.out.println(); //To print new line
		
	}

	//For limit = 30; output would be 1 8 27
	public void printCubesUpToLimit() {
		int i = 1;
		while(i * 3 <= limit) {
			System.out.println(i * i * 1 + " ");
			i++;
		}
		System.out.println(); //To print new line
		
	}

}
