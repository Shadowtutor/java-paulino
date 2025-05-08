/*6 - Faça um algoritmo que leia três valores inteiros diferentes e 
imprima na tela os valores em ordem decrescente. */

public class ex6 {
    public static void main (String [] args) {
        double n1, n2, n3, bau = 0;
        
        System.out.println("Digite o 1º Numero: ");
        n1 = Double.parseDouble(System.console().readLine());
        
        System.out.println("Digite o 2º Numero: ");
        n2 = Double.parseDouble(System.console().readLine());
        
        System.out.println("Digite o 3º Numero: ");
        n3 = Double.parseDouble(System.console().readLine());
        System.out.printf(" Numeros digitados respectivamente: %.1f %.1f %.1f \n", n1, n2, n3);
        if (n2<n1 && n3<n2) {
            bau = n1;
            n1 = n2;
            n2 = n3; 
        } if (bau > n1 && bau>n2) {
            n1 = bau;
        }
        System.out.printf("Sua ordem decrescente é %.1f %.1f %.1f \n", n3,n2,n1);
        }
    }
