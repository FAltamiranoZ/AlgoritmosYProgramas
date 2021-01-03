package clasesAplicaciones;

import clasesGenerales.CientificoMatematico;

public class EjecutableCentroInvestigacion {

	public static void main(String[] args) {
		CientificoMatematico unCientificoMatematico=new CientificoMatematico("prom","cálculo");
		if (unCientificoMatematico.estaOrdenCreciente(29, 43))
			System.out.println("Si están en orden");
		else
		System.out.println("No están en orden");
		System.out.println(unCientificoMatematico.OrdenCreciente(64, 16));
		System.out.println("¿Es impar 58? "+unCientificoMatematico.esImpar(58));
		System.out.println(unCientificoMatematico.OrdenCreciente(22, 11));
		System.out.println(unCientificoMatematico.calculaFuncion1(33));
		System.out.println(unCientificoMatematico.calculaFuncion2(3));
		System.out.println(unCientificoMatematico.calculaFuncion3(2, 2));
		System.out.println(unCientificoMatematico.generaSerieAsc(5));
		System.out.println(unCientificoMatematico.generaSerieDesc(8));
		System.out.println(unCientificoMatematico.encuentraPares(2));
		System.out.println(unCientificoMatematico);
		System.out.println(unCientificoMatematico.getEspecialidad());
		unCientificoMatematico.setEspecialidad("Whatever");
		System.out.println(unCientificoMatematico.getEspecialidad());
	}
}