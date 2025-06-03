package Aula2705;

public class Pessoa {

    double peso;
    double altura;

    double calcularIMC(double peso, double altura){
        double imc = peso / (altura * altura);
        return imc;
    }

    boolean validarCPF(String cpf){
        if(cpf.equals("0")){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        if(p.validarCPF("1")){
            System.out.println("CPF OK!");
        }else{
            System.out.println("CPF INVALIDO!");
        }
    }
}
