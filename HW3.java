package Lesson3;
import java.util.Random;


public class HW3 {
    public static Random random = new Random();

    public static void main(String[] args) {

        System.out.println("#1");
        int[] array = createArray(10,2);
        printText(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i]==0){
                array[i]=1;
            }else {
                array[i]=0;
            }
        }
        printText(array);
        System.out.println();
        System.out.println("#2");
        int[] array2 = createArray(100,100);
        printText(array2);
        System.out.println();
        System.out.println("#3");
        int[] array3 = createArray(12,12);
        printText(array3);
        for (int i = 0; i < array3.length; i++) {
            if (array3[i]<6){
                array3[i]=array3[i]*2;
            }
         }

        printText(array3);
        System.out.println();
        System.out.println("#4");
        int[][] array4 = new int[9][9];
        for (int i = 0; i < array4.length; i++){
            for (int j = 0; j < array4.length; j++){
                if (i == j){
                    array4[i][j]=1;
                } else if ( (i+j)==(array4.length-1) ){
                    array4[i][j]=1;
                }
                else{
                    array4[i][j]=0;
                }
            }
        }
        for (int i = 0; i < array4.length; i++){
            for (int j = 0; j < array4.length; j++){
                System.out.print(array4[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("#5");
        int[] array5 = createArrayinitialValue(10,12);
        printText(array5);

        System.out.println();
        System.out.println("#6");
        int[] array6 = createArray(10,50);
        printText(array6);
        System.out.println();
        int min = array6[0];
        int max = array6[0];
        for(int i = 1; i < array6.length; i++){
            if (min > array6[i]){
                min = array6[i];
            }
            if (max < array6[i]){
                max = array6[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }

    public static int[] createArray(int upper, int sizer) {
        int[] array = new int[upper];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(sizer);
        }
        return array;
    }
    public static void printText(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
    public static int[] createArrayinitialValue(int len , int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

}