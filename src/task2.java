import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your speed ");
        int speed=sc.nextInt();
        System.out.println("is your birthday? (true/false) ");
        boolean isBirthday=sc.nextBoolean();
        task2 ex2=new task2();
        int result=ex2.caughtSpeeding(speed,isBirthday);
        if(result==0){
            System.out.println("no ticket  ");
        }else if(result==1){
            System.out.println(" small ticket");
        }else if(result==2){
            System.out.println("big ticket ");
        }

    }

    public int caughtSpeeding(int speed, boolean isBirthday){
        int ticket=0;
        if (speed<=65 && isBirthday==true){
            ticket=0;
        }else if (speed>=66 && speed<=85 && isBirthday==true){
            ticket=1;
        }else if (speed>=86 && isBirthday==true){
            ticket=2;
        }
        if (speed<=60 && isBirthday==false){
            ticket=0;
        }else if (speed>=61 && speed<=81 && isBirthday==false){
            ticket=1;
        }else if (speed>=81 && isBirthday==false){
            ticket=2;
        }
        return ticket;
    }
}
