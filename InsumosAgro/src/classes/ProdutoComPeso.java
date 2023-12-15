package classes;

import classes.Produto;

public abstract class ProdutoComPeso extends Produto {
    private String peso;

    public ProdutoComPeso(String nome, String peso, float valor, int qEstoque) {
        super(nome, valor, qEstoque);
        this.peso = peso;
    }

    public String getPeso() {
        return peso;
    }


    public void detalhes() {
        System.out.println("Detalhes do ProdutoComPeso");
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Quantidade em Estoque: " + getqEstoque());
        System.out.println("Valor: " + getValor());

    }
}