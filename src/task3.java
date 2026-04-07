import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1=sc.nextInt();
        System.out.println("Enter second number ");
        int num2=sc.nextInt();
        task3 ex3=new task3();
        System.out.println(ex3.love6(num1,num2));
    }

    public boolean love6(int a, int b){
        boolean is6=false;
        int add=a+b;
        int sub=Math.abs(a-b);
        if(add==6 || sub==6 || a==6 || b==6){
            is6=true;
        }else{
            is6=false;
        }
        return is6;
    }
}
