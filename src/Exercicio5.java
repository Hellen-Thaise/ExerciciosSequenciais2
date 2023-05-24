// Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args){
        Scanner conversao = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double grauF = conversao.nextDouble();

        double conversaoTotal = ((grauF - 32.0) * 5.0) / 9.0;
        System.out.print("A temperatura em graus Celsis é de: "+conversaoTotal+ " °C");
    }
}
