/*4 - Faça um algoritmo que leia o valor do salário-mínimo e o 
valor do salário de um usuário, calcule quantos 
salários-mínimos esse usuário ganha e imprima na tela o resultado. 
(Base para o Salário-mínimo R$ 1.518,00). */


public class ex4 {
    public static void main (String [] args) {
        double salario, salMin, qtdSalMin;

            salMin=1518;
            
            System.out.println("Qual seu salário?");
            salario = Double.parseDouble(System.console().readLine());
            qtdSalMin = salario / salMin;
            System.out.printf("Seu salário é %.2f e voce ganha ao todo %.2f salários minimos \n", salario, qtdSalMin);

        
    }
    
}
