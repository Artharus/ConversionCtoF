package proyectoGit;

import java.util.Scanner;

public class ProyectoGit {

	public static void main(String[] args) {
		double grados;
		double gradosFahreinheit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca los grados Celsius: ");
		grados=sc.nextDouble();
		
		gradosFahreinheit= 32 + (grados*9)/5;
		System.out.println("Los grados Fahreinheit serán igual a: "+gradosFahreinheit);

	}

}
