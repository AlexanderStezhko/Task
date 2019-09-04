package lesson7_string;

public class WordSeparation {
    public static void main(String[] args){
        String text="sxrdcgjszsxcfghjnsdcfg ctfvghbj     dfcgvhbjn dfgvhjn dcfgvhj   a   dfgvhj dsxfcgvhbj dxfgvhj tfgyh";
        String[] stringArray=text.split("\\s+");
        System.out.println(stringArray.length);

    }
}
