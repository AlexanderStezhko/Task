package lesson7_string;
import java.lang.String;

public class ReplaceSmile {
    public static void main(String[] args){
        String str="xcvbnm,. :( fcghbjnfcghvblknbvv:)sdcvbnjuygfvc bnjhygf:(:(:(:(";
        String result= str.replace(":(",":)");
        System.out.println(result);
    }
}
