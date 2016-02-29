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
public class QuickSort {
    public static void main(String[] args){
        
        
        Random ra = new Random();
        int n = 1000000;
        int [] arreglo = new int [n];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = ra.nextInt(100);
        }
        
     
       quicksort(arreglo,0,arreglo.length - 1);
       /*for(int i = 0; i<arreglo.length;i++){
            System.out.println(i+". "+arreglo[i]);
        }*/
    }
    
    public static void quicksort(int A[], int izq, int der) {

           int pivote=A[izq]; 
           int i=izq; 
           int j=der; 
           int aux;
 
           while(i<j){            
             while(A[i]<=pivote && i<j) i++; 
               while(A[j]>pivote) j--;         
               if (i<j) {                                            
                aux= A[i];                  
                A[i]=A[j];
                A[j]=aux;
               }
           }
           A[izq]=A[j]; 
           A[j]=pivote; 
           if(izq<j-1)
             quicksort(A,izq,j-1); 
           if(j+1 <der)
             quicksort(A,j+1,der); 
   }
    
 
}
