import java.util.Scanner;

public class $_15_Vowel_consonant_Checking {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a letter:");
        char letter=scan.next().charAt(0);
        if(letter=='a'){
            System.out.println("Vowel");
        }
        else if(letter=='A'){
            System.out.println("Vowel");
        }
        else if(letter=='e'){
            System.out.println("Vowel");
        }
        else if(letter=='E'){
            System.out.println("Vowel");
        }
        else if(letter=='i'){
            System.out.println("vowel");
        }
        else if(letter=='I'){
            System.out.println("vowel");
        }
        else if(letter=='o'){
            System.out.println("Vowel");
        }
        else if(letter=='O'){
            System.out.println("Vowel");
        }
        else if(letter=='u'){
            System.out.println("Vowel");
        }
        else if(letter=='U'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }

    }
}
