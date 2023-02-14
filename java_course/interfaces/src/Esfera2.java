public class Esfera2  extends Circulo implements  Figura3D {

    //otra forma de hacerlo

    public Esfera2(float radio){
        super(radio);
    }

    @Override
    public double getVolumen() {
        return (3/4.0)*PI*(getRadio()*getRadio()*getRadio());
    }
}
