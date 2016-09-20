package Tanque;
import general.*;
import Proyectil.Proyectil;

public abstract class Tanque extends ObjGrafico{
	
	protected Celda celda;
	protected String rutaGrafica;
	protected double velocidadMov;
	protected double velocidadDisp;
	protected int aguante;
	protected int direccion;
	
	/*
	public Tanque(int x, int y,String ruta,int dir) {
		celda= new Celda(x, y,ruta,dir);
		direccion=dir;
		rutaGrafica=ruta;
	}
*/

	public abstract Proyectil disparar();
			
	public int getDireccion(){
		return direccion;
	}
	
	public double getVelocidad(){
		return velocidadMov/10;
	}
	
	public void setDireccion(int d){
		direccion=d;
	}
	
	public void mover(int i){
	if(direccion==i){
		switch(i){
			case 1:{
					celda.moverY(-(velocidadMov/10));
					celda.setPath(""+i);
					break;
			}
			case 2:{
				celda.moverY(velocidadMov/10);
				celda.setPath(""+i);
				break;
			}
			case 3:{
				celda.moverX(velocidadMov/10);
				celda.setPath(""+i);
				break; 
			}
			case 4:{
				celda.moverX(-(velocidadMov/10));
				celda.setPath(""+i);
				break;
			}
		}	
	}
	else{
		direccion=i;
		celda.setPath(""+i);

	}
	}

	public double getX(){
		return celda.getX();
	}
	public double getY(){
		return celda.getY();
	}
	
	
}
