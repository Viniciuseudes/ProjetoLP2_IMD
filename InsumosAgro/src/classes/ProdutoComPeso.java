package classes;

import classes.Produto;
/**
 * A classe ProdutoComPeso é uma subclasse abstrata de Produto.
 * Ela representa produtos que têm um peso associado, além das características
 * básicas definidas na superclasse Produto.
 */
public abstract class ProdutoComPeso extends Produto {

    /**
     * Construtor para a classe ProdutoComPeso.
     *
     * @param nome     O nome do produto.
     * @param peso     O peso do produto.
     * @param valor    O valor do produto.
     * @param qEstoque A quantidade do produto em estoque.
     */
    public ProdutoComPeso(String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);

    }

    /**
     * Implementação do método detalhes, conforme definido na classe Produto.
     * Este método exibe detalhes específicos do produto, incluindo seu peso.
     */
    @Override
    public void detalhes() {
        System.out.println("Detalhes do ProdutoComPeso");
        System.out.println("Nome: " + getNome());
        System.out.println("Peso: " + getPeso());
        System.out.println("Quantidade em Estoque: " + getqEstoque());
        System.out.println("Valor: " + getValor());

    }
}