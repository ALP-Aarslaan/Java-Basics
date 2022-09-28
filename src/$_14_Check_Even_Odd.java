import java.util.Scanner;

public class $_14_Check_Even_Odd {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a positive number:");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
