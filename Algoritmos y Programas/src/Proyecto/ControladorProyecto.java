package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import Edu.Autores;
import Edu.AutoresControlador;

public class ControladorProyecto extends VistaProyecto{
	private static final long serialVersionUID=1L;
	private static LAD<Cliente>lisCliente;
	public ControladorProyecto(String titulo){
		super(titulo);
		lisCliente=new LAD<Cliente>();
		registrar.addActionListener(new EscuchadorRegistrar());
		buscar.addActionListener(new EscuchadorBuscar());
		eliminar.addActionListener(new EscuchadorEliminar());
	}
	private class EscuchadorRegistrar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String nom, pro;
			int fecha, pos;
			double cons;
			resultado1.setText(null);
			nom=nombre.getText();
			fecha=Integer.parseInt(fechaNacimiento.getText());
			pro=(String) product.getSelectedItem();
			cons=Double.parseDouble(consumo.getText());
			Cliente r=new Cliente(nom);
			lisCliente.add(r);
			pos=lisCliente.indexOf(r);
			lisCliente.get(pos).setFecha(fecha);
			lisCliente.get(pos).setConsumo(cons);
			lisCliente.get(pos).setProducto(pro);
			resultado1.setText("Éxito");
			nombre.setText(null);
			fechaNacimiento.setText(null);
			consumo.setText(null);
	}
}
	private class EscuchadorBuscar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String nom, var;
			int pos;
			nom=busqueda.getText();
			Cliente b=new Cliente(nom);
			pos=lisCliente.indexOf(b);
			if(pos>=0){
				var=lisCliente.get(pos).toString();
				resultado2.setText(var);
			}
			else resultado2.setText("No se he registrado a este Cliente");
		}
	}
	private class EscuchadorEliminar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String nom;
			int pos;
			nom=baja.getText();
			Cliente el=new Cliente(nom);
			pos=lisCliente.indexOf(el);
			lisCliente.remove(el);
			resultado3.setText("Se ha eliminado a: "+nom);
			baja.setText(null);
		}
		}
	
	public static void main(String[] args) {
		new ControladorProyecto("Menú Principal");
		try{
			Scanner leeA=new Scanner(new File("VIP"));
			while (leeA.hasNext()){
				String nom, producto;
				int fecha;
				double cons;
				nom=leeA.next();
				producto=leeA.next();
				fecha=leeA.nextInt();
				cons=leeA.nextDouble();
				Cliente VIP = new Cliente(nom, producto, fecha, cons);
				ControladorProyecto.lisCliente.add(VIP);
				System.out.println("Exito");
			}
			leeA.close();
		}
		catch(Exception e){
			System.out.println("\nError");
		}
}
}