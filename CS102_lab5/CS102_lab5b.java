package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] forward = {'A', 's', 'h', 'h', 'u', 'd'};
        int[] array0 = {1,77,-5,2,65,30};
        int[] array1 = {-10,50,15,2,77};

        int[] sorted0 = Main.mySort(array0);
        int[] sorted1 = Main.mySort(array1);

        System.out.println(Arrays.toString(sorted0));
        System.out.println(Arrays.toString(sorted1));


    }

    //Integers
    public static int[] mySort(int[] inputArray){
        int arraySize = inputArray.length;
        for (int i = 0; i < arraySize - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arraySize; j++) {
                if (inputArray[j] < inputArray[index]){
                    index = j;
                }
            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[index];
            inputArray[index] = temp;
        }
        return inputArray;
    }
}
