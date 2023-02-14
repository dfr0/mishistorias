package herencia;

public class Triangulo extends FiguraGeometrica {
	private float base;
	private float lado1;
	private float lado2;
	private float altura;
	
	public Triangulo(String nombre,float lado1, float lado2,float base,float altura) {
		super(nombre);
		this.lado1=lado1;
		this.lado2=lado2;
		this.altura=altura;
		this.base=base;
		
	}
	
	@Override
	public double getArea() {
		return lado1+lado2+base;
	}
	@Override
	public double getPerimetro() {
		return (base*altura)/2;
	}
	

}
