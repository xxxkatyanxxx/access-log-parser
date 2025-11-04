import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number1 = new Scanner(System.in).nextInt();

        System.out.println("Введите число");
        int number2 = new Scanner(System.in).nextInt();


        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println((double) number1/number2);
        scanner.close();



    }
}
