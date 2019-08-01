import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //  task1();
        /*Запросить у пользователя 2 слова. Если они одинаковы
 - вы вести "Отлично! Слова одинаковы ".
 Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
 Если они отличаются, но одной длины - "Ну, хотя бы они одной длины "
 Использовать методы класса String: equals (String string), equalsIgnoreCase (String string), length ()*/

        //task2();
        /*Имеется целое число, вводимое пользователем с консоли. Это число  -   сумма денег в рублях.
Вывести это число, добавив к нему слово "рубль" в правильном падеже"рубль", "рублей", "рубля").
                a. Использовать конструкцию if -else.
        b. Модифицировать в switch в отдельном файле.*/

        //task3();
        //task3b(); //не работает!!! Нужна консультация по выполнению.
        /*Написать программу, которая считывает год, введённый пользователем, иопределяет, является ли этот год високосным.
Год считается високосным, если он делится без остатка на 4. Однако, если год также
делится на 100, то этот год не високосный, за исключением годов,делящихся на 400.
Например:1992-високосный 1900- не високосный 2000-високосный.*/


        task4();
        /*4*. Написать программу, которая считывает число, месяц и год, введённые
пользователем в виде трёх целых чисел.Программа должна определять, является ли введённая дата реальной и
выводить результат.Использовать следующую информацию:Январь, март, май, июль, август, октябрь, декабрь
-31 деньАпрель, июнь, сентябрь, ноябрь-30 дней.Февраль-28 дней в обычный год, 29 дней в високосный*/
    }




    public static void task1 (){
        Scanner in = new Scanner(System.in);
        System.out.println ("Input first word");
        String FirstWord = in.next();
        System.out.println ("Input second word");
        String SecondWord =in.next();
        if ( FirstWord.equals (SecondWord)){
            System.out.println ("�������! ����� ���������");}
        else if (FirstWord.equalsIgnoreCase (SecondWord)){
            System.out.println ("������. ����� ���������");}
        else if (FirstWord.length() ==SecondWord.length()){
            System.out.println("��, ���� �� ��� ����� �����");}

    }
    public static void task2(){
        Scanner in = new Scanner(System.in);
        System.out.println ("Input Summ of money");
        double summ = in.nextDouble();

        if (summ%10==1 && summ%100!=11){
            System.out.println(summ + " " + "Рубль");}    /*upgrade with switch operator*/
        else if (summ%1>0){
            System.out.println(summ+ " " + "Рубля");}
        else if (summ>5){
            System.out.println (summ+ " " + "Рублей");}
    }
    public static void task3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input random year");
        int year = in.nextInt();
        if (year%400==0 ){
            System.out.println ("Год високосный");}
        else if (year%4==0 && year%100!=0){
            System.out.println ("Год високосный");}
        else{
            System.out.println ("Год не високосный");}
    }
    public static void task3b(){                    /*Нужна консультация: Switch-case не поддерживает логические операторы.Не знаю как прописать этот код правильно*/
        Scanner in = new Scanner(System.in);
        System.out.println("Input random year");
        int year = in.nextInt();
        switch(year){
            case(year%400==0):
                System.out.println("Год високосный");
                break;
            case (year% 4 == 0 && year%100 != 0):
                System.out.println("Год високосный");
                break;
        }

    }

    public static void task4() {
            Scanner in = new Scanner(System.in);
            System.out.println ("Input year");
            int year = in.nextInt();
            System.out.println ("Input month");
            int month = in.nextInt();
            System.out.println ("Input day");
            int day = in.nextInt();
            int flag ;
            int monthlength=0;

            flag = leapCheck (year);
            monthlength= monthLength (month,flag,monthlength);
            checkData (year,month,day,monthlength);

    }
        private static int leapCheck(int year) {
            int flag;
            if (year%400==0 ){
                flag =1 ;
            }
            else if (year%4==0 && year%100!=0){
                flag = 1;
            }
            else{
                flag = 0;
            }
            return flag;
        }


        private static int monthLength(int month,int flag, int monthlength){
            switch (month){
                case 1:
                    monthlength=31;
                    break;
                case 2:
                    if (flag==1){
                        monthlength =29;}
                    else monthlength=28;
                    break;
                case 3:
                    monthlength=31;
                    break;
                case 4:
                    monthlength=30;
                    break;
                case 5:
                    monthlength=31;
                    break;
                case 6:
                    monthlength=30;
                    break;
                case 7:
                    monthlength=31;
                    break;
                case 8:
                    monthlength=31;
                    break;
                case 9:
                    monthlength=30;
                    break;
                case 10:
                    monthlength=31;
                    break;
                case 11:
                    monthlength=30;
                    break;
                case 12:
                    monthlength=31;
                    break;
            }
            return monthlength;
        }
        private static void checkData(int year, int month, int day, int monthlength) {
            if (year>2019){
                System.out.println("incorrect date");
                return;
            }
            if (month<1||month>12){
                System.out.println("incorrect date");
                return;
            }
            if ( day<0||day > monthlength){
                System.out.println("incorrect date");
            }
            else{
                System.out.println("Correct data");
            }
        }
}


