package clasesGenerales;

public class Venta {
	private double monto, comision;
	public Venta(){
	}
	public Venta(double monto){
		this.monto=monto;
	}
	public double calculaComision(){
		if (monto<=1000)
			comision=.30;
		else
			comision=.50;
		return comision*monto;
	}
}