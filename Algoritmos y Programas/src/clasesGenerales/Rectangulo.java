package clasesGenerales;

public class Rectangulo {
	private double base, altura;
	public Rectangulo(){
	}
	public Rectangulo(double base, double altura){
		this.base=base;
		this.altura=altura;
	}
	public double calArea(){
		return base*altura;
	}
	public double calPerim(){
		return 2*(base+altura);
	}
	public void setBase(double nueva){
		base=nueva;
	}
	public void setAltura(double nueva){
		altura=nueva;
	}
	public double getBase(){
		return base;
	}
	public double getAltura(){
		return altura;
	}
	public String toString(){
		return "base: "+base+"altura: "+altura;
	}
	public boolean equals(Rectangulo otro){
		double area;
		area=otro.calArea();
		return area==this.calArea();
	}
}