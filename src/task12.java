import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your first number: ");
        int first = Math.abs(sc.nextInt());
        System.out.println("Enter your second number: ");
        int second = Math.abs(sc.nextInt());
        task12 ex12 = new task12();
        System.out.println(ex12.sortaSum(first, second));
    }
    public int sortaSum(int a, int b){
        int result=0;
        int sum=a+b;
        if(10<=sum && sum<=19){
            result=20;
        }else {
            result=sum;
        }
        return result;
    }
}
