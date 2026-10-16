import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("a-ni daxil edin:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("b-ni daxil edin;");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Emeliyyatlari daxil edin:+,-,*,/");
        char operation = new Scanner(System.in).nextLine().charAt(0);

        int result = 0;
        if (operation == '+')
            result = a+b;
        else if (operation == '-')
            result = a-b;
        else if (operation == '*')
            result = a*b;
        else if (operation == '/')
            result = a/b;
        else
            System.out.println("Emeliyyat yanlisdir:");
        System.out.println("Netice = " + result);
    }
}