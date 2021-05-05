package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		String dia = "";
		
		// Condiconal múltiple
		switch (n) {
		    case 1:
		    	dia = "Domingo";
		    	break;
		    case 2:
		    	dia = "Lunes";
		    	break;
		    case 3:
		    	dia = "Martes";
		    	break;
		    default:
		    	dia = "Desconocido";
		}
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("dia de la semana........: " + dia);
	}
}
