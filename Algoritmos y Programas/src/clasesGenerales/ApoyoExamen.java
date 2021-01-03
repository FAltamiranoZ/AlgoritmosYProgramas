package clasesGenerales;

public class ApoyoExamen {
	private int numero;
	private String apodo;
	public ApoyoExamen(int n, String a){
		 numero=n;
		 apodo=a;
	}
	public int getNumero(){
		return numero;
	}
	public String getApodo(){
		return apodo;
	}
	public String toString(){
		return numero+" "+apodo;
	}
}