package classes;

public class Principal {
    public static void main(String[] args) {

       ComandoFuncoes manFun = new ComandoFuncoes();

        int opcao, menu;


        do {
<<<<<<< HEAD
            try {
                System.out.println("\n╔════════════════════════════╗");
                System.out.println("║         MENU PRINCIPAL     ║");
                System.out.println("╚════════════════════════════╝");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Excluir Cliente");
                System.out.println("3 - Listar Cliente");
                System.out.println("4 - Cadastrar Produto");
                System.out.println("5 - Listar Produtos");
                System.out.println("0 - Finalizar Sistema");
                System.out.println("╚════════════════════════════╝");
                System.out.print("Escolha uma opção: ");
                opcao = manFun.leitura.nextInt();
=======

            System.out.println("\033[1;33m");
            System.out.println("\n╔════════════════════════════╗");
            System.out.println("║         MENU PRINCIPAL     ║");
            System.out.println("╚════════════════════════════╝");
            System.out.println("\033[0m");
            System.out.println("╔════════════════════════════╗");
            System.out.println("║ 1 - Cadastrar Cliente      ║");
            System.out.println("║ 2 - Excluir Cliente        ║");
            System.out.println("║ 3 - Listar Cliente         ║");
            System.out.println("║ 4 - Cadastrar Produto      ║");
            System.out.println("║ 5 - Listar Produto         ║");
            System.out.println("║ 6 - Realizar Venda         ║");
            System.out.println("║ 7 - Relatar Vendas         ║");
            System.out.println("║ 0 - Finalizar Sistema      ║");
            System.out.println("╚════════════════════════════╝");
            opcao = manFun.leitura.nextInt();
>>>>>>> e84d42103c37d6f67f49b9d773aa197ba36acd79

            switch(opcao){
                case 1:
                    System.out.println("\033[1;32m");
                    System.out.println("\n╔════════════════════════════╗");
                    System.out.println("║    Cadastrando Cliente     ║");
                    System.out.println("╚════════════════════════════╝");
                    System.out.println("\033[0m");
                    do{
                        System.out.println("╔════════════════════════════╗");
                        System.out.println("║ 1 - Cadastrar Cliente      ║");
                        System.out.println("║ 0 - Retornar ao menu       ║");
                        System.out.println("╚════════════════════════════╝");
                        menu = manFun.leitura.nextInt();
                        switch(menu){
                            case 1:
                                System.out.println(" ");
                                manFun.cadastrarCliente();

                                break;
                            case 0:
                                System.out.println(" ");
                                System.out.println("Retornando ao menu!");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Opção Invalida!!");
                        }
                    }while(menu != 0);
                    break;

                case 2:
                    System.out.println(" ");
                    System.out.println("Excluindo Cliente");
                    do{
                        System.out.println(" ");
                        System.out.println("1 - Excluir Cliente");
                        System.out.println("0 - Retornar ao menu");
                        menu = manFun.leitura.nextInt();
                        switch(menu){
                            case 1:
                                System.out.println(" ");
                                manFun.excluirCliente();
                                break;
                            case 0:
                                System.out.println(" ");
                                System.out.println("Retornando ao menu!");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Opção Invalida!!");
                        }
                    }while(menu != 0);
                    break;

                case 3:
                    System.out.println(" ");
                    System.out.println("Listar Cliente");
                    do{
                        System.out.println(" ");
                        System.out.println("1 - Listar Clientes");
                        System.out.println("2 - Listar cliente por nome");
                        System.out.println("0 - Retornar ao menu");
                        menu = manFun.leitura.nextInt();
                        switch(menu){
                            case 1:
                                System.out.println(" ");
                                manFun.listarClientes();
                                break;
                            case 2:
                                System.out.println(" ");
                                manFun.ListarClientePorNome();
                                break;
                            case 0:
                                System.out.println(" ");
                                System.out.println("Retornando ao menu!");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Opção Invalida!!");
                        }
                    }while(menu != 0);
                    break;

                case 4:
                    System.out.println(" ");
                    System.out.println("Cadastrando Produto");
                    do{
                        System.out.println(" ");
                        System.out.println("1 - MILHO");
                        System.out.println("2 - SORGO");
                        System.out.println("3 - SOJA");
                        System.out.println("4 - TORTA DE ALGODÃO");
                        System.out.println("5 - ADUBO");
                        System.out.println("6 - GLISOFATO");
                        System.out.println("0 - Retornar ao menu");
                        menu = manFun.leitura.nextInt();
                        switch(menu){
                            case 1:
                                System.out.println(" ");
                                manFun.cadastrarMilho();
                                break;
                            case 2:
                                System.out.println(" ");
                                manFun.cadastrarSorgo();
                                break;
                            case 3:
                                System.out.println(" ");
                                manFun.cadastrarSoja();
                                break;
                            case 4:
                                System.out.println(" ");
                                manFun.cadastrarTortaAlgodao();
                                break;
                            case 5:
                                System.out.println(" ");
                                manFun.cadastrarAdubo();
                                break;
                            case 6:
                                System.out.println(" ");
                                manFun.cadastrarGlifosato();
                                break;
                        }
                    }while(menu != 0);
                    break;

                case 5:
                    System.out.println(" ");
                    System.out.println("Listando Produtos");
                    do{
                        System.out.println(" ");
                        System.out.println("1 - Produto com Peso");
                        System.out.println("2 - Produto sem Peso");
                        System.out.println("0 - Retornar ao menu");
                        menu = manFun.leitura.nextInt();
                        switch(menu){
                            case 1:
                                System.out.println(" ");
                                manFun.listarProdutosComPeso();
                                break;
                            case 2:
                                System.out.println(" ");
                                manFun.listarProdutosSemPeso();
                                break;
                            case 0:
                                System.out.println(" ");
                                System.out.println("Retornando ao menu!");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Opção Invalida!!");
                        }
                    }while(menu != 0);
                    break;

                case 6:
                    System.out.println(" ");

                    if(manFun.produtos.isEmpty()){
                        System.out.println("Nenhuma produto cadastrado!!");
                    }else{
                        do{
                            System.out.println(" ");
                            System.out.println("Realizando Venda");
                            System.out.println("1 - Realizar venda");
                            System.out.println("0 - Retornar ao menu");
                            menu = manFun.leitura.nextInt();
                            switch(menu){
                                case 1:
                                    System.out.println(" ");
                                    manFun.realizarVenda();
                                    break;
                                case 0:
                                    System.out.println(" ");
                                    System.out.println("Retornando ao menu!");
                                    break;
                                default:
                                    System.out.println(" ");
                                    System.out.println("Opção Invalida!!");
                            }
                        }while(menu != 0);
                    }
                    break;

                case 7:
                    System.out.println(" ");
                    if(manFun.vendas.isEmpty()){
                        System.out.println("Nenhuma produto vendido!!");
                    }else{
                        System.out.println(" ");
                        System.out.println("Relatorio de Vendas");
                        manFun.relatorioVendas();
                        System.out.println("0 - Retornar ao menu");
                        menu = manFun.leitura.nextInt();
                        if(menu == 0){
                            break;
                        }else{
                            System.out.println("Opção invalida!!");
                        }
                    }
                    break;
                case 0:
                    System.out.println(" ");
                    System.out.println("Finalizando Sistema!!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
            } catch (InputMismatchException ime) {
                System.err.println("Erro: Entrada inválida. Por favor, digite um número.");
                menu.next();  // Limpa a entrada incorreta
            } catch (Exception e) {
                System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        } while (opcao != 0);

        menu.close();

    }

}
