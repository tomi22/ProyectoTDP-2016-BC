package Tanque;

import Proyectil.Proyectil;
import general.Celda;

public class Basico extends Enemigo {
	protected final static String ruta="Enemigo";

	public Basico(int x,int y){
		 super(x,y,ruta);
		 recompensa=100;
		 velocidadMov=1;
		 velocidadDisp=1;
		 aguante=1;
	}
	
	public Proyectil disparar() {
		return null;
	}
	
}
