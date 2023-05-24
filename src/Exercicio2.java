//Faça um programa que receba 4 notas bimestrais e mostre a média aritmética
import java.util.Scanner;
public class Exercicio2 {
    public static void main (String[] args){
        Scanner notasUsuario = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = notasUsuario.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = notasUsuario.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double terceiraNota = notasUsuario.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double quartaNota = notasUsuario.nextDouble();

        double mediaGeral = (primeiraNota + segundaNota + terceiraNota + quartaNota) /4;
        System.out.println("A média é de: " + mediaGeral);


    }
}
