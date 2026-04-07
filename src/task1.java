import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Eneter number of cigars: ");
        int cigars = sc.nextInt();
        System.out.println("It is weekend? (true/false)? ");
        boolean isWeekend=sc.nextBoolean();
        task1 ex1= new task1();
        System.out.println(ex1.cigarParty(cigars,isWeekend));
            }
    public boolean cigarParty(int cigars, boolean isWeekend){
        boolean success=false;
        if(cigars>=40 && cigars<=60 && isWeekend==false){
            success= true;
        }else if (cigars>=40 && isWeekend == true){
            success =true;
        }else {
            success=false;
        }
        return success;
    }
}










