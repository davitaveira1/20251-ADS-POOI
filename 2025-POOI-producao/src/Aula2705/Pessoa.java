package Aula2705;

public class Pessoa {

    double peso;
    double altura;

    double calcularIMC(double peso, double altura){
        double imc = peso / (altura * altura);
        return imc;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println(p.calcularIMC(85.5,1.87));
    }
}
