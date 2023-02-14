package interfaces;

public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("goes up");
		
	}

	@Override
	public void down() {
		System.out.println("goes into the hole");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void right() {
		System.out.println("goes forward");
		
	}

}
