public class Runner {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("cuadradito",2.5f);
        TrianguloEquilatero trianguloequilatero = new TrianguloEquilatero("triangulito",3.0f,1.5f);
        Esfera esfera = new Esfera("esferita",1.0f);

        System.out.println(trianguloequilatero.getArea());
        System.out.println(esfera.getVolumen());

    }
}
