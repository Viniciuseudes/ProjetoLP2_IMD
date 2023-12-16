package classes;
/**
 * A classe abstrata Produto representa a estrutura básica de um produto.
 * Esta classe é a superclasse para diferentes tipos de produtos, fornecendo
 * atributos comuns e um método abstrato para detalhes do produto.
 */
public abstract class Produto {

    private String nome;
    private String peso;
    private float volumeEmLitros;
    private float valor;
    private int qEstoque;
    /**
     * Construtor para a classe Produto.
     *
     * @param nome     O nome do produto.
     * @param peso     O peso do produto.
     * @param valor    O valor do produto.
     * @param qEstoque A quantidade do produto em estoque.
     */
    public Produto(String nome, String peso, float valor, int qEstoque) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
        this.qEstoque = qEstoque;
    }


    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getqEstoque() {
        return qEstoque;
    }

    public void setqEstoque(int qEstoque) {
        this.qEstoque = qEstoque;
    }

    /**
     * Método abstrato detalhes a ser implementado pelas subclasses.
     * Deve fornecer informações detalhadas sobre o produto.
     */
    public abstract void detalhes();
}
