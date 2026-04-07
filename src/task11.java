import java.util.Scanner;
//task11
public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your stylishness: ");
        int you = Math.abs(sc.nextInt());
        System.out.println("Enter date’s stylishness: ");
        int date = Math.abs(sc.nextInt());
        task11 ex11 = new task11();
        System.out.println(ex11.dateFashion(you, date));
    }

    public int dateFashion(int you, int date){
        int result=0;
        if(you<=2 || date<=2){
            result=0;
        }else if(you>=8 || date >=8){
            result=2;
        } else {
            result=1;
        }
        return result;
    }
}
