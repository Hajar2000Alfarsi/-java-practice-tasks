import java.util.Scanner;

public class class15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num : ");
        int first =Math.abs(sc.nextInt());
        System.out.println("Enter second num : ");
        int second =Math.abs(sc.nextInt());
        class15 ex15 = new class15();
        System.out.println(ex15.teenSum(first,second));
    }
    public int teenSum(int a, int b){
        int sum=a+b;
        int result=0;
        if((a>=13 && a<=19)||(b>=13 && b<=19)){
            result=19;
        }else {
            result=sum;
        }
        return result;
    }
}
