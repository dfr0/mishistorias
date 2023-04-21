
public abstract class FiguraTriangular extends FiguraGeometrica {
	
	protected float base;
	protected float altura;
	
	public FiguraTriangular (String nombre, float base,float altura) {
		super(nombre);
		this.base = base;
		this.altura=altura;
	}

	public double getArea() {
		return(base*altura)/2.0;
	}
	
}
