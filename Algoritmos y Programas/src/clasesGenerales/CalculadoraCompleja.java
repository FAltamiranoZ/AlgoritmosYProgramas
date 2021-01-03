package clasesGenerales;

public class CalculadoraCompleja {
	private Complejo num1, num2;
	public CalculadoraCompleja(){
	}
	public CalculadoraCompleja(String marca, Complejo num1, Complejo num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void setNum1(Complejo nuevo){
		num1=nuevo;
	}
	public void setNum2(Complejo nuevo){
		num2=nuevo;
	}
	public Complejo suma(){
		double real, imag;
		Complejo resultado=new Complejo();
		real=num1.getReal()+num2.getReal();
		imag=num1.getImag()+num2.getImag();
		resultado.setReal(real);
		resultado.setImag(imag);
		return resultado;
	}
	public Complejo resta(){
		double real, imag;
		Complejo resultado=new Complejo();
		real=num1.getReal()-num2.getReal();
		imag=num1.getImag()-num2.getImag();
		resultado.setReal(real);
		resultado.setImag(imag);
		return resultado;
	}
	public Complejo multiplicacion(){
		double real, imag;
		Complejo resultado=new Complejo();
		real=((num1.getReal())*(num2.getReal()))-((num1.getImag())-(num2.getImag()));
		imag=((num1.getReal())*(num2.getImag()))+((num2.getReal())+num1.getImag());
		resultado.setReal(real);
		resultado.setImag(imag);
		return resultado;
	}
	public Complejo division(){
		double real, imag;
		Complejo resultado=new Complejo();
		real=((num1.getReal())*(num2.getReal()))+((num1.getImag())-(num2.getImag()));
		imag=(((num2.getReal())+num1.getImag())-((num1.getReal())*(num2.getImag())))/(Math.pow(num1.getImag(), 2))+(Math.pow(num2.getImag(), 2));
		resultado.setReal(real);
		resultado.setImag(imag);
		return resultado;
	}
}