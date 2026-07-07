import java.util.Scanner;

@SuppressWarnings("all")

public class main {
    public static void main(String[] args) {

        // ABRE SCAN
        Scanner uk = new Scanner(System.in);
        int opcao = 0;

        // CICLO ENQUANTO NÃO FOR SELECIONADO "SAIR"
        while (opcao != 3){
            System.out.println("@========================================@");
            System.out.println("|        MULTIUSO DO CONHECIMENTO        |");
            System.out.println("| -------------------------------------- |");
            System.out.println("|     SELECIONE O MODO DE UTILIZAÇÃO     |");
            System.out.println("|    -> 1. CALCULAR                      |");
            System.out.println("|    -> 2. VER CONCEITOS                 |");
            System.out.println("|    -> 3. SAIR                          |");
            System.out.println("#========================================#");
            System.out.println("\n");

            opcao = uk.nextInt();
            
            // OPÇÕES PARA O MODO CALCULADORA
            switch(opcao) {
                case (1): 
                    int operacao = 0;

                    while (operacao != 5) {
                        calculadorA c1 = new calculadorA(5, 9);

                        System.out.println("@========================================@");
                        System.out.println("|        --- MODO CALCULADORA ---        |");
                        System.out.println("#========================================#");
                        c1.exibirnum();
                        System.out.println("\n");
                        System.out.println("@=======================================@");
                        System.out.println("| Selecione qual operação deseja fazer: |");
                        System.out.println("| ------------------------------------- |");
                        System.out.println("#=======================================#");

                        System.out.println("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Voltar ao menu principal\n");

                        operacao = uk.nextInt();

                        if (operacao == 5) {
                            break;
                        }

                        switch (operacao) {
                            case (1):
                                System.out.println(c1.soma()); 
                                break;
                            case (2): 
                                System.out.println(c1.subtração()); 
                                break;
                            case (3): 
                                System.out.println(c1.multiplicação()); 
                                break;
                            case (4): 
                                System.out.println(c1.divisão()); 
                                break;
                            default: 
                                System.out.println("Opção inválida!"); 
                                break;
                        }
                    }
                    break;
                
                case (2):
                    int conceito = 0;

                    // OPÇÕES PARA O MODO CONCEITUAL
                    while (conceito != 16) {
                        System.out.println("\n");
                        System.out.println("|=======================================|");
                        System.out.println("|        --- MODO CONCEITUAL ---        |");
                        System.out.println("|=======================================|");
                        System.out.println("\nSelecione qual conceito deseja visualizar:");
                        con.exibirMenu();
                        

                        conceito = uk.nextInt();

                        if (conceito == 5) {
                            break;
                        }

                        conceitos con = new conceitos();

                        switch (conceito) {
                            case (1):
                                con.con1(); 
                                break;
                            case (2): 
                                con.con2();  
                                break;
                            case (3): 
                                con.con3();  
                                break;
                            case (4): 
                                con.con4(); 
                                break;
                            case (5):
                                con.con5();
                                break;
                            case (6):
                                con.con6(); 
                                break;
                            case (7): 
                                con.con7();  
                                break;
                            case (8): 
                                con.con8();  
                                break;
                            case (9): 
                                con.con9(); 
                                break;
                            case (10):
                                con.con10();
                            break;
                            case (11):
                                con.con11(); 
                                break;
                            case (12): 
                                con.con12();  
                                break;
                            case (13): 
                                con.con13();  
                                break;
                            case (14): 
                                con.con14(); 
                                break;
                            case (15):
                                con.con15();
                                break;
                            default: 
                                System.out.println("Opção inválida!"); 
                                break;
                        }
                    }
                    break;

                // OPÇÃO PARA SAIR DO PROGRAMA
                case (3):
                    System.out.println("Saindo do programa...");
                    break;

                // MENSAGEM DE ERRO CASO OPÇÃO SEJA INVÁLIDA
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        uk.close();
    }
}