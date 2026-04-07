import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = Math.abs(sc.nextInt());
        System.out.println("Enter second number: ");
        int second = Math.abs(sc.nextInt());
        System.out.println("Enter third number: ");
        int third = Math.abs(sc.nextInt());
        task10 ex10=new task10();
        System.out.println(ex10.blueTicket(first,second,third));
    }

    public int blueTicket(int a, int b, int c){
        int ab=a+b;
        int bc=b+c;
        int ac=a+c;
        int result=0;
        if(ab==10 || bc==10 || ac ==10){
            result=10;
        }else if (ab==bc+10 || ab==ac+10){
            result=5;
        }
        return result;
    }
}
