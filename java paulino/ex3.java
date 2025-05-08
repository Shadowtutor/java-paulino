/*3 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e
o seu sucessor. */

public class ex3 {
    public static void main(String[] args) {
        double n1, antes, depois;

        System.out.println("Informe um numero");
        n1 = Double.parseDouble(System.console().readLine());

        if (n1 >=1) {
            System.out.printf("O valor digitado foi %.1f \n", n1);
            antes = n1-1;
            System.out.printf("Seu antecessor é %.1f \n", antes);
            depois = n1+1;
            System.out.printf("Seu antecessor é %.1f \n", depois); 
        }
    }
}