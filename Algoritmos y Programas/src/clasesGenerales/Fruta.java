package clasesGenerales;

public class Fruta {
	private double costo, monto, kilo;
	private String nombre, color, ciudad;
	private int clave;
	private static int numSerie=2000;
	public Fruta(){
	}
	public Fruta(String nombre, String color, String ciudad, double costo){
		this.ciudad=ciudad;
		this.nombre=nombre;
		this.color=color;
		this.costo=costo;
		clave=numSerie;
		numSerie=numSerie+1;
	}
	public boolean equals(Fruta otro){
		boolean respuesta;
		if (this.clave==otro.clave)
			respuesta=true;
			else
				respuesta=false;
		return respuesta;
	}
	public String compareTo(Fruta otro){
		String respuesta;
		if(this.clave<otro.clave)
			respuesta="La fruta 2 es mayor";
		else
			respuesta="La fruta 1 es mayor";
		return respuesta;
	}
	public String toString(){
		return "Nombre de la fruta: "+nombre+", Costo de la fruta por kilo: "+costo;
	}
	public void setNombre(String nuevo){
		nombre=nuevo;
	}
	public String getNombre(){
		return nombre;
	}
	public void setColor(String nuevo){
		color=nuevo;
	}
	public String getColor(){
		return color;
	}
	public void setCiudad(String nuevo){
		ciudad=nuevo;
	}
	public String getCiudad(){
		return ciudad;
	}
	public void setMonto(double nuevo){
		monto=nuevo;
	}
	public double getMonto(){
		return monto;
	}
	public void setKilo(double nuevo){
		kilo=nuevo;
	}
	public double getKilo(){
		return kilo;
	}
	public double calCosto(){
		monto=kilo*costo;
		return monto;
	}
	public double calDescuento(){
		double respuesta = 0;
		if(monto<1500)
			System.out.println(monto+" No hay descuento");
		else
			if(monto>=1500 && monto<=10000)
				respuesta=(((monto-1500)/8500)*.10);
				else
				respuesta=(monto*.10);
		return respuesta;
	}
}