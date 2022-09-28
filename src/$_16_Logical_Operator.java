import java.util.Scanner;

public class $_16_Logical_Operator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a letter :");
        char ch=scan.next().charAt(0);
        if(ch=='A'||ch=='a'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonat");
        }
    }
}
