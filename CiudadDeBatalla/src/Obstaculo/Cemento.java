package Obstaculo;

//import general.Celda;
import general.ObjGrafico;

public class Cemento extends ObjGrafico {
	private static final String ruta="Cemento";
	
	public Cemento(int x,int y){
		super(x,y,ruta);
		avanzable=false;
		destructible=false;
	}
	
}
