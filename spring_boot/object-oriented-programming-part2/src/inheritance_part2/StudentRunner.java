package inheritance_part2;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("colegio mayor", "3B");
		Employee employee = new Employee();
		employee.setTitle("Jefe proyecto");
		employee.setCollege("Universidad de la vida");
				
		System.out.println(student);
		System.out.println(employee);
		
	}

}
