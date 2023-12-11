package herencia;

public class JefeGrupo extends Estudiante {
	private char grupo;
	private byte grado;
	
    public JefeGrupo (String noControl,String nombre, byte edad, char sexo, char grupo,byte grado) {
			super(noControl,nombre,edad,sexo);
			this.grado = grado;
			this.grupo = grupo;
	}
    
    public void mostrarDatos() {
    	super.mostrarDatos();
    	System.out.println("grupo: " + grupo);
    	System.out.println("grado: " + grado);
    }
}