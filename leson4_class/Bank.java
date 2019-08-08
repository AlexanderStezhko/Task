package leson4_class;

public class Bank {
    static int nom20 =6;
    static int nom50=5;
    static int  nom100=2;
    int summOfMoney;



     public Bank(int summOfMoney){
        this.summOfMoney=summOfMoney;

    }

    public void addMoneyOnBank(int nom20,int nom50,int nom100){    //add Scanner
        this.nom20+=nom20;
        this.nom50+=nom50;
        this.nom100+=nom100;
    }

    public int withDrawMoney (int moneyValue){
        boolean flag =false;
        if (summOfMoney>=moneyValue){
            if((((moneyValue%100)%50)%20==0)&&((moneyValue/100)<=nom100&&(moneyValue%100)/50<=nom50&&((moneyValue%100)%50)/20<=nom20)){
                    this.nom100-=moneyValue/100;
                    this.nom50-=(moneyValue%100)/50;
                    this.nom20-=((moneyValue%100)%50)/20;
                    this.summOfMoney-=moneyValue;
                     flag =true;

                }
            else if((((moneyValue%100)%50+50)%20==0)&&((moneyValue/100)<=nom100&&(moneyValue%100)/50<=nom50-1&&((moneyValue%100)%50)/20<=nom20)){
                this.nom100-=moneyValue/100;
                this.nom50-=(moneyValue%100)/50-1;
                this.nom20-=((moneyValue%100)%50)/20;
                this.summOfMoney-=moneyValue;
                flag =true;

            }
            else if (((moneyValue%100)%20==0)&&(moneyValue/100<=nom100&&(moneyValue%100)/20<=nom20)){
                this.nom100-=moneyValue/100;
                this.nom20-=(moneyValue%100)/20;
                this.summOfMoney-=moneyValue;
                flag=true;

            }
            else if (((moneyValue%50)%20==0)&&(moneyValue/50<=nom50&&(moneyValue%50)/20<=nom20)){
                this.nom50-=moneyValue/50;
                this.nom20-=(moneyValue%50)/20;
                this.summOfMoney-=moneyValue;
                flag=true;

            }                }
            else if ((moneyValue%20==0)&&(moneyValue/20<=nom20)){

                this.nom20-=moneyValue/20;
                this.summOfMoney-=moneyValue;
                flag=true;

         }
            if (flag){
            System.out.println("Операция проведена успешно,на вашем счету осталось:"+ this.summOfMoney);
        }
        else System.out.println("Ошибка проведения операции,на вашем счету осталось:"+ this.summOfMoney);
        return summOfMoney;
    }








}
