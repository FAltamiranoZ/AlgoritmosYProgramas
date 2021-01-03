
package clasesAplicaciones;

import clasesGenerales.PortafolioInversion;

public class EjecutablePortafolioInversion {

	public static void main(String[] args) {
		PortafolioInversion objPI= new PortafolioInversion();
		objPI.altaInversion("C", 65800);
		objPI.altaInversion("A", 200000);
		if(objPI.cosultaPorNombre("C"))
			System.out.println("\n Si se compara");
		else
			System.out.println("\n No se compara");
		System.out.println("\n El total es "+objPI.cuentaPorMonto(65000));
	}
}