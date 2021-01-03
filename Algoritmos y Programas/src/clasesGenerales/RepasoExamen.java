package clasesGenerales;

import java.util.ArrayList;

public class RepasoExamen {
	private int Numeros[];
	private ApoyoExamen[]NumeroConNombre;
	private int TE, TE2;
	private final int MAX=5;
	public RepasoExamen(){
		Numeros=new int[MAX];
		NumeroConNombre=new ApoyoExamen[MAX];
		TE=0;
		TE2=0;
	}
	public boolean altaNumeros(int n){
	boolean respuesta=false;
		if(TE<Numeros.length){
			respuesta=true;
			Numeros[TE]=n;
			TE=TE+1;
		}
		return respuesta;
		}
	public boolean altaNumeroConNombre(int n, String a){
		boolean respuesta=false;
		if (TE2<NumeroConNombre.length){
			respuesta=true;
			NumeroConNombre[TE2]=new ApoyoExamen(n, a);
			TE2=TE2+1;
		}
		return respuesta;
	}
	public ArrayList<Integer> todosNumeros(int NumerosDados[]){
		ArrayList<Integer> resultado=new ArrayList();
		int i;
			for(i=0;i<Numeros.length;i++){
				if(Numeros[i]%2==0)
					resultado.add(Numeros[i]);
			}
			for(i=0;i<NumerosDados.length;i++){
				if(NumerosDados[i]%2!=0)
					resultado.add(NumerosDados[i]);
			}
		return resultado;	
	}
	public String toString(){
		StringBuilder cad=new StringBuilder();
		int i;
		for(i=0;i<NumeroConNombre.length;i++)
			cad.append(NumeroConNombre[i]+("\n"));
		return cad.toString();
	}
}