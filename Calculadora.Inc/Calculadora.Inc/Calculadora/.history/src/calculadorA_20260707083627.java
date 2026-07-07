@SuppressWarnings("all")

public class calculadorA{

    // ATRIBUTOS
    private double num1;
    private double num2;

    // CONSTRUTOR
    public calculadorA(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // MÉTODOS GET & SET
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    // MÉTODOS DE OPERAÇÕES
    public double soma(){
        System.out.println("A soma de " + num1 + " + " + num2 + " resulta em.. ");
        return this.num1 + this.num2;
    }

    public double subtração(){
        System.out.println("A subtração de " + num1 + " + " + num2 + " resulta em.. ");
        return this.num1 - this.num2;
    }

    public double multiplicação(){
        System.out.println("A multiplicação de " + num1 + " + " + num2 + " resulta em.. ");
        return this.num1 * this.num2;
    }

    public double divisão(){
        System.out.println("A a divisão de " + num1 + " + " + num2 + " resulta em.. ");
        return this.num1 / this.num2;
    }



}