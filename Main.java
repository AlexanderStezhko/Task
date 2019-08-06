import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
          //task1();
        /*Запросить у пользователя 2 слова. Если они одинаковы
 - вы вести "Отлично! Слова одинаковы ".
 Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
 Если они отличаются, но одной длины - "Ну, хотя бы они одной длины "
 Использовать методы класса String: equals (String string), equalsIgnoreCase (String string), length ()*/

        //task2();
        // task2b();
        /*Имеется целое число, вводимое пользователем с консоли. Это число  -   сумма денег в рублях.
Вывести это число, добавив к нему слово "рубль" в правильном падеже"рубль", "рублей", "рубля").
        a. Использовать конструкцию if -else.
        b. Модифицировать в switch в отдельном файле.*/

        //task3();

        /*Написать программу, которая считывает год, введённый пользователем, иопределяет, является ли этот год високосным.
Год считается високосным, если он делится без остатка на 4. Однако, если год также
делится на 100, то этот год не високосный, за исключением годов,делящихся на 400.
Например:1992-високосный 1900- не високосный 2000-високосный.*/
        //task4();
        /*4*. Написать программу, которая считывает число, месяц и год, введённые
пользователем в виде трёх целых чисел.Программа должна определять, является ли введённая дата реальной и
выводить результат.Использовать следующую информацию:Январь, март, май, июль, август, октябрь, декабрь
-31 деньАпрель, июнь, сентябрь, ноябрь-30 дней.Февраль-28 дней в обычный год, 29 дней в високосный*/

        //taskL3_1();
        /*Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.*/

        //taskL3_2();
        /*Напишите программу, заносящую вмассивпервые 100
натуральных чисел, делящихся на 13 или на 17, и печатающую его.*/

        //taskL3_3();    //не готова
        /*Определить сумму элементов целочисленного массива,расположенных между ближайшими
минимальным и максимальным значениями, не включая минимальное и
максимальное значение*/


        //taskL3_4 ();
        /*Создать массив из  3  случайных целых чисел из отрезка [10;99],
 вывести его на экран в строку.  Определить и вывести на экран сообщение о том, является ли
 массив строго возрастающей последовательностью*/
        //taskL3_5();
        /*Создать двухмерный квадратный массив, и заполнить его "бабочкой" Вывести его на экран, заменив 1 символом *, а 0-пробелом.*/

        //taskL3_6();
        // Написать метод equals, который определяет, равны ли между собой соответствующие элементы 2-х двумерных массивов.
        //taskL3_7();
       /* Написать программу, эмулирующую выдачу случайной карты из
        колоды в 52 карты.
                Вывести результат в формате "Карта of Масть". Например, "AceofSpades".  Валет -   Jack,Дама  - Queen,
Король - King,Туз - Ace, Червы  - Hearts,Пики  - Spades, Трефы - Clubs,Бубны  -  Diamonds*/

        //taskL3_8();
        /*Написать программу, перемешивающую и печатающую списоккарт в колоде.Воспользоваться результатом предыдущей задачи.*/

        //taskL3_9();
        /*Имеется целое число, определить является ли это число простым,т.е.делится без остатка только на 1 и себя.*/

        //taskL3_10a();
        //taskL3_10b();
        /*Написать алгоритм расчета факториала , используя циклы (for и while).*/




    }

    public static void taskL3_1 (){
        int[] array= {2,6,5,7,9,5,6,7};
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for (int i= array.length - 1 ; i>=0 ; i--) {
            System.out.print(array[i]+" ");
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
        int summ=0;
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
    public static void taskL3_5(){
        char[][] array = {{  42,42,42,42,42},
                            {32,42,42,42,32},
                            {32,32,42,32,32},
                            {32,42,42,42,32},
                            {42,42,42,42,42}};
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");

            }
            System.out.println(" ");
        }
    }
    public static void taskL3_6() { //пропускает ввод строки i0j1
        Scanner in = new Scanner(System.in);
        System.out.println("Введите желаемую размерность массивов");
        int scanInt = in.nextInt();
        String[][] array = new String[scanInt][scanInt];
        String[][] array2 = new String[scanInt][scanInt];
        int countEqualsValue = 0;
        double matchPercentage;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Введите данные для заполнения массива 1,соотвествующие i №" + i + "j№" + j);
                array[i][j] = in.nextLine();
                System.out.println("Введите данные для заполнения массива 2,соотвествующие i №" + i + "j№" + j);
                array2[i][j] = in.nextLine();
            }
        }
        in.close();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j].equals(array2[i][j])) {
                    countEqualsValue += 1;
                }
            }
        }
        matchPercentage = (countEqualsValue / Math.pow(scanInt, 2)) * 100;
        System.out.println("Масссивы совпадают на" + matchPercentage + "%");
    }

    public static void taskL3_7(){

        String[] deckOfCards=      {"2 of Hearts","3 of Hearts","4 of Hearts","5 of Hearts","6 of Hearts","7 of Hearts","8 of Hearts","9 of Hearts","10 of Hearts","Jack of Hearts","Qeen of Hearts","King of Hearts","Ace of Hearts",
                "2 of Spades","3 of Spades","4 f Spades","5 f Spades","6 f Spades","7 f Spades","8 f Spades","9 f Spades","10 f Spades","Jack f Spades","Qeen f Spades","King f Spades","Ace f Spades",
                "2 of Clubs","3 of Clubs","4 of Clubs","5 of Clubs","6 of Clubs","7 of Clubs","8 of Clubs","9 of Clubs","10 of Clubs","Jack of Clubs","Qeen of Clubs","King of Clubs","Ace of Clubs",
                "2 of Diamonds","3 of Diamonds","4 of Diamonds","5 of Diamonds","6 of Diamonds","7 of Diamonds","8 of Diamonds","9 of Diamonds","10 of Diamonds","Jack of Diamonds","Qeen of Diamonds","King of Diamonds","Ace of Diamonds"};

        int value = (int) ((Math.random()*52));

        System.out.println(deckOfCards[value]);
    }
    public static void taskL3_8(){

        String[] deckOfCards=      {"2 of Hearts","3 of Hearts","4 of Hearts","5 of Hearts","6 of Hearts","7 of Hearts","8 of Hearts","9 of Hearts","10 of Hearts","Jack of Hearts","Qeen of Hearts","King of Hearts","Ace of Hearts",
                                    "2 of Spades","3 of Spades","4 f Spades","5 f Spades","6 f Spades","7 f Spades","8 f Spades","9 f Spades","10 f Spades","Jack f Spades","Qeen f Spades","King f Spades","Ace f Spades",
                                    "2 of Clubs","3 of Clubs","4 of Clubs","5 of Clubs","6 of Clubs","7 of Clubs","8 of Clubs","9 of Clubs","10 of Clubs","Jack of Clubs","Qeen of Clubs","King of Clubs","Ace of Clubs",
                                    "2 of Diamonds","3 of Diamonds","4 of Diamonds","5 of Diamonds","6 of Diamonds","7 of Diamonds","8 of Diamonds","9 of Diamonds","10 of Diamonds","Jack of Diamonds","Qeen of Diamonds","King of Diamonds","Ace of Diamonds"};
        for (int i=0;i<52;i++){
            int randomValue=(int) ((Math.random()*52));
            String tmp = deckOfCards[i];
            deckOfCards[i]=deckOfCards[randomValue];
            deckOfCards[randomValue]=tmp;

        }
        for (int i=0;i<52;i++){
            System.out.println(deckOfCards[i]);
        }




    }





    public static void taskL3_9(){
        Scanner in= new Scanner(System.in);
        System.out.println("Введите целое число");
        int value;
        value = in.nextInt();
        int count=0;
        for (int i=1;i<=value;i++){
            if (value %i==0) {
                count++;
            }
        }
        if (count==2){
            System.out.println("Число является простым");
        }
        else {
            System.out.println("Число не является простым");
        }
    }

    public static void taskL3_10a(){
        Scanner in= new Scanner(System.in);
        System.out.println("Введите число");
        int value;
        value = in.nextInt();
        long factorial=1l;

        for (int i=1;i <=value;i++){
            factorial = (factorial *i);
        }
        System.out.println("Факториал числа равен:" + factorial);

    }
    public static void taskL3_10b() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int value;
        value = in.nextInt();
        long factorial = 1;
        int i=1;
        while ( i<= value){
            factorial *=i;
            i++;
        }
        System.out.println("Факториал числа равен:" + factorial);

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
            System.out.println(summ + " " + "Рубль");}
        else if (summ%1>0||summ%10<5){
            System.out.println(summ+ " " + "Рубля");}
        else if (summ>4){
            System.out.println (summ+ " " + "Рублей");}
    }
    public static void task3(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input random year");
        int year = in.nextInt();
        if (year%400==0||year%4==0 && year%100!=0 ){
            System.out.println ("Год високосный");}
        else{
            System.out.println ("Год не високосный");}
    }

    public static void task2b(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input random year");
        int year = in.nextInt();
        int a = 0;
        if (year%400==0||year% 4 == 0 && year%100 != 0 )
        {
            a++;
        }

        switch(a){
            case 0:
                System.out.println("Год не високосный");
                break;
             case 1:
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


