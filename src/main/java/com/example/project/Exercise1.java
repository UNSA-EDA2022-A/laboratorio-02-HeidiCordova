package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	public boolean esCuadradoPerfecto(int a) {
		String numCadena= Integer.toString(a);
	    int[] numero= new int[numCadena.length()];
	  if(a>-1) {
		  if(numCadena.length()==1 ) {
	  	    	if(numero[0]!=0) {
	  	    		condiciones(numero);
	  	    	
	  	    	}
	  	    	else {
	  	    		return false;
	  	    	}
		  }else {
			  for (int i = 0; i < numCadena.length();i++) {
				  numero[i]=Integer.parseInt(numCadena.substring(i,i+1));
			  }
	    		  if((numero[numero.length-1]==2)||
	  					(numero[numero.length-1]==3)||
	  					(numero[numero.length-1]==7)||
	  					(numero[numero.length-1]==8)) {
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
