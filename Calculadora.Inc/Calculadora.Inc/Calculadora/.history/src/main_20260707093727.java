import java.util.Scanner;

@SuppressWarnings("all")

public class main {
    public static void main(String[] args) {

        Scanner uk = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3){
            System.out.println("========================================================================");
            System.out.println("==XxX CALCULADORA XxX==");
            System.out.println("   SELECIONE O MODO DE UTILIZAÇÃO");
            System.out.println("-> 1. CALCULAR");
            System.out.println("-> 2. VER CONCEITOS");
            System.out.println("-> 3. SAIR");
            System.out.println("========================================================================");

            opcao = uk.nextInt();
            
            switch(opcao) {
                case (1): 
                    int operacao = 0;

                    while (operacao != 5) {
                        calculadorA c1 = new calculadorA(5, 9);

                        System.out.println("========================================================================");
                        System.out.println("--- MODO CALCULADORA ---");
                        c1.exibirnum();
                        System.out.println("\nSelecione qual operação deseja fazer:");
                        System.out.println("1. Soma\n2. Subtração\n3. Multiplicação\n4. Divisão\n5. Voltar ao menu principal");

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

                    while (conceito != 5) {
                        System.out.println("========================================================================");
                        System.out.println("\n--- MODO CONCEITUAL ---");
                        System.out.println("Selecione qual conceito deseja visualizar:");
                        System.out.println("1. Lei de Ohm\n2. If/Else\n3. VPN\n4. Hidráulica e Pneumática\n5. Voltar ao menu principal");

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
                            default: 
                                System.out.println("Opção inválida!"); 
                                break;
                        }
                    }
                    break;

                case (3):
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
        uk.close();
    }
}
