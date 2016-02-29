/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Random;

/**
 *
 * @author emerson
 */
public class BubbleSort {
    public static void main(String[] args){
        
        
        Random ra = new Random();
        int n = 1000000;
        int [] arreglo = new int [n];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = ra.nextInt(100);
        }
        
        BubbleSort(arreglo);
    }
    public static void BubbleSort(int[] A){
        int temp = 0;
        for(int i=0; i < A.length; i++){
                        for(int j=1; j < A.length; j++){
                               
                                if(A[j-1] > A[j]){
                                        //swap the elements!
                                        temp = A[j-1];
                                        A[j-1] = A[j];
                                        A[j] = temp;
                                }
                               
                        }
                }
        
       // for(int i = 0; i<A.length;i++){
         //   System.out.println(A[i]);
        //}
    }
    
}
