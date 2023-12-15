package classes;

public class TortaAlgodao extends ProdutoComPeso {

    private String tipo;

    public TortaAlgodao (String tipo, String nome, String peso, float valor, int qEstoque) {
        super(nome, peso, valor, qEstoque);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void detalhes(){
        System.out.println("Tipo (Moida ou Não Moida): " + getTipo());
        super.detalhes();
    }
}
