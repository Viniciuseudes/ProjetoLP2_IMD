package classes;

public class Principal {
    public static void main(String[] args) {

       ComandoFuncoes manFun = new ComandoFuncoes();

        int opcao, menu;

        do{
            System.out.println(" ");
            System.out.println("Digite a opção desejada");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Excluir Cliente");
            System.out.println("3 - Listar Cliente");
            System.out.println("0 - Finalizar Sistema");
            opcao = manFun.leitura.nextInt();
            System.out.println(" ");

            switch(opcao){
                case 1:
                    System.out.println(" ");
                    System.out.println("Cadastrando Cliente");
                    do{
                        System.out.println(" ");
                        System.out.println("1 - Cadastrar Cliente");
                        System.out.println("0 - Retornar ao menu");
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
