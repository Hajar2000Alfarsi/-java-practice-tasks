import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = Math.abs(sc.nextInt());
        System.out.println("Enter second number: ");
        int second = Math.abs(sc.nextInt());
        System.out.println("Enter third number: ");
        int third = Math.abs(sc.nextInt());
        task7 ex7=new task7();
        System.out.println(ex7.twoAsOne(first,second,third));
    }

    public boolean twoAsOne(int a, int b, int c){
        boolean result=false;
        if(a+b==c || a+c==b || b+c==a){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
