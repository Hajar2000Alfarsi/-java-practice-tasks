import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = Math.abs(sc.nextInt());
        System.out.println("Enter second number: ");
        int second = Math.abs(sc.nextInt());
        task9 ex9=new task9();
        System.out.println(ex9.maxMod5(first,second));
    }

    public int maxMod5(int a, int b){
        int result=0;
        if(a==b) {
            result = 0;
        }else if(a%5==b%5){
            if(a<b){result=a;}
            else{result=b;}
            }else {
            if(a>b){result=a;}
            else{result=b;}
        }
        return result;
    }
}
