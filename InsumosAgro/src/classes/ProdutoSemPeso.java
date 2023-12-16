package classes;
/**
 * A classe ProdutoSemPeso é uma subclasse de Produto.
 * Ela representa produtos que não têm um peso associado, mas um volume em litros.
 */
public class ProdutoSemPeso extends Produto {
    private float volumeEmLitros;
    /**
     * Construtor para a classe ProdutoSemPeso.
     *
     * @param nome     O nome do produto.
     * @param peso     O peso do produto (não usado nesta subclasse).
     * @param valor    O valor do produto.
     * @param qEstoque A quantidade do produto em estoque.
     */
    public ProdutoSemPeso(String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);

    }
    /**
     * Retorna o volume em litros do produto.
     *
     * @return O volume em litros.
     */
    public float getVolumeEmLitros() {
        return volumeEmLitros;
    }
    /**
     * Implementação do método detalhes, conforme definido na classe Produto.
     * Este método exibe detalhes específicos do produto, incluindo seu volume em litros.
     */
    public void detalhes() {
        System.out.println("Detalhes do Produto");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Volume: " + getVolumeEmLitros());
        System.out.println("Quantidade em Estoque: " + super.getqEstoque());
        System.out.println("Valor: " + super.getValor());
    }
}
