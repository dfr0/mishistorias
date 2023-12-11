package herencia;

//en java todos los elementos son elementos del tipo object y todos los que creemos.
//van a ederar todas las caracteristicas de el object.
//es como si pusiera el compiladore un extends object.
//La herencia solo se puede hacer de una sola clase, la clase padre se llama superclase
//La clase padre de todas es object.
//hijos multiples no es multi herencia, solo un padre.

public class Estudiante extends Persona {
	
	protected String nombre;

	//this llama solo a la clase actual
	//crear contructor llamando al constructor de la clase padre, sino problemas.
	//constructores no se heredan
	public Estudiante(String noControl, String nombre,char sexo,byte edad) {
		super(nombre,sexo,edad);//sin . manda llamar constructores y con punto llama cualquier elemento de la clase
		this.noControl=noControl;
	}

	private String noControl;

	public void setControl (String noControl){
		this.noControl = noControl;
	}
	
	public String getControl() {
		return noControl;
	}

}