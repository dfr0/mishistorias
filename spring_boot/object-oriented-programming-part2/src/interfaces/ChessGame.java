package interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("pieze moves up");
		
	}

	@Override
	public void down() {
		System.out.println("pieze moves down");
		
	}

	@Override
	public void left() {
		System.out.println("pieze moves left");
		
	}

	@Override
	public void right() {
		System.out.println("pieze moves right");
		
	}

}
