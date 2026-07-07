@SuppressWarnings("all")

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.in);
        int opcao = 1;

        calculadorA c1 = new calculadorA(3, 8);
        
        System.out.println("========================================================================");
        System.out.println("==XxX CALCULADORA XxX==");
        System.out.println("-> SELECIONE O MODO DE UTILIZAÇÃO");
        
        opcao = scanner.next().toUpperCase().charAt(0);


    }
}
