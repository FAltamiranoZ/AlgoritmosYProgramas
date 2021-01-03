package Proyecto;

public class Productos {
	private static LAO<String> lisClientesV;
	public Productos(){
		lisClientesV=new LAO();
	}
	public static void alta (String pro){
		lisClientesV.add(pro);
	}
}