package inheritance;


//Student is a subclass and Person is a SuperClass
public class Student extends Person Object { //by default java has a class Object that extent all objects
	
		private String collegeName;
		private int year;
		
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		
}
