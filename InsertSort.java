/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;


import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author emerson
 */
public class InsertSort {
      public static void main(String[] args){
        
        
        Random ra = new Random();
        int n = 1000000;
        int [] arreglo = new int [n];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = ra.nextInt(100);
        }
        
        InsertionSort(arreglo);
    }
    
    public static void InsertionSort(int [] a){
       for (int i = 1; i < a.length; i++) {
            int next = a[i];
            // find the insertion location while moving all larger element up
            int j = i;
            while (j > 0 && a[j - 1] > next) {
                a[j] = a[j - 1];
                j--;
            }
            // insert the element
            a[j] = next;
        }
        
        
      /*  for(int i=0;i<a.length;i++){
            System.out.println(i+ ". "+ a[i]);
        }*/
    }  
}
