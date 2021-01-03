package clasesAplicaciones;

import java.util.Scanner;

import clasesGenerales.Circulo;

import clasesGenerales.Rectangulo;

public class EjecutableOficinas {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		Rectangulo cuarto=new Rectangulo();
		Circulo tapete=new Circulo();
		double area, lado1, lado2, areaDescubierta, radio;
		int i, k, j, n;
		
		areaDescubierta=0;
		do{
			System.out.println("\n ¿Cuántas oficinas hay?");
			n=lee.nextInt();
		} while(n<1);
		for(i=1;i<=n;i++){
			do{
				System.out.println("\n¿Cuántos tapetes?");
				k=lee.nextInt();
			}while(k<1);
			do{
				System.out.println("\n¿Medidas de la oficina?");
				lado1=lee.nextDouble();
				lado2=lee.nextDouble();
			}while(lado1<=0||lado2<=0);
			cuarto.setBase(lado1);
			cuarto.setAltura(lado2);
			area=0;
			for(j=1;j<=k;j++){
				do{
					System.out.println("\n¿Cuánto mide el tapete?");
					radio=lee.nextDouble();
				}while(radio<=0);
				tapete.setRadio(radio);
				area=area+tapete.calArea();
			}
			System.out.println("\n"+area);
			areaDescubierta=areaDescubierta+cuarto.calArea()-area;
			
			System.out.println("\nTotal área descubierta "+areaDescubierta);
		}
	}
}