package Aula0605;

public class Conta {

    String nroConta;
    double saldo;

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.nroConta = "33399-2";
        conta.saldo = 1000;

        System.out.println("Nro conta: "+conta.nroConta);
        System.out.println("Saldo: "+conta.saldo);

    }


}
