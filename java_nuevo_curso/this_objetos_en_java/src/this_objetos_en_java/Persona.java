package this_objetos_en_java;

public class Persona {

	//Atributos
	private String raza;
	private String nombre;
	private byte edad;
	private char sexo;

	
	//Metodos Get
	public String getRaza() {
		return raza;
	}
	public String getNombre() {
		return nombre;
	}
	public byte getedad() {
		return edad;
	}
	public char getSexo() {
		return sexo;
	}
	
	//Metodos SET
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//Acceso al metodo
	public void MostarMetodo() {
		System.out.println("La raza es: " + raza);
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es : " + edad);
		System.out.println("El sexo es: " + sexo);
	}
	
	//CONSTRUCTORES
	//nunca retornan nada, una clase debe tener por lo menos uno ya sea y 
	//pudes hacer muchos pero no con el mismo orden de argumentos
	//implicito o explicito.
	//Se debe llamar como la clase.
	//No es un método.
	//private: clase; protected: clase y subclase; default: clase, subclase y paquete y public universo.
	public Persona(String nombre,byte edad,char sexo) {
		this.nombre = nombre;
		this.edad=edad;
		this.sexo=sexo;	
	}
	public Persona(String nombre,byte edad) {
		this.nombre = nombre;
		this.edad=edad;
	}
	//tambien podemos usar los valores de otro constructor con this
	public Persona(String nombre) {
		this(nombre,edad,sexo); //siempre tiene que ser la primera linea, debajo puedes poner lo que quieras
		edad="4";
	}
	
	
}