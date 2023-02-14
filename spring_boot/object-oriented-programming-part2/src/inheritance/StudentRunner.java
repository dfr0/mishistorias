package inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		//Student student = new Student;
		
		//student.getCollegeName();
		
		Person person = new Person();
		String value = person.toString();
		System.out.println(value);
		System.out.println(person); //internaly this is equal than person.toString();
		//this show inheritance.Person#7ad041f3
				
	}

}
