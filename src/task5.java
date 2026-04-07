import java.util.Map;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = Math.abs(sc.nextInt());
        task5 ex5=new task5();
        System.out.println(ex5.nearTen(num));
    }
    public boolean nearTen(int num){
        boolean isNearTen=false;
        int mod10=num%10;
        if(mod10==0 || mod10==1 || mod10==2 || mod10==8 || mod10==9){
            isNearTen=true;
        }else {
            isNearTen=false;
        }
        return isNearTen;
    }
}