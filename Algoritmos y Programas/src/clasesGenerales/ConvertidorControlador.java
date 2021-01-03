package clasesGenerales;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertidorControlador extends ConvertidorVista{
	private static final long serialVersionUID=1L;
	
	public ConvertidorControlador(String titulo){
		super(titulo);
		kilomTF.addActionListener(new EscuchadorKilom());
		millasTF.addActionListener(new EscuchadorMillas());
	}
	//Clases que escuchan
	private class EscuchadorKilom implements ActionListener{
		public void actionPerformed(ActionEvent e){
		final double FACTOR=1.069344;
		String km, mi;
		km=kilomTF.getText();
		if(!km.equals("")){
			double num=Double.parseDouble(km);
			num=num/FACTOR;
			mi=num+"";
			millasTF.setText(mi);
			}
		}
	}
	private class EscuchadorMillas implements ActionListener{
		public void actionPerformed(ActionEvent e){
		final double FACTOR=1.069344;
		String km, mi;
		mi=millasTF.getText();
		if(!mi.equals("")){
			double num=Double.parseDouble(mi);
			num=num/FACTOR;
			km=num+"";
			kilomTF.setText(km);
			}
		}
	}
	public static void main(String s[]){
		new ConvertidorControlador("Convertidor");
	}
}