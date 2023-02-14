
public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer 1", 0.34657, "Green");
		fan.switchOn();
		System.out.println(fan);
	}
}
