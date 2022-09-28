import java.util.Scanner;

public class $_22_math_class_demo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a number :");
        int num1=scan.nextInt();
        System.out.println("enter a number:");
        int num2=scan.nextInt();
        System.out.println(Math.max(num1,num2));//maximum value
        System.out.println(Math.min(num1,num2));//minimum value
        System.out.println(Math.abs(-1));//absolute value 1
        System.out.println(Math.pow(2,3));//2 to the power 3=8
        System.out.println(Math.round(8.8F));//it will round up the value
        System.out.println(Math.PI);//it will give the value of PI

    }
}
