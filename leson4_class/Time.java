package leson4_class;

public class Time {
    int hours=0;
    int minutes=0;
    int seconds=0;



    Time (int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;

    }
    public Time(int seconds){
        this.seconds=seconds;
        this.hours=seconds/3600;
        this.minutes=(seconds%3600)/60;
        this.seconds=seconds -(hours*3600 + minutes*60);
    }
    public int timeOnSeconds( Time obj){
        int timeOnSecondsValue= this.hours*3600+ this.minutes*60+ this.seconds;
//        System.out.println(timeOnSecondsValue);
        return  timeOnSecondsValue;
    }
    public void output (Time obj){
        System.out.println (this.hours+ ":"+this.minutes+":"+this.seconds);
    }




}



