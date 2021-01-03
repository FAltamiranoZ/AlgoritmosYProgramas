package clasesAplicaciones;

import clasesGenerales.Venta;

public class EjecutableNegocio {

	public static void main(String[] args) {
		Venta venta1=new Venta(850);
		Venta venta2=new Venta(2350);
		double primeraVenta;
		double segundaVenta;
		primeraVenta=venta1.calculaComision();
		segundaVenta=venta2.calculaComision();
		System.out.println("\n Primera comision "+primeraVenta+"\n Segunda venta "+segundaVenta);
	}
}