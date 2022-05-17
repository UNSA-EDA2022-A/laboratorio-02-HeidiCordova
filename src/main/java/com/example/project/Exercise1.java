//package com.example.project;

import java.util.Scanner;
import java.util.Arrays;
public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

public boolean esCuadradoPerfecto(int numero) {
		String numCadena= Integer.toString(numero);
	    int[] numerO= new int[numCadena.length()];
	  if(numero>-1) {
		  if(numCadena.length()==1 ) {
	  	    	if(numerO[0]!=0) {
	  	    		condiciones(numerO);
	  	    	
	  	    	}
	  	    	else {
	  	    		return false;
	  	    	}
		  }else {
			  for (int i = 0; i < numCadena.length();i++) {
				  numerO[i]=Integer.parseInt(numCadena.substring(i,i+1));
			  }
	    		  if((numerO[numerO.length-1]==2)||
	  					(numerO[numerO.length-1]==3)||
	  					(numerO[numerO.length-1]==7)||
	  					(numerO[numerO.length-1]==8)) {
	  			return false;
	  			}
	  			
	    		  return true;
	    	  }

	  }
		return false;
	}
	
	public boolean condiciones(int []numCadena) {
	
			if((numCadena[numCadena.length-1]==2)||
					(numCadena[numCadena.length-1]==3)||
					(numCadena[numCadena.length-1]==7)||
					(numCadena[numCadena.length-1]==8)) {
				return false;
			}
			
		return true;
	}
}
