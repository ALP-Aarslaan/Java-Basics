import java.util.Scanner;

public class $_13_if_else_if_else {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=scan.nextInt();
        if(num>0){
            System.out.println("positive");
        }
        else if(num<0) {
            System.out.println("negative");
        }
        else if(num==-1){
            System.out.println("-1");
        }
        else{
            System.out.println("Zero");
        }
    }
}
