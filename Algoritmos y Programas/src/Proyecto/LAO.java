package Proyecto;

public class LAO<W extends Comparable<W>> { //Lista Arreglo Ordenada
	private W colec[];
	private int te;
	private final int MAX=20;
	public LAO(){
		colec=(W[]) new Comparable [MAX];
		te=0;
	}
	public LAO (int max){
		colec = (W[]) new Comparable[max];
		te=0;
	}
	public void add(W dato){
		if(te==colec.length)
			expandCapacity(colec.length*2);
		te=Mag.insertaOrdenado(colec, te, dato);
	}

	public void expandCapacity(int tam){
		W nuevo[]=(W[])new Comparable [tam];
		int i;
		for(i=0;i<te;i++)
			nuevo[i]=colec[i];
		colec=nuevo;
	}
	public int indexOf(W dato){
		int i;
		i=Mag.busquedaBinaria(colec, te, dato);
		if(i<0)
			i=-1;
		return i;
	}
	public W remove(W dato){
		W resp=null;
		int pos;
		pos=indexOf(dato);
		if(pos>=0){
			resp=colec[pos];
			Mag.recorreIzquierda(colec, te, pos);
			te=te-1;
			colec[te]=null;
		}
		return resp;
	}
	public int size(){
		return te;
	}
	public W get(int pos){
		W resp;
		if(pos<te && pos>=0)
			resp=colec[pos];
		else
			resp=null;
		return resp;
	}
	public boolean isEmpty(){
		return te==0;
	}
	public void clean(){
		colec=(W[])new Comparable[MAX];
		te=0;
	}
	public String toString(){
		return Mag.toString(colec,te);
	}
	public boolean contains (W dato){
		return indexOf(dato)>=0;
	}
}