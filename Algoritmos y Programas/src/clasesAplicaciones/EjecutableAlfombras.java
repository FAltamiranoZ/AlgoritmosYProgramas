package clasesAplicaciones;

import java.util.Scanner;

import clasesGenerales.Circulo;

import clasesGenerales.Rectangulo;

public class EjecutableAlfombras {

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		Rectangulo cuarto=new Rectangulo();
		Rectangulo cuarto2=new Rectangulo();
		Rectangulo alfombra=new Rectangulo();
		Circulo alfombraCircular=new Circulo();
		double l1, l2, radio, areaRestante;
		int m, n, i, k;
		i=0;
		k=0;
			System.out.println("\n ¿Cuanto mide el paño?");
			m=lee.nextInt();
			n=lee.nextInt();
			cuarto.setBase(m);
			cuarto.setAltura(n);
			System.out.println("\n ¿Cuanto mide la alfombra?");
			l1=lee.nextDouble();
			l2=lee.nextDouble();
			alfombra.setBase(l1);
			alfombra.setAltura(l2);
			areaRestante=cuarto.calArea();
			do{areaRestante=areaRestante-alfombra.calArea();
			if(areaRestante>=0)
			i=i+1;
		else
			System.out.println("Las alfombras que caben en este cuarto son: "+i);
		}while (areaRestante>=0);
			
			System.out.println("\n ¿Cuanto mide el paño?");
			m=lee.nextInt();
			n=lee.nextInt();
			cuarto2.setBase(m);
			cuarto2.setAltura(n);
			System.out.println("\n ¿Cual es el radio de las alfombras?");
			radio=lee.nextDouble();
			alfombraCircular.setRadio(radio);
			areaRestante=cuarto2.calArea();
			do{areaRestante=areaRestante-alfombraCircular.calArea();
				if(areaRestante>=0)
				k=k+1;
			else
				System.out.println("Las alfombras que caben en este cuarto son: "+k);
			}while (areaRestante>=0);
		}
	}