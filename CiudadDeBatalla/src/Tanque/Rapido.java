package Tanque;
import general.*;
import Proyectil.Proyectil;

public class Rapido extends Enemigo {
	
	protected final static String  ruta="Enemigo";
	
	public Rapido(int x,int y){
	     super(x,y,ruta);
		 recompensa=200;
		 velocidadMov=3;
		 velocidadDisp=2;
		 aguante=1;
		
	}
	
	public Proyectil disparar() {
		return null;
	}


}
