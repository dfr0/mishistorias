public abstract class FiguraTriangular implements FiguraGeometrica {

    protected float base;
    protected float altura;
    protected String nombre;

    //constructor
    public FiguraTriangular (String nombre, float base, float altura) {
        this.altura=altura;
        this.nombre=nombre;
        this.base=base;
    }

    @Override
    public double getArea(){
        return (base*altura)/2.0;
    }

    //como el perimetro cambia según el tipo de triangulo hace falta un método abstracto asi que la clase tiene
    //que ser abstracta

}
