/*5 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de
5%. */

public class ex5 {
    public static void main(String[] args) {
        double num, reajuste;

        reajuste = 0;

        System.out.println("Informe um número: ");
        num = Double.parseDouble(System.console().readLine());
        reajuste = num + num * 0.05;
        System.out.printf("Resultado: %.2f \n ", reajuste);
    }
}