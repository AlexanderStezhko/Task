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
        //task3b(); //!!!!!!!!!!!!не работает!!! Нужна консультация по выполнению.!!!!!
        /*Написать программу, которая считывает год, введённый пользователем, иопределяет, является ли этот год високосным.
Год считается високосным, если он делится без остатка на 4. Однако, если год также
делится на 100, то этот год не високосный, за исключением годов,делящихся на 400.
Например:1992-високосный 1900- не високосный 2000-високосный.*/


        //task4();
        /*4*. Написать программу, которая считывает число, месяц и год, введённые
пользователем в виде трёх целых чисел.Программа должна определять, является ли введённая дата реальной и
выводить результат.Использовать следующую информацию:Январь, март, май, июль, август, октябрь, декабрь
-31 деньАпрель, июнь, сентябрь, ноябрь-30 дней.Февраль-28 дней в обычный год, 29 дней в високосный*/

        //taskL3_1();//не работает, пропускает обратный цикл
        /*Напишите программу, которая печатает массив сначала в
        обычном порядке, затем в обратном.*/

        //taskL3_2();
        /*Напишите программу, заносящую вмассивпервые 100
натуральных чисел, делящихся на 13 или на 17, и печатающую его.*/
        //taskL3_3();//уточнить условие
        /*Определить сумму элементов целочисленного массива,расположенных между ближайшими
минимальным и максимальным значениями, не включая минимальное и
максимальное значение*/

        //taskL3_4 ();
        /*Создать массив из  3  случайных целых чисел из отрезка [10;99],
 вывести его на экран в строку.  Определить и вывести на экран сообщение о том, является ли
 массив строго возрастающей последовательностью*/


    }

    public static void taskL3_1 (){
        int[] array= {2,6,5,7,9,5,6,7};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        for (int i= array.length - 1 ; i<0 ; i--) {
            System.out.println(array[i]);    // пропускает обратный цикл, пишет, что i<0 всегда false
        }
    }
    public static void taskL3_2 (){
        int[] array = new int[100];
        int tmp=0;
        for(int i=0;i<array.length;i++){
            for (int j = ++tmp;j<999999999;j++){
                boolean flag;
                flag = false;
                if (j%13==0||j%17==0){
                    array[i]=j;
                    System.out.println(array[i]+" ");
                    flag = true;
                    tmp=j;
                }
                    if (flag)  {
                        break;
                }
            }
        }
    }
    public static void taskL3_3(){
        int[] array=new int [20];
        int[] indexMinValue = new int[20];
        int[] indexMaxValue = new int[20];
        for (int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*10);
        }
        for (int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        int min=100;
        int max=0;
        long summ=0;
        boolean flagMaxValue;
        boolean flagMinValue;
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
                break;
            }
            else if (array[i]<min){
                min=array[i];
            }
        }
        for (int j=0;j<indexMaxValue.length;j++){
            flagMaxValue=false;
            for(int i =0;i<array.length;i++){
                if (array[i]==max) {
                    indexMaxValue[j] = i;
                    flagMaxValue=true;
                }
                if (flagMaxValue){
                    break;
                }

            }
        }
        for (int j=0;j<indexMinValue.length;j++){
            flagMinValue=false;
            for(int i =0;i<array.length;i++){
                if (array[i]==min) {
                    indexMinValue[j] = i;
                    flagMinValue=true;
                }
                if (flagMinValue){
                    break;
                }

            }
        }
//        for (int j=0;j<array.length;j++){
//            if(indexMinValue[j]+2==indexMaxValue[j]){
//                summ+=array[indexMinValue[j]+1];
//            }
//            else {
//                summ+=array[indexMinValue[j]-1]+array[indexMaxValue[j]+1];
//            }
//        }
        for (int j=0;j<array.length;j++){
            int presentValueIndexMin=indexMinValue[j];
            int presentValueIndexMax=indexMaxValue[j];
            if(indexMinValue[j]<indexMaxValue[j]){
                if (presentValueIndexMin+1!=presentValueIndexMax-1) {
                    summ += array[ presentValueIndexMin+ 1] + array[presentValueIndexMax - 1];
                }
                else {
                    summ += array[presentValueIndexMin + 1];
                }
             }
            else {
                if ((presentValueIndexMin - 1) != (presentValueIndexMax + 1)) {
                    summ += array[presentValueIndexMin - 1] + array[presentValueIndexMax + 1];
                } else{
                    summ += array[presentValueIndexMin - 1];
                }
            }
        }
        System.out.println("");
        System.out.println ( summ );
    }

    public static void taskL3_4 (){
        boolean flag=false;
        int[] array =new int[3];
        for(int i=0; i<array.length;i++){
        array[i]= (int) (Math.random()*(99-10)+10);
            System.out.print (array[i]+" ");
        }
        for(int i=0;i<array.length-1;i++){
            if(array[i]>=array[i+1]){
                flag = true;
            }
        }
        if (flag){
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
        else{
            System.out.println("Массив является строго возрастающей последовательностью");

        }
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
    /*Нужна консультация: Switch-case не поддерживает логические операторы.Не знаю как прописать этот код правильно*/
    /*public static void task3b(){
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

    }*/

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

                case 2:
                    if (flag==1){
                        monthlength =29;}
                    else monthlength=28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    monthlength=30;
                    break;

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
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


