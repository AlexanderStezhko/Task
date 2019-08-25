package leson4_class;

public class Bank {
    public static void addNom20(int nom20) {
        Bank.nom20 += nom20;
    }

    public static void addNom50(int nom50) {
        Bank.nom50 += nom50;
    }

    public static void addNom100(int nom100) {
        Bank.nom100 += nom100;
    }

    static int nom20 = 6;//купюры,находящиеся в банкомате
    static int nom50 = 5;
    static int nom100 = 0;
    int getNom20=0;   //счетчик купюр на выдачу
    int getNom50=0;
    int getNom100=0;
    int summOfMoney; // сумма на счету
    boolean flag;    //флажок выполнения условия


    public Bank(int summOfMoney) {
        this.summOfMoney = summOfMoney;

    }
    public void checkSumm(){
        System.out.println("Сумма на счету составляет: "+summOfMoney);
    }

    public void startWithDraw(int desiredAmount){     //запуск метода подбра купюр,их вывода и результата успешности операции
        checkWithDrow(desiredAmount);
        printResult(flag);
    }
    public void checkWithDrow(int desiredAmount) {    //подбор необходимого набора купюр
        int afterDesiredAmount=desiredAmount;
        if (afterDesiredAmount <= summOfMoney) {
            while (afterDesiredAmount >= 100 && nom100 >= 1) {
                afterDesiredAmount -= 100;
                nom100 -= 1;
                getNom100++;
            }
            while (afterDesiredAmount >= 50 && nom50 >= 1) {
                afterDesiredAmount -= 50;
                nom50--;
                getNom50++;
            }
            while (afterDesiredAmount>=20 && nom20>=1){
                afterDesiredAmount-=20;
                nom20--;
                getNom20++;
            }
        }

        if (afterDesiredAmount%20!=0 && (afterDesiredAmount+50)%20==0){
            nom50++;
            getNom50--;
            afterDesiredAmount+=50;
            while (afterDesiredAmount>=20 && nom20>=1) {
                afterDesiredAmount -= 20;
                nom20--;
                getNom20++;
            }
        }

        if (afterDesiredAmount==0){
            summOfMoney-=desiredAmount;
            flag=true;
        }
        else{
            flag=false;
        }


    }
    public void printResult(boolean flag){    // вывод результатов
        if (flag){
            System.out.println("Операция проведена успешно");
            System.out.println("Купюр выдано:\n"+"Номиналом 100 - "+getNom100+"\nНоминалом 50 - "+getNom50+"\nНоминалом 20 - "+getNom20);
            System.out.println("Сумма на счету:"+summOfMoney);
        }
        else System.out.println("Некорректная сумма");

    }
}
