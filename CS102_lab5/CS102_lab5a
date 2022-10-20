package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array0 = {1,77,-5,2,65,30};
        char[] forward = {'A', 's', 'h', 'h', 'u', 'd'};

        System.out.println(Main.mySearch(array0,-5));
        System.out.println(Main.mySearch(array0,32));

        System.out.println(Main.mySearch(forward, 'u'));
        System.out.println(Main.mySearch(forward, 'x'));
    }

    //integers
    public static int mySearch(int[] inputArray, int key){
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i] == key){
                return i;
            }
        }
        return -1;
    }

    //characters
    public static int mySearch(char[] inputArray, char key){
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i] == key){
                return i;
            }
        }
        return -1;
    }
}
