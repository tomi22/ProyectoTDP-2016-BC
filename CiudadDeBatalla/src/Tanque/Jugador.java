package Tanque;
import general.*;
import Proyectil.Proyectil;

public class Jugador extends Tanque {
	private final static String ruta_Jugador="Jugador";
	private int nivel;
	private int vidas;
	private int simultaneo;
	
	public Jugador(int x, int y){
		super(x,y,ruta_Jugador,1);
		nivel=1;
		velocidadMov=2;
		velocidadDisp=1;
		aguante=1;
		simultaneo=1;
	}
	
	//comandos
	public void subirNivel(){
	
		if(nivel<4){
		switch (nivel){
		case 1:
			nivel=2;
			velocidadMov=3;
			velocidadDisp=2;
			aguante=1;
			simultaneo=1;
			break;
		case 2:
			nivel=3;
			velocidadMov=2;
			velocidadDisp=2;
			aguante=2;
			simultaneo=2;
			break;
		case 3:
			nivel=4;
			velocidadMov=2;
			velocidadDisp=3;
			aguante=4;
			simultaneo=3;
			break;	
		 }
		} //fin del if y switch
			
	}
		
	
	public int getVidas(){
		return vidas;
	}

    public void sacarVida(){
    	vidas--;
    }
    public void sumarVida(){
    	vidas++;
    }
	public int getNivel(){
		return nivel;
	}

	public Proyectil disparar() {
		return null;
	}

}
