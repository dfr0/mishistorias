//Clase en la que alguno o todos sus métodos están declarados pero no definidos
//nombre, parametros y tipo de retorno pero no contenido en el código
//la clase tiene que ser abstracta si el metodo lo es, tiene que tener por lo menos uno.
//No se puede crear objectos de una clase abstracta
//las subclases tiene obligacion de implementar los metodos de la clase abstracta

public abstract class FiguraGeometrica {
	
	protected string name; //usamos protected porque sabemos que va a haber herencia, se va
	//a usar en otros elementos.
	
	//metodo abstracto, carece de implementación porque no sabemos como lo hace ni que retornar.
	//puede contener metodos no abstractos pero la clase se considera abstracta si tiene por lo menos uno.
	public abstract double getPerimetro();
	
	public abstract double getArea();
	
	public String getNombre() {
		return nombre;
	}

}
