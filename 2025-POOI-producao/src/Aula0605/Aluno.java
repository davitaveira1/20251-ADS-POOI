package Aula0605;

public class Aluno {

    String nome;
    String telefone;
    String matricula;

    void mostrarBoasVindas(){
        System.out.println("Seja bem vindo ao curso de POO !");
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Jonas";
        aluno.telefone = "(62)99988-0099";
        aluno.matricula = "200210020002";

        System.out.println("Nome: "+aluno.nome);
        System.out.println("Telefone: "+aluno.telefone);
        System.out.println("Matricula: "+aluno.matricula);

        aluno.mostrarBoasVindas();
    }
}
