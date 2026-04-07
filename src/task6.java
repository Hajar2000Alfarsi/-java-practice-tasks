import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tea: ");
        int tea = Math.abs(sc.nextInt());
        System.out.println("Enter number of candy: ");
        int candy = Math.abs(sc.nextInt());
        task6 ex6=new task6();
        System.out.println(ex6.teaParty(tea,candy));
    }

    public int teaParty(int tea, int candy){
        int isGood=0;
        if(tea<5 || candy<5){
            isGood=0;
        }else if(tea>=2*candy || candy>=2*tea){
            isGood=2;
        }else{
            isGood=1;
        }
        return isGood;
    }
}
