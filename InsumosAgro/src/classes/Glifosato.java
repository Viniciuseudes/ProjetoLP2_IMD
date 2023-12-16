package classes;

public class Glifosato extends ProdutoSemPeso {
    public Glifosato(String nome, String valor, float qEstoque, float volumeEmLitros) {
        super(nome, valor, qEstoque, volumeEmLitros);
    }

    @Override
    public void detalhes() {
        System.out.println("Detalhes do Glifosato");
        System.out.println("Nome: " + getNome());
        System.out.println("Volume em Litros: " + getVolumeEmLitros());
        System.out.println("Quantidade em Estoque: " + getqEstoque());
        System.out.println("Valor: " + getValor());
    }
}
