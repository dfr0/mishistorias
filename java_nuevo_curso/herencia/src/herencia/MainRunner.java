package herencia;

public class MainRunner {

	public static void main(String[] args) {
		
		Estudiante estudiante = new Estudiante("P0w1i1", "Jose Carlos", 'B', (byte) 15);
		estudiante.setControl("Sin control");
		estudiante.getControl();
		System.out.println("###  ESTUDIANTE ###");
		estudiante.MostarMetodo();
		
		Persona persona = new Persona("David",(byte)(32));
		System.out.println("###  PERSONA ###");
		persona.MostarMetodo();
		
		JefeGrupo jefegrupo = new JefeGrupo("921818dj", "antonio", (byte)(45), 'B', 'A', (byte)(3));
		System.out.println("###  JEFE GRUPO ###");
		jefegrupo.MostarMetodo();
	}

}
