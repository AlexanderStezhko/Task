import java.util.Scanner;

public class tyui {
    public static void task3b(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input random year");
        int year = in.nextInt();
        switch(year){
            case(year%400==0 ):
                System.out.println("Год високосный");
                break;
                case (year % 4 == 0 && year % 100 != 0):
                    System.out.println("Год високосный");

                break;
            }default System.out.println ("Год не високосный");

}
