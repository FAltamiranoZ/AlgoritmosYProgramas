package clasesGenerales;

public class Seminario {
	private LAO<String> lisPar;
	public Seminario(){
		lisPar=new LAO();
	}
	public void alta (String nom){
		lisPar.add(nom);
	}
	public String generaListaPar(){
		return "\n Lista de participantes \n"+lisPar.toString();
	}
	public boolean consultaPar(String nom){
		boolean respuesta=true;
		if(lisPar.indexOf(nom)==-1)
	respuesta=false;
	return respuesta;
	}
}