package Aula0306;

public class Funcionario {

    double salario;

    double diferencaSalarial(Funcionario f, double meuSalario){
        double diferencaSalario;
        if(meuSalario >= f.salario){
            diferencaSalario = meuSalario - f.salario;
        }else{
            diferencaSalario = f.salario - meuSalario;
        }
        return diferencaSalario;
    }

    public static void main(String[] args) {
        Funcionario davi = new Funcionario();
        Funcionario Lucas = new Funcionario();

        davi.salario = 1000;
        Lucas.salario = 2000;
        System.out.print("Diferença: "+davi.diferencaSalarial(Lucas, davi.salario));

    }
}
