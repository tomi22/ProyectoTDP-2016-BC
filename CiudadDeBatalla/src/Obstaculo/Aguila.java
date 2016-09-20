package Obstaculo;

//import general.Celda;
import general.ObjGrafico;

public class Aguila extends ObjGrafico{
	private static final String ruta="Aguilucho";
	
	public Aguila(int x,int y){
		super(x,y,ruta);
		avanzable=false;
		destructible=true;
	}
	
}
