public class Esfera implements Figura3D, FiguraGeometrica {


    private float radio;
    private String nombre;

    public Esfera(String nombre, float radio){
        this.nombre=nombre;
        this.radio=radio;
    }

    @Override
    public double getVolumen() {
        return (3/4.0)*PI*(radio*radio*radio);
    }

    @Override
    public double getPerimetro() {
        return PI*(radio*2); //uso la constante
    }
    @Override
    public double getArea() {
        return PI*(radio*radio);
    }
}
