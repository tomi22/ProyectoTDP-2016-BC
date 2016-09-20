package Tanque;
import general.*;
import Proyectil.Proyectil;

public class Poder extends Enemigo
{
	protected final static String  ruta="E_Poder";

	public Poder(int x,int y){
		 super(x,y,ruta);
		 recompensa=300;
		 velocidadMov=2;
		 velocidadDisp=3;
		 aguante=1;
	}
	
	public Proyectil disparar() {
		return null;
	}

}
