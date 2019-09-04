package lesson7_string;

public class RepetitionSearch {
    public static void main(String[] args){
        String text="sxrdcgjszzzzzzzzzsxcfghjjjjjjjjjnsdcfg vccccccctfvghbj     dffffffcgvhbjn dfgvhjn dcfgvhj   a   dfgvhj dsxfcgvhbj dxfgvhj tfgyh";
        String result =text.replaceAll("(\\w)\\1+","0");
        System.out.println(result);


    }
}
