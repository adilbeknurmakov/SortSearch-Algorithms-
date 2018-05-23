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
public class SortSearch {
    public static int binarySort(int [] arr, int size, int valueToSearch){
        int min=0;
        int max=size-1;
        
        while(min<max){
            
             int pivot=(min+max)/2;
            if(valueToSearch==arr[pivot]){
                return pivot;
            } else if(valueToSearch>arr[pivot]){
                min=pivot+1;
            }else {
                max=pivot-1;
            }
           
        
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arc={1,22,47,18,52};
        int result=binarySort(arc,5,18);
        
        System.out.println(result);{
            
        
//        System.out.println("number"+arc[result]+"was found"+"at position"+result);
    }
       
        
           // System.out.println("The number was not found");
        }
    }
    

