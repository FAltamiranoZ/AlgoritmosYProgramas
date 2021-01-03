package clasesAplicaciones;

import java.util.Scanner;

import clasesGenerales.LoteAcciones;

public class AccionesEmpresaABC {

	public static void main(String[] args) {
		Scanner lee=new Scanner(System.in);
		LoteAcciones l1=new LoteAcciones("SMSN", "N", 27, 7, 2015, 7877.26, 100);
		LoteAcciones l2=new LoteAcciones("SMSN", "N", 7877.26, 100, 27, 7, 2015);
		LoteAcciones l3=new LoteAcciones("SMSN", "N", 7877.26, 100, 27, 7, 2015);
		if(l3.vendeAcciones(2, 10, 2016, 400, 3.5))
			System.out.println("Si se puedo vender Axtel");
		else
			System.out.println("No se vendieron");
	}

}