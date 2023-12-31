package classes;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Classe ComandoFuncoes para gerenciar operações de cadastro, exclusão, listagem e venda de produtos e clientes.
 */
public class ComandoFuncoes {
    Scanner leitura = new Scanner(System.in);
    ArrayList<Venda> vendas = new ArrayList<>();
    ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList();

    /**
     * Método para cadastrar um novo cliente.
     * Captura informações do cliente via entrada do usuário e adiciona o cliente à lista de clientes.
     */
    public void cadastrarCliente() {
        System.out.println("Nome:");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Telefone:");
        String telefone = leitura.nextLine();
        System.out.println("Rua:");
        String rua = leitura.nextLine();
        System.out.println("Número:");
        String numero = leitura.nextLine();
        System.out.println("Bairro:");
        String bairro = leitura.nextLine();
        System.out.println("Cep:");
        String cep = leitura.nextLine();

        Cliente cli = new Endereco(rua, numero, bairro, cep, nome, telefone);
        clientes.add(cli);
    }
    /**
     * Método para excluir um cliente existente.
     * Procura um cliente pelo nome e, se encontrado, o remove da lista de clientes.
     */
    public void excluirCliente() {
        boolean encontrou = false;
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!!");
        } else {
            System.out.println("Informe o nome do cliente que deseja excluir:");
            leitura.nextLine();
            String nome = leitura.nextLine();
            for (Cliente c1 : clientes) {
                if (nome.equals(c1.getNome())) {
                    encontrou = true;
                    clientes.remove(c1);
                    System.out.println("Cliente removido com sucesso!");
                    break;
                }
            }
            if (!encontrou) {
                System.out.println("Cliente não encontrado!");
            }
        }
    }
    /**
     * Método para listar todos os clientes cadastrados.
     * Exibe os detalhes de cada cliente na lista de clientes.
     */
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println(" ");
            System.out.println("Nenhum cliente cadastrado!!");
        } else {
            System.out.println(" ");
            System.out.println("Listando clientes");
            for (Cliente cl : clientes) {
                System.out.println("--------------------------------");
                cl.detalhes();
            }
        }
    }
    /**
     * Método para listar um cliente específico por nome.
     * Procura um cliente pelo nome e, se encontrado, exibe seus detalhes.
     */
    public void ListarClientePorNome() {
        boolean encontrou = false;
        System.out.println("Nome do cliente: ");
        leitura.nextLine();
        String nome = leitura.nextLine();

        for (Cliente cl : clientes) {
            if (nome.equals(cl.getNome())) {
                System.out.println(" ");
                encontrou = true;
                cl.detalhes();
                break;
            }
        }
        if (!encontrou) {
            System.out.println(" ");
            System.out.println("Cliente não encontrado!!");
        }
    }
    /**
     * Método para cadastrar um novo produto do tipo Milho.
     * Captura informações do produto via entrada do usuário e adiciona o produto à lista de produtos.
     */
    public void cadastrarMilho() {
        System.out.println("Cadastrando Milho");
        System.out.println("Nome: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Peso: ");
        String peso = leitura.nextLine();
        System.out.println("Tipo: ");
        String tipo = leitura.nextLine();
        System.out.println("Quantidade estoque: ");
        int qEstoque = leitura.nextInt();
        System.out.println("Valor: ");
        float valor = leitura.nextFloat();

        Milho milho = new Milho(tipo, nome, peso, valor, qEstoque);
        produtos.add(milho);
        System.out.println("Milho cadastrado com sucesso!");
    }
    /**
            * Método para cadastrar um novo produto do tipo Sorgo.
            * Captura informações do produto via entrada do usuário e adiciona o produto à lista de produtos.
     */
    public void cadastrarSorgo() {
        System.out.println("Cadastrando Sorgo");
        System.out.println("Nome: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Peso: ");
        String peso = leitura.nextLine();
        System.out.println("Tipo: ");
        String tipo = leitura.nextLine();
        System.out.println("Quantidade estoque: ");
        int qEstoque = leitura.nextInt();
        System.out.println("Valor: ");
        float valor = leitura.nextFloat();

        Sorgo sorgo = new Sorgo(tipo, nome, peso, valor, qEstoque);
        produtos.add(sorgo);
        System.out.println("Sorgo cadastrado com sucesso!");
    }
    /**
            * Método para cadastrar um novo produto do tipo Algodão.
            * Captura informações do produto via entrada do usuário e adiciona o produto à lista de produtos.
     */
    public void cadastrarTortaAlgodao() {
        System.out.println("Cadastrando Torta de Algodão");
        System.out.println("Nome: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Peso: ");
        String peso = leitura.nextLine();
        System.out.println("Tipo: ");
        String tipo = leitura.nextLine();
        System.out.println("Quantidade estoque: ");
        int qEstoque = leitura.nextInt();
        System.out.println("Valor: ");
        float valor = leitura.nextFloat();

        TortaAlgodao tortaAlgodao = new TortaAlgodao(tipo, nome, peso, valor, qEstoque);
        produtos.add(tortaAlgodao);
        System.out.println("Torta de Algodão cadastrada com sucesso!");
    }
    /**
            * Método para cadastrar um novo produto do tipo Soja.
            * Captura informações do produto via entrada do usuário e adiciona o produto à lista de produtos.
     */
    public void cadastrarSoja() {
        System.out.println("Cadastrando Soja");
        System.out.println("Nome: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Peso: ");
        String peso = leitura.nextLine();
        System.out.println("Tipo (Farelo ou Casca): ");
        String tipo = leitura.nextLine();
        System.out.println("Quantidade estoque: ");
        int qEstoque = leitura.nextInt();
        System.out.println("Valor: ");
        float valor = leitura.nextFloat();

        Soja soja = new Soja(tipo, nome, peso, valor, qEstoque);
        produtos.add(soja);
        System.out.println("Soja cadastrada com sucesso!");
    }
    /**
            * Método para cadastrar um novo produto do tipo Adubo.
            * Captura informações do produto via entrada do usuário e adiciona o produto à lista de produtos.
     */
    public void cadastrarAdubo() {
        System.out.println("Cadastrando Adubo");
        System.out.println("Nome: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Peso: ");
        String peso = leitura.nextLine();
        System.out.println("Tipo de Adubo: ");
        String tipo = leitura.nextLine();
        System.out.println("Quantidade estoque: ");
        int qEstoque = leitura.nextInt();
        System.out.println("Valor: ");
        float valor = leitura.nextFloat();
        System.out.println("É orgânico? (S/N): ");
        boolean organico = leitura.nextBoolean();

        Adubo adubo = new Adubo(tipo, nome, peso, valor, qEstoque, organico);
        produtos.add(adubo);
        System.out.println("Adubo cadastrado com sucesso!");
    }
    /**
            * Método para cadastrar um novo produto do tipo Glifosato.
            * Captura informações do produto via entrada do usuário e adiciona o produto à lista de produtos.
     */
    public void cadastrarGlifosato() {
        System.out.println("Cadastrando Glifosato");
        System.out.println("Nome: ");
        leitura.nextLine();
        String nome = leitura.nextLine();
        System.out.println("Valor: ");
        String valor = leitura.nextLine();
        System.out.println("Quantidade em Estoque: ");
        float qEstoque = leitura.nextFloat();
        System.out.println("Volume em Litros: ");
        float volumeEmLitros = leitura.nextFloat();

        Glifosato glifosato = new Glifosato(nome, valor, qEstoque, volumeEmLitros);
        produtos.add(glifosato);

        System.out.println("Glifosato cadastrado com sucesso!");
    }
    /**
     * Método para listar todos os produtos que têm peso.
     * Exibe os detalhes de cada produto com peso na lista de produtos.
     */
    public void listarProdutosComPeso() {
        System.out.println("Produtos com Peso:");
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoComPeso) {
                System.out.println("--------------------------------");
                produto.detalhes();
            }
        }
    }
    /**
     * Método para listar todos os produtos que não têm peso.
     * Exibe os detalhes de cada produto sem peso na lista de produtos.
     */
    public void listarProdutosSemPeso() {
        System.out.println("Produtos sem Peso:");
        for (Produto produto : produtos) {
            if (produto instanceof ProdutoSemPeso) {
                System.out.println("--------------------------------");
                produto.detalhes();
            }
        }
    }
    /**
     * Método para realizar uma venda.
     * Captura informações da venda via entrada do usuário e adiciona a venda à lista de vendas.
     */
    public void realizarVenda(){
        boolean encontrou = false;
        System.out.println("Nome do produto: ");
        leitura.nextLine();
        String nome = leitura.nextLine();

        for(Produto produto: produtos){
            if(nome.equals(produto.getNome())){
                System.out.println(" ");
                encontrou = true;
                System.out.println("Digite a quantidade de venda: ");
                int quantidade = leitura.nextInt();
                if(produto.getqEstoque() < quantidade){
                    System.out.println("Estoque insuficiente");
                }else{
                    produto.setqEstoque(produto.getqEstoque() - quantidade);
                    Venda venda = new Venda(quantidade, nome, produto.getPeso(), produto.getValor(), produto.getqEstoque());
                    vendas.add(venda);
                    System.out.println("Venda realizada com sucesso!!");
                }
                break;
            }
        }
        if(!encontrou){
            System.out.println(" ");
            System.out.println("Produto não encontrado!!");
        }
    }
    /**
     * Método para exibir um relatório de todas as vendas realizadas.
     * Exibe os detalhes de cada venda na lista de vendas.
     */
    public void relatorioVendas(){
        for(Venda venda: vendas){
            System.out.println("--------------------------------");
            venda.detalhes();
        }
    }

}

