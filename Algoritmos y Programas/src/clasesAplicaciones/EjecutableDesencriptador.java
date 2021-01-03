package clasesAplicaciones;

import clasesGenerales.Desencriptador;

public class EjecutableDesencriptador {

	public static void main(String[] args) {
		Desencriptador D1=new Desencriptador();
		System.out.println(D1.altaEncriptado(1));
		System.out.println(D1.altaEncriptado(2));
		System.out.println(D1.altaEncriptado(3));
		System.out.println(D1.altaEncriptado(4));
		System.out.println(D1.altaEncriptado(5));
		System.out.println(D1.altaEncriptado(6));
		System.out.println(D1.altaEncriptado(7));
		System.out.println(D1.altaEncriptado(8));
		System.out.println(D1.altaEncriptado(9));
		System.out.println(D1.Desencriptado());
	}
}