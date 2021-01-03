package clasesGenerales;

public class Desencriptador {
	private int Encriptado[];
	private int Desencriptado[];
	private final int MAX=6;
	private int TE;
	public Desencriptador(){
		TE=0;
		Encriptado=new int[MAX];
		Desencriptado=new int[MAX];
	}
	public boolean altaEncriptado(int num){
		boolean respuesta=false;
		if(TE<Encriptado.length){
			respuesta=true;
			Encriptado[TE]=num;
			TE=TE+1;
	}
		return respuesta;
	}
	public int[] Desencriptado(){
		int i, j;
		i=0;
		j=MAX;
		for(i=0; i<MAX; i++){
			Desencriptado[j]=Encriptado[i];
			j=j-1;
		}
		return Desencriptado;
	}
}