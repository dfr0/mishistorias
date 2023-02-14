
public class Rectangle {
	//state
	private int lengh;
	private int width;
	
	//creation
	public Rectangle(int lengh, int width) {
		this.lengh = lengh;
		this.setWidth(width);
	}
	//operations
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public int area() {
		return lengh * width;
	}
	
	public int perimeter() {
		return 2 * (lengh + width);
	}
	
	public String toString() {
		return String.format("lengh %d - width %d - area %d - perimeter %d",lengh,width,area(),perimeter());
	}
	
}
