package main.java.com.bubble;


public class BubbleSort {

    private int[] inputArray;

    private void setinputArray(int[] array){
        this.inputArray = array;
    }

    private int[] getInputArray(){
        return this.inputArray;
    }

    public int[] bubbleSort(int[] array) throws RuntimeException{
        setinputArray(array);
        if (inputArray.length == 0)
            throw new RuntimeException("Empty Array");
        for (int rep = 0; rep < inputArray.length-1; rep++)
            for (int i = 0; i < inputArray.length-rep-1; i++){
                if(inputArray[i] > inputArray[i+1]){
                    int temp = inputArray[i+1];

                    inputArray[i+1] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
        return getInputArray();
    }

}
