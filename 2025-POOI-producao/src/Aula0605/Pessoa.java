package Aula0605;

public class Pessoa {
    //atributos
    String nome;
    String telefone;
    String cpf;
    //métodos

    void calcularIMC(double peso,double altura){
        double imc = peso/(altura*altura);
        System.out.printf("IMC: %.2f",imc);
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Davi";
        p.telefone = "(62)98515-5535";
        p.cpf = "999.888.777-01";

        System.out.println("Nome: "+p.nome);
        System.out.println("Telefone: "+p.telefone);
        System.out.println("CPF: "+p.cpf);
        p.calcularIMC(72.5,1.68);
    }
}
