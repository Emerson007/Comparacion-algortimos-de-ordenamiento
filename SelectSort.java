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
public class SelectSort {
    public static void main(String[] args){
        
        
        Random ra = new Random();
        int n = 1000000;
        int [] arreglo = new int [n];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = ra.nextInt(100);
        }
        
        SelectionSort(arreglo);
    }
    
    public static void SelectionSort(int[] a){
         
        for (int i = 0; i < a.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[index])
                    index = j;
      
            int smallerNumber = a[index]; 
            a[index] = a[i];
            a[i] = smallerNumber;
        }
        
         /*for(int i=0;i<a.length;i++){
            System.out.println(i+ ". "+ a[i]);
        }*/
        //System.out.print(Arrays.toString(a));
    }

}
