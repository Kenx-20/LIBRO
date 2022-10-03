package BOLETIN1;

import java.util.Scanner;

public class E2_E3 {

    public static void main(String[] args) {
        /* 2. Pedir el radio de un círculo y calcular su área. A=PI*r^2. */
        Scanner Entrada = new Scanner(System.in);
        double a, r; // área y radio
        System.out.print("Introduce el radio de un circulo: ");
        r = Entrada.nextDouble();
        a = Math.PI * (r * r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);
        
        /* 3. Pedir el radio de una circunferencia y calcular su longitud. */
        double l, r1; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r1 = Entrada.nextDouble();
        l = 2 * Math.PI * r1;
        System.out.println("La longitud de una circunferencia de radio " + r1 + " es: " + l);
    }
}