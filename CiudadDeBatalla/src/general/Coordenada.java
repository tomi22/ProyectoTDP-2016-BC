package general;

public class Coordenada {
	private int x;
	private int y;
	
	public Coordenada(int x, int y){
		this.x=x;
		this.y=y;
	}
	public void set(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	//gets
	public int getY(){
		return y;
	}
	public int getX(){
		return x;
	}
}
