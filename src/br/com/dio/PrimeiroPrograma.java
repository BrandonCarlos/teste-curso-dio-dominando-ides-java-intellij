package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    //    Eu digito apenas "MAIN" e dou enter e já inicia a MAIN pra mim
//    CTRL + SHIFT + F10 = para rodar o programa -- sensacional
//    Método já programado, então apertamos (SHIFT + F10) para rodar o PROGRAMA
    public static void main(String[] args) {

        Gato gato = new Gato("Figaro", "Misto", 10);//para importar a classe GATO -- (ALT + ENTER)
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        Livro livro2 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);

/*        int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a + b));*/
//        CTRL + SHIFT + / -- para comentar em BLOCO
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

//    Quando exibimos no System.out.println(livro1) é exibido o toString();
    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
