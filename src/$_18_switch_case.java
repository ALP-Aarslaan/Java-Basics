import java.util.Scanner;

public class $_18_switch_case {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number 0-9");
        int num=scan.nextInt();
        switch(num){
            case 0:
                System.out.println("one");
                break;
            case 1:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("not a digit");
        }
    }
}
