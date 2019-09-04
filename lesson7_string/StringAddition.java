package lesson7_string;

public class StringAddition {
    public static void main(String[] args){
        String str1=" ";
        String str2="qwert";

        for(int i=0;i<100000;i++){
            String sb=null;
            sb+= str1+str2;

        }
        for(int i=0;i<100000;i++){

            StringBuilder sb = new StringBuilder();
            sb.append(str1).append(str2);


        }

    }
}
