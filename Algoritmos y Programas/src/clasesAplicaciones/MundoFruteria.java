package clasesAplicaciones;

import clasesGenerales.Fruta;

import java.util.Scanner;

public class MundoFruteria {

	public static void main(String[] args) {
		Scanner lee=new Scanner(System.in);
		Fruta f1=new Fruta("Manzana", "Roja", "Campeche", 14.5);
		Fruta f2=new Fruta("Plátano", "Amarillo", "Veracruz", 6.85);
		double m, k;
		System.out.println("Introduzca el monto: ");
		m=lee.nextDouble();
		f1.setMonto(m);
		f2.setMonto(m);
		System.out.println(f1.calDescuento());
		System.out.println(f2.calDescuento());
		k=122;
		f1.setKilo(k);
		f2.setKilo(k);
		System.out.println(f1.calCosto());
		System.out.println(f2.calCosto());
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f1.compareTo(f2));
	}
}