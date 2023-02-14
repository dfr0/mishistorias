public class TestFigura {
    public static void main(String[] args) {
        Esfera esfera = new Esfera("esferita",1.2f);

        FiguraGeometrica figuraGeometrica = esfera;

        System.out.printf(figuraGeometrica.getArea()+"");
    }
}
