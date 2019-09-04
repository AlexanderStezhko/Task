package lesson7_string;
import java.util.Scanner;

public class regionMatchesTest {
    public static void main(String[] args) {
        System.out.println("Введите значение строки");
        Scanner sc=new Scanner(System.in);
        String str1 =sc.nextLine();
        System.out.println("Введите слово");
        String str2 =sc.next();

        System.out.print("Возвращаемое значение по итогу проверки начала строки ");
        System.out.println(str1.regionMatches(0, str2, 0, str2.length()));
        System.out.print("Возвращаемое значение по итогу проверки конца строки: ");
        System.out.println(str1.regionMatches((str1.length()-str2.length()), str2, 0, str2.length()));




    }
}
