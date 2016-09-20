package Aplicacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import general.Celda;
import general.Partida;

public class GUI implements KeyListener  {
	
	private final String rutaSprites="src/Aplicacion/resources/";
	private static Partida partida;
	private JFrame frame;
	private static JLabel[][] MapaVirtual;
	private static JLabel lblPlayer;
	private static JLabel lblEnemigo[];
	private static int tamanio_celda=32;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
					//falta fijar direccion
				}
				 catch (Exception e) {
					e.printStackTrace();
				}
			}
		
	});
		
	}
	/**
	 * Create the application.
	 */
	public GUI() {
		
		initialize();
		MapaVirtual=new JLabel[17][17];
		crearMapa();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		
		//Creacion de Partida
		
		partida=new Partida();
		
		//Creacion del Frame
		
		frame = new JFrame();
		frame.setBounds(100, 100, 17*tamanio_celda, 17*tamanio_celda); // Nose porque tengo que redimensionar asi 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	
		frame.getContentPane().setBackground(Color.BLACK);
		frame.addKeyListener(this);
	    
	    //Creacion Jugador
		System.out.println(rutaSprites+partida.getJugador().getPath());
		System.out.println(partida.getJugador().getPath());

	    lblPlayer = new JLabel();
		lblPlayer.setIcon(new ImageIcon(new ImageIcon("src/Aplicacion/resources/"+partida.getJugador().getPath()).getImage().getScaledInstance(tamanio_celda, tamanio_celda, Image.SCALE_SMOOTH)));
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBounds(((int) Math.ceil((tamanio_celda*(partida.getJugador().getX())))),(int) Math.ceil((tamanio_celda*(partida.getJugador().getY()))),tamanio_celda, tamanio_celda);
		frame.getContentPane().add(lblPlayer);

		//Creo los Enemigos a partir del arreglo
		
		lblEnemigo = new JLabel[16];
		
		for(int i=0;i<4;i++){
			lblEnemigo[i] = new JLabel();
			lblEnemigo[i].setIcon(new ImageIcon(new ImageIcon("src/Aplicacion/resources/"+partida.getEnemigo(i).getPath()).getImage().getScaledInstance(tamanio_celda, tamanio_celda, Image.SCALE_SMOOTH)));
			lblEnemigo[i].setHorizontalAlignment(SwingConstants.CENTER);
			lblEnemigo[i].setBounds((int)(tamanio_celda*(partida.getEnemigo(i).getX())),(int) (tamanio_celda*(partida.getEnemigo(i).getY())),tamanio_celda, tamanio_celda);
			frame.getContentPane().add(lblEnemigo[i]);
		}

	}

	//Oyente Teclado
	
	public void refreshGUI(){
				
		for(int i=0;i<4;i++){
			lblEnemigo[i].setIcon(new ImageIcon(new ImageIcon("src/Aplicacion/resources/"+partida.getEnemigo(i).getPath()).getImage().getScaledInstance(tamanio_celda, tamanio_celda, Image.SCALE_SMOOTH)));
			lblEnemigo[i].setBounds((int)(tamanio_celda*(partida.getEnemigo(i).getX())),(int) (tamanio_celda*(partida.getEnemigo(i).getY())),tamanio_celda, tamanio_celda);
		}
		
		lblPlayer.setIcon(new ImageIcon(new ImageIcon("src/Aplicacion/resources/"+partida.getJugador().getPath()).getImage().getScaledInstance(tamanio_celda, tamanio_celda, Image.SCALE_SMOOTH)));
		lblPlayer.setBounds((int) Math.ceil((tamanio_celda*(partida.getJugador().getX()))),(int) Math.ceil( (tamanio_celda*(partida.getJugador().getY()))),tamanio_celda, tamanio_celda);
		System.out.println("EL TANQUE ESTA GUI "+tamanio_celda*(partida.getJugador().getX())+" - "+tamanio_celda*(partida.getJugador().getY())+" "+partida.getJugador().getPath());
		System.out.println("El TANQUE ESTA LOGICA "+partida.getJugador().getX()+" - "+partida.getJugador().getY()+" "+partida.getJugador().getPath());

	}
	
	public void crearMapa(){
		Celda[][] mapa=partida.getMapa();
		for(int f=0;f<mapa.length;f++){
			for(int c=0;c<mapa.length;c++){	
				MapaVirtual[f][c] = new JLabel(new ImageIcon(new ImageIcon("src/Aplicacion/resources/"+mapa[f][c].getPath()).getImage().getScaledInstance(tamanio_celda, tamanio_celda, Image.SCALE_SMOOTH)));
				MapaVirtual[f][c].setHorizontalAlignment(SwingConstants.CENTER);
				MapaVirtual[f][c].setBounds((int)(tamanio_celda*(mapa[f][c].getX())),(int)(tamanio_celda*(mapa[f][c].getY())),tamanio_celda, tamanio_celda);
				frame.getContentPane().add(MapaVirtual[f][c]);
				System.out.println("EN EL "+mapa[f][c].getX()+" - "+mapa[f][c].getY()+" "+mapa[f][c].getPath());
			}
		}
		
	}
	

	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()){
		case (KeyEvent.VK_UP):{ 
			partida.mover(1); 
			break;
			}
		case (KeyEvent.VK_DOWN):{
			partida.mover(2);
			break;
			}
		case (KeyEvent.VK_RIGHT):{
			partida.mover(3);
			break;
			}
		case (KeyEvent.VK_LEFT):{
			partida.mover(4);
			break;
			}
		 
		}
		refreshGUI();
	}

	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
