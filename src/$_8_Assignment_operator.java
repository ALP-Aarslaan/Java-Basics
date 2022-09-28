import java.util.Scanner;

public class $_8_Assignment_operator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number :");
        int num1=scan.nextInt();
        num1+=5;//num1=20+5=25;
        System.out.println(num1);
        num1-=5;//num1=25-5=20;
        System.out.println(num1);
        num1*=5;//num=20*5=100;
        System.out.println(num1);
        num1/=5;//num1=100/5=20
        System.out.println(num1);
        num1%=5;//num1=20%5=0
        System.out.println(num1);
    }
}
