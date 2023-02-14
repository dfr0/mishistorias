public class Circulo implements FiguraGeometrica {

    private float radio;
    private Circulo(float radio){
        this.radio=radio;
    }

    @Override
    public double getPerimetro() {
        return PI*(radio*2);
    }

    @Override
    public double getArea() {
        return PI*(radio*radio);
    }

    @Override
    public float getRadio(){
        return radio;
    }
}
