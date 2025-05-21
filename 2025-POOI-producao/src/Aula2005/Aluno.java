package Aula2005;

public class Aluno {

    double notaFinal;

    void exibirSituacao(){
        if(notaFinal >= 0 && notaFinal < 4){
            System.out.println("Aluno reprovado!");
        }
        if(notaFinal >= 4 && notaFinal < 6){
            System.out.println("Aluno de recuperação!");
        }
        if(notaFinal >= 6 && notaFinal <= 10){
            System.out.println("Aluno aprovado!");
        }
    }
}
