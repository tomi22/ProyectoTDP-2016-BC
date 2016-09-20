package Tanque;
import general.*;
import Proyectil.Proyectil;

public class Blindado extends Enemigo{
	//private int contador;
	protected final static String ruta="Blindado";
	
	public Blindado(int x,int y){
		 super(x,y,ruta);
		 recompensa=400;
		 velocidadMov=1;
		 velocidadDisp=2;
		 aguante=4;
		// contador=0;
	}
	
	public Proyectil disparar() {
		return null;
	}

}
