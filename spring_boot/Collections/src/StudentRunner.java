import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1,Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
	
}

public class StudentRunner {

	public static void main(String[] args) {
		
			List<Student> students = List.of(new Student(1,"David"), new Student(100, "Javier"), new Student(3,"Dionisio"));

			System.out.println(students);
			
			List<Student> studentAl = new ArrayList<>(students);
			
			Collections.sort(studentAl); //we need a comparable interface
			System.out.println("Ascending sorted " + studentAl);
			
			//New sorter method
			Collections.sort(studentAl, new DescendingStudentComparator()); //we need a comparable interface
			System.out.println("Descending sorted " + studentAl);
	}

}
