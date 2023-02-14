public class Cuadrado implements FiguraGeometrica {

    private float lado;
    private String nombre;

    //no usamos super porque no hay herencia, si la pusiera se iría a object al padre de todas las clases
    public Cuadrado(String nombre, float lado) {
        this.nombre=nombre;
        this.lado=lado;
    }

    @Override
    public double getPerimetro() {
        return lado=4;
    }

    @Override
    public double getArea() {
     return lado*lado;
    }

}
