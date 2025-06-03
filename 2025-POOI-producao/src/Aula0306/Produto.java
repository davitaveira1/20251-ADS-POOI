package Aula0306;

public class Produto {

    double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    double calcularDesconto(Produto p, double percentual){

        double partePercentual = 1-(percentual/100);
        System.out.println("Parte percentual: " + partePercentual);
        double novoPreco = p.preco * partePercentual;
        return novoPreco;
    }

    public static void main(String[] args) {
        Produto p = new Produto(100);
        System.out.println("Preço novo: "+p.calcularDesconto(p,20));
    }

}
