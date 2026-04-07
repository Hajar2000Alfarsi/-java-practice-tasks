import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer to check  : ");
        int num =sc.nextInt();
        System.out.println("Enter outside Mode: ");
        boolean outsideMode =sc.nextBoolean();
        task13 ex13 = new task13();
        System.out.println(ex13.in1To10(num, outsideMode));
    }
    public boolean in1To10(int n, boolean outsideMode){
        boolean result=false;
        if(outsideMode==false && 1<=n && n<=10){
            result=true;
        }else if(outsideMode==true && n<=1 && n>=10){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
