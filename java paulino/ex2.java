/*2 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem
iguais, deverá somar os dois valores*/

public class ex2 {
    public static void main(String[] args) {
        double n1, n2, C;

        System.out.println("Informe o 1º número:");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.println("Informe o 2º número:");
        n2 = Double.parseDouble(System.console().readLine());

        if (n1 == n2) {
            C = n1 + n2;
            System.out.printf("Valor total = %.1f\n", C);
        } else {
            C = n1 * n2;
            System.out.printf("Valor total = %.1f\n", C);
        }

    }
}
