package general;

public class Celda {

	protected double x;
	protected double y;
	
	//Atributos GRAFICOS en objGrafico iria...
	/*
	protected String path;
	protected String path_dinamico;
	protected String extension=".png";
	*/
	
	
	//Constructor por defecto.
	
	public Celda(int x,int y){
		this.x=x;
		this.y=y;
		//path="Vacio";
		//path_dinamico="";
		//avanzable=true;
	}
	
	//Constructor para Obstaculos
	
	public Celda(int x2, int y2, String ruta) {
		x=x2;
		y=y2;
		//path=ruta;
		//path_dinamico="";
		//avanzable=true;
	}
	
	//Contructor para Tanques 
	
	public Celda(int x2, int y2, String ruta,int direccion) {
		x=x2;
		y=y2;
		//path=ruta;
		//path_dinamico=""+direccion;
	}

	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void moverX(double x){
		this.x+=x;
	}
	
	public void moverY(double d){
		this.y+=d;
	}
	
	public void impactar(){
		
	}
	
	public void afectar(){}
	
	
	//Metodos Graficos
	/*
	public String getPath(){
		return path+path_dinamico+extension;
	}
	
	public void setPath(String ruta){
		path=ruta;
	}

	public boolean getAvanzable() {
		return avanzable;
	}
	
	*/
	
}
