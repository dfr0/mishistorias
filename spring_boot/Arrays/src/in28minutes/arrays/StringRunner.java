package in28minutes.arrays;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Lunes", "Martes", "Miercoles","Jueves", "Viernes", "Sabado", "Domingo" };
		
		String dayWithTheMostCharacters = ""; //inicialice to empthy
		
		for(String day:daysOfWeek) {
			if(day.length() > dayWithTheMostCharacters.length() ) {
				dayWithTheMostCharacters = day;
			}
		}
		System.out.println("The day with the most characters is " + dayWithTheMostCharacters);
	}

}
