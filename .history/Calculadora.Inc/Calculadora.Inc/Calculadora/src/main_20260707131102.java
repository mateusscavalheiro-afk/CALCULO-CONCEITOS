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

                    conceitos con = new conceitos();

                    // OPÇÕES PARA O MODO CONCEITUAL
                    while (conceito != 16) {
                        System.out.println("\n");
                        System.out.println("|=======================================|");
                        System.out.println("|        --- MODO CONCEITUAL ---        |");
                        System.out.println("|=======================================|");
                        System.out.println("\nSelecione qual conceito deseja visualizar:");
                        con.exibirMenu();
                        System.out.println("16. Voltar ao menu principal\n");

                        conceito = uk.nextInt();

                        if (conceito == 16) {
                            break;
                        }

                        con.mostrarConceito(conceito);

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