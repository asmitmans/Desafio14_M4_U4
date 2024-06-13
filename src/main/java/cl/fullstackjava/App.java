package cl.fullstackjava;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int command;
        do {
            mostrarMenu();
            command = (int) leerNum("Ingresar opcion: ", scanner);
            if(command > 0 && command < 5) {
                calcular(calc,scanner,command);
            } else if (command!=5) {
                System.out.println("opcion invalida");
            }
        } while(command!=5);
    }

    public static void mostrarMenu() {
        System.out.println("1 Sumar");
        System.out.println("2 Restar");
        System.out.println("3 Multiplicar");
        System.out.println("4 Dividir");
        System.out.println("5 Salir");
    }

    public static double leerNum(String mensaje,Scanner scanner) {
        System.out.print(mensaje);
        return Double.valueOf(scanner.nextLine());
    }

    public static void calcular(Calculadora calc, Scanner scanner, int op) {
        double num1 = leerNum("Ingrese el num1: ",scanner);
        double num2 = leerNum("Ingrese el num2: ",scanner);
        calc.setNum1(num1);
        calc.setNum2(num2);
        if (op == 1) {
            System.out.println(num1 + " + " + num2 +" = " + calc.sumar() );
        } else if (op==2) {
            System.out.println(num1 + " - " + num2 +" = " + calc.restar() );
        } else  if (op==3) {
            System.out.println(num1 + " * " + num2 +" = " + calc.multiplicar() );
        } else if (op==4) {
            if (num2!=0) {
                System.out.println(num1 + " / " + num2 +" = " + calc.dividir());
            } else {
                System.out.println("Error division por 0");
            }
        }
    }
}
