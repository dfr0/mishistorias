public class TrianguloEquilatero extends FiguraTriangular {

    public TrianguloEquilatero(String nombre, float base, float altura){
        super(nombre,base,altura);
    }

    @Override
    public double getPerimetro(){
        return base*3.0;
    }

}
