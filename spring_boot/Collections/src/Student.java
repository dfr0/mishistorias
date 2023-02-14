
public class Student implements Comparable<Student> { //we will to compare one student with another
		private int id;
		private String name;
		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		//Method to see arrayList not only memory objects
		public String toString() {
			return id + " " + name;
		}
		@Override
		public int compareTo(Student that) {
			return Integer.compare(that.id, this.id);
		}
}
