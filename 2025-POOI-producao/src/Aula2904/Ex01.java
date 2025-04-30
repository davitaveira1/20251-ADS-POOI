package Aula2904;

public class Ex01 {

    public static void main(String[] args) {
        String user = "davi";
        String senha = "123";

        if(user.equals("davi") && senha.equals("123")){
            System.out.println("Acesso liberado!");
        }else{
            System.out.println("Acesso negado!");
        }

    }
}
