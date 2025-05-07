package Aula0605;

public class Gato {
    //atributo
    String nome;
    //metodo
    void emitirSom(){
        System.out.println("Miau!");
    }

    void apresentarNome(){
        System.out.println("Nome: "+nome);
    }

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.nome = "Garfield";
        gato.emitirSom();
        //mostrando o nome com atributo
        System.out.println("Nome: "+gato.nome);
        //mostrando o nome com metodo
        gato.apresentarNome();
    }

}
