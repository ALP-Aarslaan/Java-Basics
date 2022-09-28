import java.util.Scanner;

public class $_7_Arithmetic_Operator {
    public static void main(String[] args) {
        int a=3,b=2;
        System.out.println("a+b = " +(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a%b = "+(a%b));
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int x=scan.nextInt();
        int y=scan.nextInt();
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
    }
}
