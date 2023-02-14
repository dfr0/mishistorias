public class RunnerPoliformismo {
    public class RunnerPoliformismoFigura {
        public static void main(String[] args) {
            Circulo circulo = new Circulo(10.0f);
            circulo.getRadio();

            FiguraGeometrica fg = new Circulo(6.0f);
            FiguraGeometrica figura;

            figura=circulo; //bloqueo de elementos

            //esto no se puede hacer porque solamente se puede apuntar a referencias de tipo padre
            Circulo c1=figura;

            //Forma de desbloquear los elementos
            Circulo c1=(Circulo)figura; //Esto también es casting, al igual que cuando lo usamos para convertir números

            //Para comprobar si se puede hacer casting, usamos el instanceof
            //en este caso no va a sacar nada porque figura no es una instancia de cuadrado 
            if(figura instanceof Cuadrado) {
                Circulo c1 = (Circulo) figura;

                c1.getRadio();
            }
            //ahora si podemos usar el métodp
            c1.getRadio();

        }
    }
}
