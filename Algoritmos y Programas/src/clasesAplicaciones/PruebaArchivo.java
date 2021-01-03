package clasesAplicaciones;

import java.util.Scanner;

import java.io.File;

public class PruebaArchivo {

	public static void main(String[] args) {
		try{
			Scanner leeA=new Scanner(new File("Datos"));
			int num, suma;
			suma=0;
			while (leeA.hasNextInt()){
				num=leeA.nextInt();
				suma=suma+num;
			}
			System.out.println("\nSuma "+suma);;
			leeA.close();
		}
		catch(Exception e){
			System.out.println("\nError");
		}
	}
}