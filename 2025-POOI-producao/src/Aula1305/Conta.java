package Aula1305;

public class Conta {

    double saldo;

    void creditar(double valor){
        saldo = saldo + valor;
        System.out.println("Saldo atual: " + saldo);
    }

    void debitar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Saldo atual: " + saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    void transferir(Conta contaCreditada, double valor){
        if(saldo >= valor){
            //creditando o dinheiro
            contaCreditada.saldo = contaCreditada.saldo + valor;
            //debitando o dinheiro de quem chamou
            saldo = saldo - valor;
            System.out.println("Saldo conta creditada: "+contaCreditada.saldo);
            System.out.println("Saldo conta debitada: "+saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {
        Conta contaDavi = new Conta();
        Conta contaMaria = new Conta();
        contaDavi.saldo = 1000;
        contaMaria.saldo = 0;
        contaDavi.transferir(contaMaria,2000);
    }
}
