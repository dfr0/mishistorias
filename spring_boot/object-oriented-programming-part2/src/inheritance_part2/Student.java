package inheritance_part2;

public class Student {
		private String college;
		private String clase;
		
		public Student(String college, String clase) {
			this.college = college;
			this.clase = clase;
			
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public String getClase() {
			return clase;
		}
		public void setClase(String clase) {
			this.clase = clase;
		}
		
		public String toString () {
			return "The student of " + college + " belongs to class " + clase;
		}
		
}
