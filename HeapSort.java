/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author emerson
 */

import java.io.*;
import java.util.Random;

public class HeapSort {
    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    // Build-Heap Function
    public static void buildheap(int []a){
    	n=a.length-1;
    	for(int i=n/2;i>=0;i--){
    	//	System.out.println(i);
    		maxheap(a,i);
    	}
    }
    
    // Max-Heap Function
    public static void maxheap(int[] a, int i){
    	left=2*i;
    	right=2*i+1;
    	//System.out.println(i + " " + left + " " + right);
    	if(left <= n && a[left] > a[i]){
    		largest=left;
    	}
    	else{
    		largest=i;
    	}
    	
    	if(right <= n && a[right] > a[largest]){
    		largest=right;
    	}
    	if(largest!=i){
    		exchange(i,largest);
    		maxheap(a, largest);
    	}
    }
    
    // Exchange Function
    public static void exchange(int i, int j){
    	int t=a[i];
    	a[i]=a[j];
    	a[j]=t; 
    	}
    
    // Sort Function
    public static void sort(int []a0){
    	a=a0;
    	buildheap(a);
    	
    	for(int i=n;i>0;i--){
    		exchange(0, i);
    		n=n-1;
    		maxheap(a, 0);
    	}
    }
    
    public static void main(String[] args) {
	Random ra = new Random();
        int n = 1000000;
        int [] arreglo = new int [n];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = ra.nextInt(100);
        }	
    	sort(arreglo);
    	
        	for(int i=0;i<arreglo.length;i++){
    		    System.out.println(i +". "+arreglo[i]);
    	        }
	}
    
}
