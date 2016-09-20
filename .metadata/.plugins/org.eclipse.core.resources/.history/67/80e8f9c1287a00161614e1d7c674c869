package Tanque;
import general.*;
import Proyectil.Proyectil;

public abstract class Tanque {
	protected double velocidadMov;
	protected double velocidadDisp;
	protected Celda ubicacion;
	protected int aguante;
	protected int direccion;
	

	//metodos
	public abstract Proyectil disparar();
	
	public abstract Celda getUbicacion();
	
	
	public int getDireccion(){
		return direccion;
	}
	public void setDireccion(int d){
		direccion=d;
	}
	
	public void mover(int i){
		
		switch(i){
			case 1:{ ubicacion.moverY(-(velocidadMov/10)); break;}
			case 2:{ ubicacion.moverY(velocidadMov/10); break; }
			case 3:{ ubicacion.moverX(velocidadMov/10); break; }
			case 4:{ ubicacion.moverX(-(velocidadMov/10)); break;}
		
		
		}
	}
	
	
	
}
