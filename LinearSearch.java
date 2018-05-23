/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortsearch;

import static sortsearch.BubbleSort.bubble;

/**
 *
 * @author Адильбек
 */
public class LinearSearch {
    public static int search(int[] arr, int value){
        int result = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        System.out.println(result);
    
        return result;
    }
    public static void main(String[] args) {
        int[] atc = {9, 5, 13, 25, 1,12,99};
       search(atc,5);
    }
}

