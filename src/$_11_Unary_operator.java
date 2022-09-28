public class $_11_Unary_operator {
    public static void main(String[] args) {
        int a=10,b=-10;
        int result=-a;
        System.out.println("result :"+result);
        int result1=-b;
        System.out.println("result1 :"+result1);
        int y=a++;
        System.out.println("Y = "+y);
        y=a;
        System.out.println("Y = "+y);
        a=10;
        int z=a--;
        System.out.println("z ="+z);
        z=a;
        System.out.println("z ="+z);
        a=10;
        ++a;

        System.out.println(a);
        int i=a;
        System.out.println(i);
        a=10;
        --a;
        System.out.println(a);
        int j=a;
        System.out.println(j);
    }
}
