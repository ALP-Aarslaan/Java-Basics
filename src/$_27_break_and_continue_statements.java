public class $_27_break_and_continue_statements {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i==11){
                break;
            }
            System.out.println(i);
        }
        for(int i=1;i<=50;i++){
            if(i==11){
                continue;
            }
            System.out.println(i);
        }
    }
}
