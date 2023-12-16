package classes;

import classes.Produto;

public abstract class ProdutoComPeso extends Produto {


    public ProdutoComPeso(String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);

    }


    @Override
    public void detalhes() {
        System.out.println("Detalhes do ProdutoComPeso");
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Quantidade em Estoque: " + getqEstoque());
        System.out.println("Valor: " + getValor());

    }
}