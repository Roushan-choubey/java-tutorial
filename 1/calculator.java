import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int a= new Scanner(System.in).nextInt();
        int b= new Scanner(System.in).nextInt();    
       // calculator obj = new calculator();
       // obj.add(10, 20);
    }
    void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum = " + c);

    }
    void subtract(int a, int b) {
        int c = a - b;
        System.out.println("Difference = " + c);
    }
    void multiply(int a, int b) {
        int c = a * b;
        System.out.println("Product = " + c);
    }
    void divide(int a, int b) {
        if (b != 0) {
            int c = a / b;
            System.out.println("Quotient = " + c);
        } else {
            System.out.println("Error: Division by zero");
        }
    }
    
}
