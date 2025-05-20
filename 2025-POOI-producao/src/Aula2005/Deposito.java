package Aula2005;

public class Deposito {

    int quantidade;

    void receber(int qtd){
        quantidade += qtd;
    }

    void enviar(int qtd){
        if(quantidade >= qtd){
            quantidade -= qtd;
        }else{
            System.out.println("Estoque insuficiente");
        }
    }

    void transferir(Deposito depDestino, int qtd){
        //verificar se existe estoque no deposito de origem
        if(quantidade >= qtd){
            //retirando produto no deposito de origem
            quantidade -= qtd;
            //adicionando produto no deposito de destino
            depDestino.quantidade += qtd;
        }else{
            System.out.println("Estoque insuficiente");
        }
    }

    public static void main(String[] args) {
        Deposito depOrigem = new Deposito();
        Deposito depDestino = new Deposito();

        depOrigem.receber(100);
        depOrigem.transferir(depDestino,20);
        System.out.println("Qtd dep Origem: "+depOrigem.quantidade);
        System.out.println("Qtd dep Destino: "+depDestino.quantidade);
    }
}
