package clasesGenerales;

import java.awt.*;
import javax.swing.*;

public class VistaFinal extends JFrame{
	private static final long serialVersionUID=1L;
	protected JTextField edade, sexoe, invitacione, respuestae;
	protected JButton pasa;
	private JLabel edad, sexo, invitacion, respuesta, blank;
	public VistaFinal(String titulo){
		super(titulo);
		edade=new JTextField(20);
		sexoe=new JTextField(20);
		invitacione=new JTextField(20);
		respuestae=new JTextField(20);
		
		edad=new JLabel("Edad: ");
		sexo=new JLabel("Sexo M/H: ");
		invitacion=new JLabel("Invitación VIP (¿S/N?): ");
		respuesta=new JLabel("Respuesta: ");
		blank=new JLabel(" ");
		
		pasa=new JButton("¿Pasa?");
		
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(5,2));
		p1.add(edad);
		p1.add(edade);
		p1.add(sexo);
		p1.add(sexoe);
		p1.add(invitacion);
		p1.add(invitacione);
		p1.add(pasa);
		p1.add(blank);
		p1.add(respuesta);
		p1.add(respuestae);
		
		this.add(p1);
		
		this.setBounds(200, 200, 800, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String s[]){
		new VistaFinal("Vista");
		}
}