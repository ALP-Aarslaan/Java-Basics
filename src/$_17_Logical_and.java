import java.util.Scanner;

public class $_17_Logical_and {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a letter :");
        char ch=scan.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("Capital Letter");
        }
        else if(ch>='a'&& ch<='z'){
            System.out.println("Small Letter");
        }
        else if(ch>='0'&& ch<='9'){
            System.out.println("digit");
        }
        else{
            System.out.println("special character");
        }
    }
}
