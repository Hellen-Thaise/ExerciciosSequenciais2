//Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês.
// Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
// 8% para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
//Salário bruto.
//Quanto pagou ao INSS.
//Quanto pagou ao sindicato.
//Qual o salário líquido do funcionário.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println("Digite o valor da sua hora de trabalho: ");
        float valordahora = new Scanner(System.in).nextFloat();
        System.out.println("Digite quantas horas voce trabalha por dia: ");
        int horastrabalhadas = new Scanner(System.in).nextInt();
        int quantidadededias = 22; //estimativa de dias úteis em um mês
        float salarioTotal = ((valordahora * horastrabalhadas) * quantidadededias);
//        System.out.printf("O seu salário, em um mes, é de: " + salarioTotal);

        double ir = (salarioTotal * 0.11);
        double inss = (salarioTotal * 0.08);
        double sind = (salarioTotal * 0.05);
        double sl = salarioTotal - (inss + sind + ir);

        System.out.println("O seu salário bruto é de: " + salarioTotal);
        System.out.println("Você pagou ao INSS o valor de: " + inss);
        System.out.println("Você pagou ao Sindicato o valor de: " + sind);
        System.out.println("O seu salário líquido foi de: " + sl);
    }
}
