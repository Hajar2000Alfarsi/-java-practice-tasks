import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=Math.abs(sc.nextInt());
        task4 ex4=new task4();
        System.out.println(ex4.more20(num));
    }
    public boolean more20(int n){
        boolean result=false;
        if(n%20==1 || n%20==2){
            result=true;
        }
        else{
            result=false;
        }
        return result;
    }
}
