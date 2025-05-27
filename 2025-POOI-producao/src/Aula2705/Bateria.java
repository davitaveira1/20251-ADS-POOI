package Aula2705;

public class Bateria {

    int carga;

    public Bateria(int carga){
        this.carga = carga;
    }

    int obterCarga(){
        return this.carga;
    }

    public static void main(String[] args) {
        Bateria b = new Bateria(85);

        System.out.println("Carga: "+b.obterCarga()+"%");
    }
}
