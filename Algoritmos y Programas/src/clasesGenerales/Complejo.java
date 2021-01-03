package clasesGenerales;

public class Complejo {
	private double real, imag;
	public Complejo(){
	}
	public Complejo(double r, double i){
		real=r;
		imag=i;
	}
	public void setReal(double nuevo){
		real=nuevo;
	}
	public void setImag(double nuevo){
		imag=nuevo;
	}
	public double getReal(){
		return real;
	}
	public double getImag(){
		return imag;
	}
	public String toString(){
		return real+"..."+imag+"i";
	}
	public boolean equals(Complejo otro){
		boolean resp;
		if (this.real==otro.real && this.imag==otro.imag)
			resp=true;
		else
			resp=false;
	return resp;
	}
	public int compareTo(Complejo otro){
		int resul;
		double s1, s2;
		s1=real+imag;
		s2=otro.real+otro.imag;
		if(s1>s2)
			resul=1;
		else
			if(s1<s2)
				resul=-1;
			else
				resul=0;
		return resul;
	}
}