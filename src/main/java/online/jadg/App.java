package online.jadg;

import online.jadg.services.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int op = 0;
        double num1=0, num2=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Calculadora");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            op = Integer.parseInt(sc.nextLine());

            if(op != 5) {
                System.out.print("Número 1: ");
                num1 = Double.parseDouble(sc.nextLine());
                System.out.print("Número 2: ");
                num2 = Double.parseDouble(sc.nextLine());
            }

            switch (op){
                case 1:
                    System.out.println("Resultado: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + calculator.divide(num1, num2));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(op != 5);
    }
}
