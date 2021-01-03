package clasesAplicaciones;

import clasesGenerales.RepasoExamen;

public class EjecutableExamen {

	public static void main(String[] args) {
		int NumerosDados[]={7,8,9,10,11,12};
		RepasoExamen R1=new RepasoExamen();
		System.out.println(R1.altaNumeros(1));
		System.out.println(R1.altaNumeros(2));
		System.out.println(R1.altaNumeros(3));
		System.out.println(R1.altaNumeros(4));
		System.out.println(R1.altaNumeros(5));
		System.out.println(R1.altaNumeros(6));
		System.out.println(R1.altaNumeroConNombre(10, "Diez"));
		System.out.println(R1.altaNumeroConNombre(20, "Veinte"));
		System.out.println(R1.altaNumeroConNombre(30, "Treinta"));
		System.out.println(R1.altaNumeroConNombre(40, "Cuarenta"));
		System.out.println(R1.altaNumeroConNombre(50, "Cincuenta"));
		System.out.println(R1.altaNumeroConNombre(60," Sesenta"));
		System.out.println(R1.toString());
		System.out.println(R1.todosNumeros(NumerosDados));
	}
}