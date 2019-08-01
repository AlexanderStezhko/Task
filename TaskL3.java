public class TaskL3 {
    public static void taskL3_2 (){
      int[] array = new int[100];
        for(int i=0;i<array.length;i++){
            for (int j=0;j<1000;j++){
                if (j%13==0||j%17==0){
                array[i]=j;
          }
        }
      }
    }
}