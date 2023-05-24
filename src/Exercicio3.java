// Faça um programa que converta metros para centímetros

import java.util.Scanner;
public class Exercicio3 {
    public static void main (String[] args){
        Scanner metros = new Scanner(System.in);

        System.out.println("Digite quantos metros você deseja converter: ");
        double conversao = metros.nextDouble();

        double conversaoTotal = conversao * 100;
        System.out.print("A conversão de Metros dá o total de "+conversaoTotal+ "centímetros");

    }
}
