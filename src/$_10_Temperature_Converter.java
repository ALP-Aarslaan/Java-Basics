import java.util.Scanner;

public class $_10_Temperature_Converter {
    public static void main(String[] args) {
        //Celsius to Fahrenheit
        Scanner scan =new Scanner (System.in);
        System.out.println("enter value in celsius :");
        double celsius=scan.nextDouble();
        double temperature= ((9*celsius)+(5*32))/5;
        System.out.println("Temperature in fahrenheit : "+temperature);

        //Fahrenheit to Celsius
        System.out.println("enter value in fahrenheit :");
        double fahrenheit=scan.nextDouble();
        double temp=(5*(fahrenheit-32))/9;
        System.out.println("temperature in celsius :"+temp);
    }
}
