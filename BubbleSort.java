package main.java.com.bubble;


public class BubbleSort {

    private int[] inputArray;

    private void setinputArray(int[] array){
        this.inputArray = array;
    }

    private int[] getInputArray(){
        return this.inputArray;
    }

    public int[] bubbleSort(int[] array){
        setinputArray(array);
        for (int rep = 0; rep < inputArray.length; rep++)
            for (int i = 0; i < inputArray.length; i++){
                if(inputArray[i] > inputArray[i+1]){
                    int temp = inputArray[i+1];
                    inputArray[i] = temp;
                    inputArray[i+1] = inputArray[i];

                }
            }
        return getInputArray();
    }

}
