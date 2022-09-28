import java.util.Scanner;

public class $_9_area_of_triangle {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        double base,height;
        System.out.println("enter base:");
        base=scan.nextDouble();
        System.out.println("enter height:");
        height=scan.nextDouble();
        double area=((double)1/2*base*height);
        System.out.println("area of triangle : "+area);
        double r;
        System.out.println("enter radius:");
        r=scan.nextDouble();
        double area1=3.1416*(r*r);
        System.out.println("area of circle : "+area1);
    }
}
