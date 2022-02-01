package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    //    Eu digito apenas "MAIN" e dou enter e já inicia a MAIN pra mim
//    CTRL + SHIFT + F10 = para rodar o programa -- sensacional
//    Método já programado, então apertamos (SHIFT + F10) para rodar o PROGRAMA
    public static void main(String[] args) {

        Gato gato = new Gato("Figaro", "Misto", 10);//para importar a classe GATO -- (ALT + ENTER)
        System.out.println(gato);

/*        int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a + b));*/
//        CTRL + SHIFT + / -- para comentar em BLOCO
    }
}
