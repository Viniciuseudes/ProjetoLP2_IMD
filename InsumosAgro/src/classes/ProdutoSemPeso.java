package classes;

public class ProdutoSemPeso extends Produto {
    private float volumeEmLitros;

    public ProdutoSemPeso(String nome, String valor, float qEstoque, float volumeEmLitros) {
        super(nome, valor, qEstoque);
        this.volumeEmLitros = volumeEmLitros;
    }

    public float getVolumeEmLitros() {
        return volumeEmLitros;
    }

    public void detalhes() {
        System.out.println("Detalhes do Produto");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Volume: " + getVolumeEmLitros());
        System.out.println("Quantidade em Estoque: " + super.getqEstoque());
        System.out.println("Valor: " + super.getValor());
    }
}
