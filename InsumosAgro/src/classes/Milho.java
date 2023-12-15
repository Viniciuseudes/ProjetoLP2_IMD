package classes;

public class Milho extends ProdutoComPeso {

    private String tipo;

    public Milho(String tipo, String nome, String peso, float valor, int qEstoque) {
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
        System.out.println("Tipo (Comum ou Castrado): " + getTipo());
        super.detalhes();
    }
}
