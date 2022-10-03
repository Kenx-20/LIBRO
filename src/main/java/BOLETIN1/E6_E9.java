package BOLETIN1;

import java.util.Scanner;

public class E6_E9 {

    public static void main(String[] args) {
        /* 6. Pedir dos números y decir si uno es múltiplo del otro. */
        Scanner Entrada = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduce un número: ");
        n1 = Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = Entrada.nextInt();
        if (n1 % n2 == 0) {
            System.out.println("Son múltiplos");
        } else {
            System.out.println("No son múltiplos");
        }

        /* 7. Pedir dos números y decir cuál es el mayor. */
        int n3, n4;
        System.out.print("\n" + "Introduce un número: ");
        n3 = Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n4 = Entrada.nextInt();
        // si ambos números son iguales diría que n2 es mayor que n1
        if (n3 > n4) {
            System.out.println(n3 + " es mayor que " + n4);
        } else {
            System.out.println(n4 + " es mayor que " + n3);
        }

        /* 8. Pedir dos números y decir cuál es el mayor o si son iguales. */
        int n5, n6;
        System.out.print("\n" + "Introduce un número: ");
        n5 = Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n6 = Entrada.nextInt();
        if (n5 == n6) {
            System.out.println("Son iguales");
        } else {
            if (n5 > n6) {
                System.out.println(n5 + " es mayor que " + n6);
            } else {
                System.out.println(n6 + " es mayor que " + n5);
            }
        }

        /* 9. Pedir dos números y mostrarlos ordenados de mayor a menor. */
        int n7, n8;
        System.out.print("\n" + "Introduce un número: ");
        n7 = Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n8 = Entrada.nextInt();
        if (n7 > n8) {
            System.out.println(n7 + " y " + n8);
        } else {
            System.out.println(n8 + " y " + n7);
        }
    }
}
