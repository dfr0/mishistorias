package interfaces;

public class GamingConsoleRunner {

	public static void main(String[] args) {
		//MarioGame game = new MarioGame(); //think it as a Player gaming the console
		// Podemos usar las mismas implementaciones cambiando de juego, es lo que llamamos polimorfismo.
		// interfaces sirve para usar acciones comunes de las classes en multiples implementaciones.
		ChessGame game = new ChessGame();
		game.up();
		game.down();
		game.right();
		game.left();

	}

}
