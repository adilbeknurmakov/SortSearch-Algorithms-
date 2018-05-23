/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortsearch;

/**
 *
 * @author Адильбек
 */
public class BubbleSort {

    public static int bubble(int[] arr) {
        int temp;
        boolean sorted = true;
        while (sorted == true) {
            sorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {//8>5
                    temp = arr[i + 1];//preserves 5
                    arr[i + 1] = arr[i];//puts 8 in 5
                    arr[i] = temp;//puts 5 in 8
                    sorted = true;

                }

            }
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        return 1;

    }

    public static void main(String[] args) {
        int[] atc = {9, 5, 13, 25, 1,12,99};
        bubble(atc);
    }
}
