package Aula2204;

import java.util.Locale;

public class Ex04 {

    public static void main(String[] args) {
        Locale localeOriginal = Locale.getDefault();
        Locale.setDefault(Locale.US);
        String produto1 = "Computador";
        String produto2 = "Mesa";

        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.0;
        double medida = 53.234567;

        System.out.println("Produto");
        System.out.printf("%s, preco: %.1f\n", produto1, preco1);
        System.out.printf("%s, preco: %.1f\n\n", produto2, preco2);
        System.out.printf("Registro: %d anos, codigo %d e sexo %c\n\n", idade, codigo, sexo);

        Locale.setDefault(localeOriginal);
        System.out.printf("Medida com 8 casas: %.8f\n",medida);
        System.out.printf("Medida com 3 casas: %.3f\n",medida);
        System.out.printf("Medida com 8 casas: %.8f",medida);



    }
}
