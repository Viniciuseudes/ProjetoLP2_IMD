package classes;
/**
 * A classe Venda representa uma venda de um produto específico.
 * Esta classe estende a classe Produto, adicionando a quantidade vendida como um atributo adicional.
 */
public class Venda extends Produto{
    private int quantidade;
    /**
     * Construtor para a classe Venda.
     *
     * @param quantidade A quantidade do produto vendido.
     * @param nome       O nome do produto vendido.
     * @param peso       O peso do produto vendido.
     * @param valor      O valor unitário do produto vendido.
     * @param qEstoque   A quantidade do produto em estoque.
     */
    public Venda(int quantidade, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.quantidade = quantidade;
    }
    /**
     * Retorna a quantidade do produto vendido.
     *
     * @return A quantidade do produto vendido.
     */
    public int getQuantidade() {
        return quantidade;
    }
    /**
     * Define a quantidade do produto vendido.
     *
     * @param quantidade A quantidade do produto a ser definida.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    /**
     * Implementação do método detalhes, conforme definido na classe Produto.
     * Este método exibe detalhes específicos da venda, incluindo o nome, valor unitário,
     * quantidade vendida e o total da venda.
     */
    @Override
    public void detalhes(){

        System.out.println("nome " + getNome());
        System.out.println("Valor " + getValor());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Total: " + getValor() * getQuantidade());
    }

}
