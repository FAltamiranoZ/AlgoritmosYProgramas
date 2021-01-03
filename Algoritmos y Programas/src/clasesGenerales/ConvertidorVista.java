package clasesGenerales;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;

public class ConvertidorVista extends JFrame{
	private static final long serialVersionUID=1L;
	protected JTextField kilomTF, millasTF;
	private JLabel kmL, miL;
	
	public ConvertidorVista(String titulo){
		super(titulo);
		//Se crean componentes
		kilomTF=new JTextField(16);
		millasTF=new JTextField(16);
		kmL=new JLabel("Kilómetros");
		miL=new JLabel("Millas");
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(4,1));
		Border bor=BorderFactory.createEmptyBorder(5, 5, 5, 5);
			p.setBorder(bor);
			p.add(kmL);
			p.add(kilomTF);
			p.add(miL);
			p.add(millasTF);
			//Se agrega el panel
			this.add(p);
			//Posicion
			this.setBounds(500, 200, 300, 300);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
	}
}