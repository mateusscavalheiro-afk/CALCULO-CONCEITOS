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

        while (true){
            //sla opções
        }
        // caso escolha calculadora
        System.out.println("Selecione qual operação deseja fazer:");
        int operacao = 1;
        operacao = uk.nextInt();
        calculadorA c1 = new calculadorA(2,6);
            switch (operacao) {
                case (1): c1.soma();
                case (2): c1.subtração();
                case (3): c1.multiplicação();
                case (4): c1.divisão();
                case (5): //retorna para o menu principal
                default: System.out.println("Opção inválida!"); break;
            }
        uk.close();
    }
}
