/*1 - Faça um algoritmo que leia os valores de 
A, B, C e em seguida imprima na tela a soma
entre A e B é mostre se a soma é menor que C.*/

public class ex1 {
    public static void main(String[] args) {
        double n1, n2, n3, res;
        System.out.print("Informe a nota do 1ª Bimestre: ");
        n1 = Double.parseDouble(System.console().readLine());

        System.out.print("Informe a nota do 2ª Bimestre: ");
        n2 = Double.parseDouble(System.console().readLine());

        System.out.print("Informe a nota do 3ª Bimestre: ");
        n3 = Double.parseDouble(System.console().readLine());

        res = (n1 + n2);
        System.out.println("A soma entre " + n1 + " e " + n2 + " é : " + res);

        if (res < n3) {
            System.out.println("A 3º nota é maior que a soma das duas primeiras.");
        } else
            System.out.println("A soma das duas primeiras notas é maior que a terceira nota.");

    }
}