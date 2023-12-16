package classes;
/**
 * A classe Glifosato representa um produto do tipo glifosato, um herbicida.
 * Esta classe estende ProdutoSemPeso, adicionando informações específicas
 * sobre o glifosato, como o volume em litros.
 */
public class Glifosato extends ProdutoSemPeso {
    /**
     * Construtor para a classe Glifosato.
     *
     * @param nome           O nome do produto glifosato.
     * @param valor          O valor do produto glifosato.
     * @param qEstoque       A quantidade do produto em estoque.
     * @param volumeEmLitros O volume do produto em litros.
     */
    public Glifosato(String nome, String valor, float qEstoque, float volumeEmLitros) {
        super(nome, valor, qEstoque, (int) volumeEmLitros);
    }
    /**
     * Sobrescreve o método detalhes da classe ProdutoSemPeso para incluir
     * informações específicas sobre o glifosato.
     */
    @Override
    public void detalhes() {
        System.out.println("Detalhes do Glifosato");
        System.out.println("Nome: " + getNome());
        System.out.println("Volume em Litros: " + getVolumeEmLitros());
        System.out.println("Quantidade em Estoque: " + getqEstoque());
        System.out.println("Valor: " + getValor());
    }
}
