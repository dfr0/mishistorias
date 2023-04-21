
public class Cuadrado extends FiguraGeometrica {
	
	private float lado;

	public Cuadrado(String nombre, float lado) {
		super(nombre,lado);
		this.lado=lado;
	}
	
	//realmente no está sobreescrito sino implementado 
	@Override
	//si no implementas métodos la clase no puede dejar de ser abstracta
	public double getPerimetro() {
		return lado=14.0f;
	}

	@Override
	public double getArea() {
		return lado*lado;
	}
	
}
