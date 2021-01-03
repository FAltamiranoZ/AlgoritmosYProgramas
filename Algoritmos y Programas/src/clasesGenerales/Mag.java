package clasesGenerales;

public class Mag {

	public static <T> void recorreIzquierda(T arre[], int TE, int posicion) {
		int i;
		for(i=posicion;i<TE-1;i++)
			arre[i]=arre[i+1];
	}
	public static <T> void recorreDerecha(T arre[], int TE, int posicion) { //No se si este esté bien
		int i;
		for(i=TE;i>posicion;i--)
			arre[i]=arre[i-1];
	}
	public static <T> int buscaSecuencia(T arre[], int TE, T dato){
		int i;
		i=0;
		while(i<TE&&!arre[i].equals(dato))
			i++;
		if(i==TE)
			i=i-1;
		return i;
	}
	public static <T> String toString(T arre[], int TE){
		StringBuilder cad=new StringBuilder();
		int i;
		for(i=0;i<TE;i++)
			cad.append(arre[i]).append("\n");
			return cad.toString();
	}
	public static <T> int insertaDesordenado (T arre[], int TE, T dato){
		if(TE<arre.length){
			arre[TE]=dato;
			TE++;
		}
		return TE;
	}
	public static <T> int eliminaDesordenado (T arre[], int TE, T dato){
		int posicion;
		posicion=buscaSecuencia(arre, TE, dato);
		if(posicion>=0){
			arre[posicion]=arre[TE-1];
			arre[TE-1]=null;
			TE=TE-1;
		}
		return TE;
	}
	public static <T extends Comparable<T>> int encontrarPosicionMayor(T arre[], int TE){
		int i, posicion;
		posicion=0;
		for(i=1;i<TE;i++)
			if(arre[i].compareTo(arre[posicion])>0)
				posicion=i;
		return posicion;
	}
	public static <T extends Comparable<T>> int busquedaBinaria(T arre[], int TE, T dato){ //Esto solo sirve para arreglos ordenados
		int izq, der, centro;
		izq=0;
		der=TE-1;
		centro=(izq+der)/2;
		while (izq<=der&&!dato.equals(arre[centro])){
			if (arre[centro].compareTo(dato)>0)
				der=centro-1;
			else
				izq=centro+1;
			centro=(izq+der)/2;
		}
		if (izq>der)
			centro=(izq+1)*-1;//Si es negativo significa que no está, sea el número que sea
		return centro;
	}
	
	public static <T extends Comparable<T>> int insertaOrdenado(T arre[], int TE, T dato){
		if(arre.length>TE){
			int pos;
			pos=busquedaBinaria(arre, TE, dato);
			if(pos<0){
				pos=pos*-1-1;
				recorreDerecha(arre,TE,pos);
				arre[pos]=dato;
				TE=TE+1;
			}
		}
		return TE;
	}
	public static <T extends Comparable <T>> void ordenacionPorSeleccionDirecta(T arre[], int TE){
		int i, j, pos;
		T menor;
		for(i=0;i<TE-1;i++){
			menor=arre[i];
			pos=i;
			for(j=i+1;j<TE;j++){
				if(arre[j].compareTo(menor)<0){
					menor=arre[j];
				}
				pos=j;
			}
			arre[pos]=arre[i];
			arre[i]=menor;
		}
	}
	public static <T extends Comparable <T>> boolean problema5 (T arre[], T arre2[], int TE, int TE2){
		boolean var=true;
		int i;
		if(TE==TE2){
			for(i=0; i<TE; i++){
				while(var==true){
					if(arre[i]==arre2[i])
						var=true;
					else
						var=false;
				}
			}
		}
		else
			var=false;
		return var;
	}
}