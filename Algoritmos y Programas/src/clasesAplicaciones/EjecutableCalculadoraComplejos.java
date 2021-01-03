package clasesAplicaciones;

import java.util.Scanner;

import clasesGenerales.CalculadoraCompleja;

import clasesGenerales.Complejo;

public class EjecutableCalculadoraComplejos {

	public static void main(String[] args) {
		Scanner lee=new Scanner(System.in);
		String opc;
		CalculadoraCompleja cC=new CalculadoraCompleja();
		CalculadoraCompleja c1=new CalculadoraCompleja();
		CalculadoraCompleja c2=new CalculadoraCompleja();
		double real, imag;
		System.out.println("\n ¿Qué quieres hacer? +,-,*,/,s");
		opc=lee.nextLine();
		while(!opc.equals("s")){
			System.out.println("\nDame los datos del primer complejo");
			real=lee.nextDouble();
			imag=lee.nextDouble();
			c1.setReal(real);
			c1.setImag(imag);
			System.out.println("\nDame los datos del primer complejo");
			real=lee.nextDouble();
			imag=lee.nextDouble();
			c2.setReal(real);
			c2.setImag(imag);
			cC.setNum1(c1);;
			cC.setNum2(c2);
			switch(opc.charAt(0)){
				case'+':res=cC.suma();
					System.out.println(res);
			}
		}
	}
}