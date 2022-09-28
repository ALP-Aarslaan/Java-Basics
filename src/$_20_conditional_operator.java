import java.util.Scanner;

public class $_20_conditional_operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a numbers:");
        int num1=scan.nextInt();
        System.out.println("enter a number:");
        int num2=scan.nextInt();
        int large=(num1>num2)?num1:num2;
        System.out.println("larger number is :"+large);
    }
}
