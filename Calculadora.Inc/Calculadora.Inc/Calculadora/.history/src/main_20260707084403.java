@SuppressWarnings("all")

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        calculadorA c1 = new calculadorA(3, 8);
        
        System.out.println("========================================================================");
        System.out.println("==XxX CALCULADORA XxX==");
        System.out.println("-> SELECIONE O MODO DE UTILIZAÇÃO");

        Scanner scanner = new Scanner(String.in);
        
        opcao = scanner.next().toUpperCase().charAt(0);
        
        switch (opcao) {
            case :
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
