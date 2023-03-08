public class Main {
    public static void main(String[] args) {

        int resultado;
        resultado = suma( 10, 15, 20 );
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementaPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 2;
    public void incrementaPuertas() {
        this.puertas++;
    }
}