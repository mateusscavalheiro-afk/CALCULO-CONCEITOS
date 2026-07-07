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
                                uk.nextLine(); 
                                System.out.println("\nPressione [ENTER] para voltar ao menu de operações...");
                                uk.nextLine();
                                break;
                            case (2): 
                                System.out.println(c1.subtração());
                                uk.nextLine(); 
                                System.out.println("\nPressione [ENTER] para voltar ao menu de operações...");
                                uk.nextLine(); 
                                break;
                            case (3): 
                                System.out.println(c1.multiplicação());
                                uk.nextLine(); 
                                System.out.println("\nPressione [ENTER] para voltar ao menu de operações...");
                                uk.nextLine();
                                break;
                            case (4): 
                                System.out.println(c1.divisão());
                                uk.nextLine(); 
                                System.out.println("\nPressione [ENTER] para voltar ao menu de operações...");
                                uk.nextLine();
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

                        uk.nextLine(); 
                        System.out.println("\nPressione [ENTER] para voltar ao menu de conceitos...");
                        uk.nextLine();

                    }
                    break;

                // OPÇÃO PARA SAIR DO PROGRAMA
                case (3):
                    System.out.println("Saindo do programa...");
                    break;

                // INDUSTRIA 4.0
                case (2011):
                    System.out.println("\n[AVISO] INICIANDO PROTOCOLO SECRETO DA INDÚSTRIA 4.0...");
                    
                    for (int i = 0; i <= 100; i += 5) {
                        
                        System.out.print("\rCarregando Sistema: [");
                    
                        int blocos = i / 5;
                        
                        for (int j = 0; j < 20; j++) {
                            if (j < blocos) {
                                System.out.print("="); 
                            } else if (j == blocos) {
                                System.out.print(">"); 
                            } else {
                                System.out.print(" "); 
                            }
                        }
                        
                        System.out.print("] " + i + "%");
                        
                        try {
                            Thread.sleep(150);
                        } catch (InterruptedException e) { }
                    }
                    System.out.println("\n");
                    System.out.println("                      .,,uod8B8bou,,.                            ");
                    System.out.println("             ..,uod8BBBBBBBBBBBBBBBBRPFT?l!i:.                   ");
                    System.out.println("        ,=m8BBBBBBBBBBBBBBBRPFT?!||||||||||||||                  ");
                    System.out.println("        !...:!TVBBBRPFT||||||||||!!^^\"\"'   ||||                  ");
                    System.out.println("        !.......:!?|||||!!^^\"\"'            ||||                  ");
                    System.out.println("        !.........||||                     ||||                  ");
                    System.out.println("        !.........||||  ##                 ||||                  ");
                    System.out.println("        !.........||||                     ||||                  ");
                    System.out.println("        !.........||||                     ||||                  ");
                    System.out.println("        !.........||||                     ||||                  ");
                    System.out.println("        !.........||||                     ||||                  ");
                    System.out.println("        `.........||||                   ,||||                   ");
                    System.out.println("         .;.......||||              _.-!!|||||                   ");
                    System.out.println("   .,uodWBBBBb.....||||       _.-!!|||||||||!:'                  ");
                    System.out.println("!YBBBBBBBBBBBBBBb..!|||:..-!!|||||||!iof68BBBBBb....             ");
                    System.out.println("!..YBBBBBBBBBBBBBBb!!||||||||!iof68BBBBBBRPFT?!::   `.           ");
                    System.out.println("!....YBBBBBBBBBBBBBBbaaitf68BBBBBBRPFT?!:::::::::    `.          ");
                    System.out.println("!......YBBBBBBBBBBBBBBBBBBBRPFT?!::::::;:!^\"`;:::      `.        ");
                    System.out.println("!........YBBBBBBBBBBRPFT?!::::::::::^''...::::::;        iBBbo.  ");
                    System.out.println("`..........YBRPFT?!::::::::::::::::::::::::;iof68bo.     WBBBBbo.");
                    System.out.println("  `..........:::::::::::::::::::::::;iof688888888888b.     `YBBBP^'");
                    System.out.println("    `........::::::::::::::::;iof688888888888888888888b.     `    ");
                    System.out.println("      `......:::::::::;iof688888888888888888888888888888b.        ");
                    System.out.println("        `....:::;iof688888888888888888888888888888888899fT!       ");
                    System.out.println("          `..::!8888888888888888888888888888888899fT|!^\"'         ");
                    System.out.println("            `' !!988888888888888888888888899fT|!^\"'               ");
                    System.out.println("                `!!8888888888888888899fT|!^\"'                     ");
                    System.out.println("                 `!98                                              ");
                    System.out.println("\n VIVA A TECNOLOGIA E A AUTOMAÇÃO!");
                    System.out.println("\n\n");
                    
                    try {
                        Thread.sleep(3000); 
                    } catch (InterruptedException e) { }
                    break;
                
                case (1822):
                    System.out.println("\n[SISTEMA] Iniciando rastreamento de frequência...");
                    
                    try {
                        Thread.sleep(3000); 
                    } catch (InterruptedException e) { }

                    for (int i = 0; i < 60; i++) {
                        
                        // 1. A MATEMÁTICA DA ONDA
                        // O 'i' vezes 0.3 determina a "velocidade" da curva.
                        // O 'Math.sin' gera o balanço.
                        // O '* 20' é a amplitude (largura da onda, vai balançar 20 espaços).
                        // O '+ 20' empurra a onda para a direita para não termos "espaços negativos".
                        double calculoOnda = (Math.sin(i * 0.3) * 20) + 20;
                        int espacos = (int) calculoOnda;
                        
                        // Criamos os espaços em branco para empurrar o símbolo para a direita
                        for (int s = 0; s < espacos; s++) {
                            System.out.print(" ");
                        }
                    
                        System.out.println("*");
                        
                        // Pausa 80 milissegundos antes de imprimir a próxima linha
                        try {
                            Thread.sleep(80);
                        } catch (InterruptedException e) { }
                    }
                    
                    System.out.println("\n[SISTEMA] Frequência estabilizada.");
                    try {
                        Thread.sleep(2000); 
                    } catch (InterruptedException e) { }
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