package classes;

public class Principal {
    public static void main(String[] args) {

       ComandoFuncoes manFun = new ComandoFuncoes();

        int opcao, menu;


        do {

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
            System.out.println("║ 0 - Finalizar Sistema      ║");
            System.out.println("╚════════════════════════════╝");
            opcao = manFun.leitura.nextInt();

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
                        System.out.println("2 - ");
                        System.out.println("0 - Retornar ao menu");
                        menu = manFun.leitura.nextInt();
                        switch(menu){
                            case 1:
                                System.out.println(" ");
                                manFun.cadastrarMilho();
                                break;
                        }
                    }while(menu != 0);
                    break;

                case 0:
                    System.out.println(" ");
                    System.out.println("Finalizando Sistema!!");
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Opção invalida!!");
            }

        }while(opcao != 0);

    }

}
