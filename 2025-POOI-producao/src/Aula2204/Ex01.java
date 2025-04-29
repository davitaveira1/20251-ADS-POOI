package Aula2204;

import java.util.Scanner;
public class Ex01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a idade:");
        int idade = leia.nextInt();
        System.out.println("Informe o peso:");
        double peso = leia.nextDouble();
        System.out.println("Informe o nome completo:");
        leia.nextLine();
        String nome = leia.nextLine();
        System.out.println("Informe a nota:");
        double nota = leia.nextDouble();
        System.out.println("Informe o nome do pai:");
        String pai = leia.nextLine();


        System.out.println(idade);
        System.out.println(peso);
        System.out.println(nome);
        //System.out.println(nomePai);
    }
}
