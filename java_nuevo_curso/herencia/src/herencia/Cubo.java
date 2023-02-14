package herencia;

//ejemplo de sobreescritura de clases para cambiar la funcionalidad del hijo
public class Cubo extends FiguraGeometrica {
	
	private float lado;
	
	public Cubo(String nombre, float lado) {
		super(nombre);
		this.lado=lado;
		
	}
	
	//Sobreescritura: mecanismo que permite modificar los comportamientos del padre para poder ajustarlos a los requerimientos
	//de las clases hijas
	//sobreesctitura, mismo método diferente contenido (piramede verde sobreescritura) sino no te enteras
	//es un buena practica poner un @Override, para saber que no es el método original
	//tiene que mantener el nombre del método de la clase padre, incluido el public, private etc...
	//sobrecarga y sobreescritura son totalmente diferentes. 
	//Sobrecar es cuando el nombre es el mismo pero los parametros diferentes.
	@Override
	public double getArea() {
		return lado*lado;
	}
	@Override
	public double getPerimetro() {
		return lado*4;
	}

}
