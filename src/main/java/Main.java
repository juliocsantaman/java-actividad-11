
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Main {

    public static void showFigureMenu() {
        System.out.println("Menú de figuras");
        System.out.println("Elija una opción");
        System.out.println("1. Círculo.");
        System.out.println("2. Triángulo Equilátero.");
        System.out.println("3. Cuadrado");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String property = "";
        String res = "";

        do {

            System.out.println("Menú de propiedades");
            System.out.println("Elija una opción");
            System.out.println("1. Calcular Área.");
            System.out.println("2. Calcular Perímetro.");
            System.out.println("0. Salir.");

            property = scanner.nextLine();

            switch (property) {
                // Areas.
                case "1":
                    String figure = "";
                    showFigureMenu();
                    figure = scanner.nextLine();

                    switch (figure) {
                        // Circle.
                        case "1":
                            double radius;
                            System.out.println("Digite el radio del círculo: ");
                            radius = scanner.nextDouble();
                            Circle circle = new Circle(radius);
                            System.out.println("El área del círculo es: " + circle.getArea());
                            break;
                        // Equilateral Triangle.
                        case "2":
                            double base,
                             height;
                            System.out.println("Digite la base del triángulo equilátero: ");
                            base = scanner.nextDouble();
                            System.out.println("Digite la altura del triángulo equilátero: ");
                            height = scanner.nextDouble();
                            EquilateralTriangle eTriangle = new EquilateralTriangle(base, height);
                            System.out.println("El área del triángulo equilátero es: " + eTriangle.getArea());
                            break;
                        // Square.
                        case "3":
                            double side;
                            System.out.println("Digite un lado del cuadrado: ");
                            side = scanner.nextDouble();
                            Square square = new Square(side);
                            System.out.println("El área del cuadrado es: " + square.getArea());
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;
                // Perimeters.
                case "2":
                    figure = "";
                    showFigureMenu();
                    figure = scanner.next();
                    switch (figure) {
                        // Circle.
                        case "1":
                            double radius;
                            System.out.println("Digite el radio del círculo: ");
                            radius = scanner.nextDouble();
                            Circle circle = new Circle(radius);
                            System.out.println("El perímetro del círculo es: " + circle.getPerimeter());
                            break;
                        // Equilateral Triangle.
                        case "2":
                            double base;
                            System.out.println("Digite la base del triángulo equilátero: ");
                            base = scanner.nextDouble();
                            EquilateralTriangle eTriangle = new EquilateralTriangle(base);
                            System.out.println("El perímetro del triángulo equilátero es: " + eTriangle.getPerimeter());
                            break;
                        // Square.
                        case "3":
                            double side;
                            System.out.println("Digite un lado del cuadrado: ");
                            side = scanner.nextDouble();
                            Square square = new Square(side);
                            System.out.println("El perímetro del cuadrado es: " + square.getPerimeter());
                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;

                case "0":
                    System.out.println("Aplicación finalizada.");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida.");
            }

            do {
                System.out.println("¿Deseas volver a ejecutar el programa?");
                System.out.println("Escribe si o no: ");
                scanner.nextLine();
                res = scanner.next();
                res = res.toLowerCase();

                if (!res.equals("si") && !res.equals("no")) {
                    System.out.println("No has escrito una respuesta correcta.");
                    System.out.println("Recuerda que solo es si o no.");
                }

            } while (!res.equals("si") && !res.equals("no"));

            System.out.println();
            scanner.nextLine();

        } while (res.equals("si"));
        
        System.out.println("Aplicación finalizada.");
    }
}
