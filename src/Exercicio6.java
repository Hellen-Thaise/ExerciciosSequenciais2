//Faça um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.
import java.util.Scanner;
public class Exercicio6 {
    public static void main (String[] args){
        Scanner number = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numberInt = number.nextInt();

        int numberAnt = (numberInt - 1);
        int numberSuc = (numberInt + 1);
        System.out.print("O número antecessor é: " +numberAnt+ " e o número sucessor é: " +numberSuc);
    }

}
