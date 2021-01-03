package Proyecto;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.FlowLayout;

public class VistaProyecto extends JFrame{
	
	
	private static final long serialVersionUID=1L;
	private static String productos[] = {"Pizza", "Palomitas", "Vodka", "Té", "Langosta", "Picaña", "T-Bone", "Camarones", "Pastel de Chocolate", "Pay de limón"};
	protected JTextField nombre, fechaNacimiento, consumo, busqueda, baja, resultado1, resultado2, resultado3;
	protected JButton buscar, registrar, eliminar;
	@SuppressWarnings("rawtypes")
	protected JComboBox product;
	private JLabel nom, fecha, producto, cons, busca, b, res1, res2, res3;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public VistaProyecto(String titulo){
		super(titulo);
		nombre=new JTextField(20);
		fechaNacimiento=new JTextField(8);
		consumo=new JTextField(8);
		busqueda=new JTextField(20);
		baja=new JTextField(20);
		resultado1=new JTextField(16);
		resultado2=new JTextField(80);
		resultado3=new JTextField(80);
		
		nom=new JLabel("Nombre");
		cons=new JLabel("Consumo");
		fecha=new JLabel("Fecha de nacimiento");
		producto=new JLabel("Producto Favorito");
		res1=new JLabel("Resultado: ");
		res2=new JLabel("Resultado: ");
		res3=new JLabel("Resultado: ");
		
		product=new JComboBox(productos);
		
		registrar=new JButton("Registrar");
		b=new JLabel("Introduzca el cliente a eliminar");
		eliminar=new JButton("Eliminar");
		busca=new JLabel("Introduzca el cliente a buscar");
		buscar = new JButton("Buscar");
		this.setLayout(new FlowLayout()); 
		JPanel p=new JPanel();
		JPanel bus=new JPanel();
		JPanel baj=new JPanel();
		Border bor=BorderFactory.createEmptyBorder(50, 50, 50, 50);
		Border bor2=BorderFactory.createEmptyBorder(0, 500, 50, 500);
			p.setBorder(bor);
			p.add(nom);
			p.add(nombre);
			p.add(fecha);
			p.add(fechaNacimiento);
			p.add(cons);
			p.add(consumo);
			p.add(producto);
			p.add(product);
			p.add(registrar);
			p.add(res1);
			p.add(resultado1);
			
			baj.setBorder(bor2);
			baj.add(b);
			baj.add(baja);
			baj.add(eliminar);
			baj.add(res2);
			baj.add(resultado3);
			
			bus.setBorder(bor2);
			bus.add(busca);
			bus.add(busqueda);
			bus.add(buscar);
			bus.add(res3);
			bus.add(resultado2);

			this.add(p);
			this.add(bus);
			this.add(baj);

			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
			setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}
	public static void main(String s[]){
		new VistaProyecto("Vista");
		}
	}