
package com.example.project;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

			int n = sc.nextInt(), suma;
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
		//		n = sc.nextInt();
				a[i] = sc.nextInt();;
			}

			suma = sc.nextInt();

			System.out.println(obj.esSubconjuntoSumaExt(a, suma));
		}
	}

	public boolean esSubconjuntoSumaExt(int a[], int suma) {
		 
		int posicion=0;
		 for (int i = 0; i < a.length; i++) {
			 if(a[i]==7) {
			 posicion=i;
			 }
		 }
		if(a[posicion+1]==1){
				//System.out.println("no pueden almacenarse el 7");
				if((esSubconjuntoSuma(eliminar(a,posicion),0,suma)==true)) {
					return true;
				}
				else {
					return false;
				}
			}
		else {
			if((esSubconjuntoSuma(a,1,suma)==true)) {
				return true;
			}
		}

		return false;
	}
 boolean esSubconjuntoSuma(int conjunto[], int n, int suma){
	// Casos base
	if (suma == 0)
	return true;
	if (n == conjunto.length)
	return false;
	/* verificamos si conseguimos la suma por alguna de las siguientes formas:
	(a) incluyendo el primer elemento
	(b) excluyendo el primer elemento */
	return esSubconjuntoSuma(conjunto, n + 1, suma - conjunto[n])
	|| esSubconjuntoSuma(conjunto, n + 1, suma );
	}
	 
	 
 int[] eliminar(int a[], int pos) {
	 int[] array2 ;
		
		 for (int k = pos; k < a.length-1; k++) {
			a[k]=a[k+1];
		}
		array2 = Arrays.copyOf(a, a.length-1);
		 return array2;
	 }
}


