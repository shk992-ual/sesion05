package ual.hmis;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Suma: " + calc.add(5, 3));
        System.out.println("Resta: " + calc.subtract(5, 3));
        System.out.println("Multiplicación: " + calc.multiply(5, 3));

        try {
            System.out.println("División: " + calc.divide(10, 2));
            System.out.println("División por 0: " + calc.divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}