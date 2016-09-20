package Tanque;

import Proyectil.Proyectil;

public abstract class Enemigo extends Tanque{
	
	public Enemigo(int x, int y, String ruta) {
		super(x, y,ruta,2);
		direccion=2;
	}
	protected int recompensa;

	public int getRecompensa(){
		return recompensa;
	}
	
	public abstract Proyectil disparar();


}
