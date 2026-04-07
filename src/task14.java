import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer to check  : ");
        int num =Math.abs(sc.nextInt());
        task14 ex14 = new task14();
        System.out.println(ex14.old35(num));
    }

    public boolean old35(int n){
        int divisible3= n%3;
        int divisible5= n%5;
        boolean result=false;
        if(n%3==0 && !(n%5 ==0)){
            result=true;
        }else if (!(n%3==0) && n%5 ==0){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
