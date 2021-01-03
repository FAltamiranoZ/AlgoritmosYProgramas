package clasesGenerales;

public class CientificoMatematico {
	private String nombre, especialidad;
	public CientificoMatematico(){
	}
	public CientificoMatematico(String nombre, String especialidad){
		this.nombre=nombre;
		this.especialidad=especialidad;
	}
	public void setEspecialidad(String nueva){
		especialidad=nueva;
	}
	public String getEspecialidad(){
		return especialidad;
	}
	public String toString(){
		return "Area de especialidad: "+especialidad+" Nombre: "+nombre;
	}
	public boolean estaOrdenCreciente(int numero1, int numero2){
		boolean result;
		if(numero1<numero2)
			result=true;
		else
			result=false;
		return result;
	}
	public boolean esImpar(int num){
		return num%2==0;
	}
	public String OrdenCreciente(int numero1, int numero2){
		String result;
		if(this.estaOrdenCreciente(numero1,numero2))
			result=numero1+"..."+numero2;
		else
			result=numero2+"..."+numero1;
	return result;
	}
	public String calculaFuncion1(int x){
		String result;
		if (x<=11)
			result="3x+36";
		else
			if (x>11&&x<=33)
				result="x^2-10";
			else
				if (x>33&&x<=64)
					result="x+6";
				else
					result="0";
		return result;
	}
	public String calculaFuncion2(int num){
		String result = null;
		switch(num%4){
			case 0: result="x^2";
				break;
			case 1: result="x/6";
				break;
			case 2: result="sqrt(x)";
				break;
			case 3: result="x^3+5";
				break;
		}
		return result;
	}
	public double calculaFuncion3(int num, int v){
		double result;
		if (num==1)
			result=100*v;
		else
			if (num==2)
				result=Math.pow(100,v);
			else
				if (num==3)
					result=100/v;
				else
					result=0;
		return result;
	}
	public String generaSerieAsc (int n){
		StringBuilder cad=new StringBuilder();
		int i;
		for (i=1;i<=n;i++)
			cad.append(i).append("");
		return cad.toString();
	}
	public String generaSerieDesc (int n){
		StringBuilder cad=new StringBuilder();
		int i;
		for (i=n;i>0;i--)
			cad.append(i).append("");
		return cad.toString();
	}
	public String encuentraPares(int n){
		StringBuilder cad=new StringBuilder();
		int i, total=2*n;
		for(i=2;i<=total;i=i+2)
			cad.append(i).append("");
		return cad.toString();
	}
}