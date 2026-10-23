class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
    public double somar(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- EXERCÍCIO 2: Sobrecarga de Métodos ---");
        Calculadora calc = new Calculadora();

        System.out.println("Soma (2 ints: 10 + 20) = " + calc.somar(10, 20));
        System.out.println("Soma (3 ints: 5 + 10 + 15) = " + calc.somar(5, 10, 15));
        System.out.println("Soma (2 doubles: 5.5 + 4.2) = " + calc.somar(5.5, 4.2));
    }
}