package BOLETIN1;

import java.util.Scanner;

public class E4_E5 {

    public static void main(String[] args) {
        /* 4. Pedir dos números y decir si son iguales o no. */
        Scanner Entrada = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduce un número: ");
        n1 = Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2 = Entrada.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        /* 5. Pedir un número e indicar si es positivo o negativo. */
        int num;
        System.out.print("Introduce un número: ");
        num = Entrada.nextInt();
        if (num < 0) {
            System.out.println("Negativo");
        } else { // suponemos que el 0 es positivo.
            System.out.println("Positivo");
        }
    }
}