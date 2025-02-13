package algos;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = { 6,3,8,4,9,1,5,0,2,7};
        int indx, temp;

        for(int i=0; i<arr.length-1; i++){
            indx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[indx]){
                    indx = j;
                }
            }

            temp = arr[i];
            arr[i] = arr[indx];
            arr[indx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
