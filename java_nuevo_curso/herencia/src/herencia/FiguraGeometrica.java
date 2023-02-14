package herencia;

//ejemplo de sobreescritura de clases para cambiar la funcionalidad del hijo que es cubo
public class FiguraGeometrica {
	
	private String nombre;
	
	
	//constructor
	public FiguraGeometrica(String nombre) {
		this.nombre=nombre;
	}
	
	
	public double getArea() {
		return 0;
		
	}
	
	public double getPerimetro() {
		return 0;
	}
	
}
