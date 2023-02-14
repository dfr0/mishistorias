package sobrecarga;

public class SobrecargaRunner {

	public static void main(String[] args) {
		//mecanismo que permite tener el mismo nombre con funcionalidades diferentes
		//operadores: suma ->>
		//contructores: mismo nombre, argumentos diferentes
		Sobrecarga sobrecarga = new Sobrecarga();
		System.out.println(sobrecarga.suma(4, 8));

	}

}
