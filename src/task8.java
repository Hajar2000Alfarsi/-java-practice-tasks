import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = Math.abs(sc.nextInt());
        System.out.println("Enter second number: ");
        int second = Math.abs(sc.nextInt());
        System.out.println("Enter third number: ");
        int third = Math.abs(sc.nextInt());
        task8 ex8=new task8();
        System.out.println(ex8.lastDigit(first,second,third));
    }

    public boolean lastDigit(int a, int b, int c){
        boolean result=false;
        int first=a%10;
        int second=b%10;
        int third=c%10;
        if(first==second || second==third || first==third){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
}
