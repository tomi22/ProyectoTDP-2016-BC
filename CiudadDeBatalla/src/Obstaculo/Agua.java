package Obstaculo;

//import general.Celda;
import general.ObjGrafico;

public class Agua extends ObjGrafico {
	private static final String ruta="Agua";
	
	public Agua(int x,int y){
		super(x,y,ruta);
		avanzable=false;
		destructible=false;
	}
	
}
