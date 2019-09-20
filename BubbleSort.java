package main.java.com.sort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    private int[] inputArray;

    public void setinputArray(int[] array){
        this.inputArray = array;
    }

    public int[] getinputArray(int[] array){
        return this.inputArray;
    }

    public int[] bubbleSort(int[] array){
        for (int rep = 0; rep < array.length; rep++)
            for (int i = 0; i < array.length; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        return array;
    }

}
