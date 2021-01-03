package clasesAplicaciones;

import clasesGenerales.Circulo;

import clasesGenerales.Rectangulo;

public class EjecutableTapetes {

	public static void main(String[] args) {
		Rectangulo cuarto=new Rectangulo(10,10);
		Circulo tapete1=new Circulo(1);
		Circulo tapete2=new Circulo(1);
		Circulo tapete3=new Circulo(1);
		double areaTapetes;
		double areaRestante;
		double perimetroTapetes;
		areaTapetes=tapete1.calArea()+tapete2.calArea()+tapete3.calArea();
		areaRestante=cuarto.calArea()-areaTapetes;
		perimetroTapetes=tapete1.calPerimetro();
		System.out.println("\n Area restante "+areaRestante);
		System.out.println("\n Perimetro "+perimetroTapetes);
	}

}