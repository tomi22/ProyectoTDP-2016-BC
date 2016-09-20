package general;

public class ObjGrafico {
		private int defaultX,defaultY;
		protected boolean avanzable;
		protected boolean destructible;
		
		protected String path;
		protected String path_dinamico;
		protected String extension=".png";
		
		
		public ObjGrafico(int x,int y,String ruta,int direccion){
			
			defaultX=x;
			defaultY=y;
			path=ruta;
			extension= ""+direccion;
		}
		
		public ObjGrafico(int x,int y){
			this(x,y,"",0);
		}
		public ObjGrafico(int x, int y, String ruta){
			this(x,y,ruta,0);
		}
		
		public int getX(){
			return defaultX;
		}
		public int getY(){
			return defaultY;
		}
		
		
		///////////////////////////////////////////////////////
		public String getPath(){
			return path+path_dinamico+extension;
		}
		
		
}
