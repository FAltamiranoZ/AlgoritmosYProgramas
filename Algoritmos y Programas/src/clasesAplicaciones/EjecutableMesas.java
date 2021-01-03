package clasesAplicaciones;

import clasesGenerales.Rectangulo;

public class EjecutableMesas {

	public static void main(String[] args) {
		Rectangulo mesa1=new Rectangulo(2,1.8);
		Rectangulo mesa2=new Rectangulo(1,1.5);
		Rectangulo mesa3=new Rectangulo(3,2);
		double areaTotal;
		areaTotal=mesa1.calArea()+mesa2.calArea()+mesa3.calArea();
		System.out.println("\n Area total ocupada"+ areaTotal);
	}
}