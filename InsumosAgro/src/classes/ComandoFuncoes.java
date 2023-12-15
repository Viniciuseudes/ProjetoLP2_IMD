package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ComandoFuncoes {
    Scanner leitura = new Scanner(System.in);
    ArrayList<Venda> vendas = new ArrayList<>();
    ArrayList<Cliente> clientes = new ArrayList();


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
}