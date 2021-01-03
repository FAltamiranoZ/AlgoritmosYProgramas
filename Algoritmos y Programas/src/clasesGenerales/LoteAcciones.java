package clasesGenerales;

public class LoteAcciones {
	private int dia, mes, año, numAcciones, claveLote;
	private double precio;
	private String emisora, numSerie;
	private static int numLote=500;
	public LoteAcciones(){
	}
	public LoteAcciones(String emis, String serie, int d, int m, int a, int acciones, int lote, double pre){
		emisora=emis;
		numSerie=serie;
		precio=pre;
		dia=d;
		mes=m;
		año=a;
		numAcciones=acciones;
		claveLote=lote;
		claveLote=numLote;
		numLote=numLote+1;
	}//Asigna valores de manera particular
	public String toString(){
		return "Emisora: "+emisora+"\nSerie "+numSerie;
	}
	public int calDias(int d, int m, int a){
		int totalD, totalM, totalA;
		totalA=a-año;
		totalM=m-mes;
		totalD=d-dia;
		totalD=totalD+totalM*30+totalA*365;
		return totalD;
	}
	public boolean calRendimiento(double preVenta){
		double rendimiento;
		rendimiento=(preVenta-precio)/precio;
		return rendimiento>=0.05;
	}
	public boolean vendeAcciones(int d, int m, int a, int acciones, double pre){
		boolean respuesta = false;
		if(acciones<=acciones/2 && calDias(d, m, a)>=90 && calRendimiento(pre))
			respuesta=true;
		return respuesta;
	}
}