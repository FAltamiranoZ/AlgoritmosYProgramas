package clasesGenerales;

public class PortafolioInversion {
	private int TI;
	private Inversion[] inver;
	private final int MAX=100;
	public PortafolioInversion(){
		inver=new Inversion[MAX];
		TI=0;
	}
	public boolean altaInversion(String nomF, double monto){
	boolean respuesta=false;
	if(TI<inver.length){
		respuesta=true;
		inver[TI]=new Inversion(nomF, monto);
		TI=TI+1;
	}
	return respuesta;
	}
	public boolean cosultaPorNombre(String nomF){
		boolean respuesta=false;
		int i;
		i=0;
		while(i<TI&&!inver[i].getnomF().equals(nomF))
			i=i+1;
		if(i<TI)
			respuesta=true;
		return respuesta;
	}
	public int cuentaPorMonto(double monto){
	int i, cont;
	cont=0;
	for(i=0;i<TI;i++)
		if(inver[i].getmonto()>monto)
			cont=cont+1;
	return cont;
}
}