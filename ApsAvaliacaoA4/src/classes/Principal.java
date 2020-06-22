package classes;

public class Principal {
    public static void main(String[] args) {
        
       ManipularFuncoes manFun = new ManipularFuncoes();
        
       int opcao, menu;
       
       do{
           System.out.println(" ");
           System.out.println("Digite a opção desejada");
           System.out.println("1 - Cadastrar Cliente");
           System.out.println("2 - Excluir Cliente");
           System.out.println("3 - Listar Cliente");
           System.out.println("4 - Cadastrar Produto");
           System.out.println("5 - Listar Produtos");
           System.out.println("6 - Excluir Produto");
           System.out.println("7 - Realizar Venda");
           System.out.println("8 - Relatorio de Vendas");
           System.out.println("9 - Detalhes - opção extra");
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
                   
                case 4:
                    System.out.println(" ");
                    System.out.println("Cadastrando Produto");
                    do{
                        System.out.println(" ");
                        System.out.println("1 - Ração de Cachorro");
                        System.out.println("2 - Ração de Gato");
                        System.out.println("0 - Retornar ao menu");
                        menu = manFun.leitura.nextInt();
                        switch(menu){
                            case 1:
                                System.out.println(" ");
                                manFun.cadastrarCachorro();
                                break;
                            case 2:
                                System.out.println(" ");
                                manFun.cadastrarGato();
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
                   
                case 5:
                    System.out.println(" ");
                    System.out.println("Listando Produtos");
                    do{
                        System.out.println(" ");
                        System.out.println("1 - Ração de Cachorro");
                        System.out.println("2 - Ração de Gato");
                        System.out.println("0 - Retornar ao menu");
                        menu = manFun.leitura.nextInt();
                        switch(menu){
                            case 1:
                                System.out.println(" ");
                                manFun.listarCachorro();
                                break;
                            case 2:
                                System.out.println(" ");
                                manFun.listarGato();
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
                            System.out.println("1 - Excluir produto");
                            System.out.println("0 - Retornar ao menu");
                            menu = manFun.leitura.nextInt();
                            switch(menu){
                                case 1:
                                    System.out.println(" ");
                                    manFun.excluirProduto();
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
                case 8:
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
                    
                case 9:
                     System.out.println(" ");
                    manFun.detalhesExtra();
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
