package herencia;

public class RunnerFiguraGeometrica {

	public static void main(String[] args) {
		Cubo cubo = new Cubo("cubito",3.0f);
		Triangulo triangulo = new Triangulo("triangulito",4.0f,4.0f,6.0f,5.0f);
		System.out.println(cubo.getArea());
		System.out.println(cubo.getPerimetro());
		
		System.out.println("Triangulo area:" + triangulo.getArea());
		
	}

}
