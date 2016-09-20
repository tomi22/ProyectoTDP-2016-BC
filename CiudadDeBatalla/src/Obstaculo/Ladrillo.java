package Obstaculo;

//import general.Celda;
import general.ObjGrafico;

public class Ladrillo extends ObjGrafico {
	private static final String ruta="Ladrillo";
	
	public Ladrillo(int x,int y){
		super(x,y,ruta);
		destructible=true;
		avanzable=false;
	}
	
}
