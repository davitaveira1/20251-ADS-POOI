package Aula2204;
import java.util.Scanner;
public class Ex02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome = leia.nextLine();
        int idade = leia.nextInt();
        leia.nextLine();
        String nomeCurso = leia.nextLine();
        int qtdAlunos = leia.nextInt();
        leia.nextLine();
        String nomeCoord = leia.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("NomeCurso: " + nomeCurso);
        System.out.println("QtdAlunos: " + qtdAlunos);
        System.out.println("NomeCoord: " + nomeCoord);
    }
}
