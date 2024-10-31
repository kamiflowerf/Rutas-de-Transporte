package logic;

public class StopNode {
	private int idNodo;
	private String nombre;
	private int posX;
	private int posY;
	
	
	public StopNode(int idNodo, String nombre, int posX, int posY) {
		super();
		this.idNodo = idNodo;
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
	}

	public int getIdNodo() {
		return idNodo;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	
	
	
}
