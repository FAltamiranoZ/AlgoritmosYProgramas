package clasesGenerales;

public class Circulo {
	private double diametro, radio;
	public Circulo(){
	}
	public Circulo(double radio){
		this.diametro=radio*2;
		this.radio=radio;
	}
	public double calArea(){
		return Math.PI*radio*radio;
	}
	public double calPerimetro(){
		return Math.PI*diametro;
	}
	public void setRadio(double nueva){
		radio=nueva;
	}
	public double getRadio(){
		return radio;
	}
	public String toString(){
		return "radio "+radio+"diametro "+diametro;
	}
	public boolean equals(Circulo otro){
		double area;
		area=otro.calArea();
		return area==this.calArea();
	}
}