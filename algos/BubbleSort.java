package algos;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 6,3,8,4,9,1,5,0,2,7};
        int temp;

        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr.length-1; j++){
                if(arr[j+1] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
