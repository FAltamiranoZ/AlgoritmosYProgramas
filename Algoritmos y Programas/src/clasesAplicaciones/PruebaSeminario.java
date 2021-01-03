package clasesAplicaciones;

import clasesGenerales.Seminario;

public class PruebaSeminario {

	public static void main(String[] args) {
		Seminario sem=new Seminario();
		sem.alta("Juan");
		sem.alta("Carina");
		sem.alta("Luis");
		sem.alta("Adela");
		sem.alta("Carlos");
		System.out.println(sem.generaListaPar());
		if(sem.consultaPar("Luis"))
			System.out.println("Luis si asistio");
		else
			System.out.println("Luis si asistio");
	}
}