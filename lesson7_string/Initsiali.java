package lesson7_string;
import java.util.Scanner;

public class Initsiali {
    public static void main(String[] args){
        String name=null;
        String secondName=null;
        String patronymic=null;
        System.out.println("Введите Фамилию, имя и отчество");
        Scanner sc=new Scanner(System.in);
        secondName=sc.next();
        name=sc.next();
        patronymic=sc.next();
        String fio = name+" "+secondName+" "+patronymic;
        String result=fio.toUpperCase();
        System.out.println(result);


    }
}
