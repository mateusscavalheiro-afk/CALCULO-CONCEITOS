import java.util.Scanner;

@SuppressWarnings("all")

public class main {
    public static void main(String[] args) {

        Scanner uk = new Scanner(System.in);
        int opcao = 1;
        
        System.out.println("========================================================================");
        System.out.println("==XxX CALCULADORA XxX==");
        System.out.println("-> SELECIONE O MODO DE UTILIZAÇÃO");
        System.out.println("-> 1. CALCULAR");
        System.out.println("-> 2. VER CONCEITOS");
        System.out.println("-> 3. SAIR");
        System.out.println("========================================================================");
        
        opcao = uk.nextInt();

        switch (opcao) {
            case (1): calculadorA c1 = new calculadorA(2,6); break;
            case (2): System.out.println("Conceito");
            case (3): System.out.println("Saindo.."); break;
            default: System.out.println("Opção inválida!"); break;
        }
        uk.close();
    }
}
