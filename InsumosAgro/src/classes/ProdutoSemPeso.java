package classes;

public class ProdutoSemPeso extends Produto {
    private float volumeEmLitros;

    public ProdutoSemPeso(String nome, float valor, int qEstoque, float volumeEmLitros) {
        super(nome, valor, qEstoque);
        this.volumeEmLitros = volumeEmLitros;
    }

    public float getVolumeEmLitros() {
        return volumeEmLitros;
    }


    public void detalhes() {
        System.out.println("Detalhes do Produto");
        System.out.println("Nome: " + getNome());
        System.out.println("volume: " + getVolumeEmLitros());
        System.out.println("Quantidade em Estoque: " + getqEstoque());
        System.out.println("Valor: " + getValor());
    }
}