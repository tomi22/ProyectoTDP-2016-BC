package Obstaculo;

import general.ObjGrafico;

public class Vacio extends ObjGrafico {
	private static final String ruta="Vacio";
	
	public Vacio(int x,int y){
		super(x,y,ruta);
		destructible=true;
		avanzable=false;
	}
	
}