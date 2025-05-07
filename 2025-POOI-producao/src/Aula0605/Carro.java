package Aula0605;

public class Carro {

    void nomeProprietario(String nome){
        System.out.println("O nome do proprietário é: "+nome);
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nomeProprietario("Davi");
    }

}
