package Aula2204;

import java.util.Scanner;
public class Ex01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //1ª pergunta: nome
        System.out.println("Informe o seu nome:");
        String nome = leia.nextLine();
        //2ª pergunta: idade
        System.out.printf("Informe a sua idade:");
        int idade = leia.nextInt();

        System.out.println(nome);
        System.out.println(idade);
    }
}
