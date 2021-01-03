package Proyecto;

public class Cliente implements Comparable<Cliente>{
		private double consumo;
		private int fechaNacimiento;
		private String nombre, productoFavorito;
		public Cliente(String nom){
			nombre=nom;
		}
		public Cliente(String nom, String producto, int fecha, double con){
			nombre=nom;
			productoFavorito=producto;
			fechaNacimiento=fecha;
			consumo=con;
		}
		public int compareTo(Cliente a){
			return nombre.compareTo(a.nombre);
		}
		public boolean equals(Object otro){
			Cliente a=(Cliente) otro;
			return nombre.equals(a.nombre);
		}
		public String getNombre(){
			return nombre;
		}
		public String getProducto(){
			return productoFavorito;
		}
		public int getFecha(){
			return fechaNacimiento;
		}
		public double getConsumo(){
			return consumo;
		}
		public void setNombre(String nom){
			nombre=nom;
		}
		public void setProducto(String producto){
			productoFavorito=producto;
		}
		public void setFecha(int fecha){
			fechaNacimiento=fecha;
		}
		public void setConsumo(double cons){
			consumo=cons;
		}
		public String toString(){
			return "Nombre: "+nombre+", Fecha de nacimiento: "+fechaNacimiento+", Total consumido: "+consumo+", Su producto favorito es: "+productoFavorito;
		}
}