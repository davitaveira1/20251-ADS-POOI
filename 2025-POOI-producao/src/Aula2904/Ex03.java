package Aula2904;

public class Ex03 {

    public static void main(String[] args) {
        double media = 3;

        if(media >= 0 && media < 3){
            System.out.println("Reprovado");
        }
        if(media >= 3 && media < 6){
            System.out.println("Recuperação");
        }
        if(media >= 6 && media <= 10){
            System.out.println("Aprovado");
        }
    }
}
