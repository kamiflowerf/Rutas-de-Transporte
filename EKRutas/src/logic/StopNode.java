package logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class StopNode {
	
	private String idNodo;
	private String nombre;
	private int posX;
	private int posY;
	private HashMap<StopNode, List<Ruta>> listRoutes;
	
	public StopNode(String idNodo, String nombre, int posX, int posY) {
		super();
		this.idNodo = idNodo;
		this.nombre = nombre;
		this.posX = posX;
		this.posY = posY;
		
		//we might wanna fix the resizing issue here later, if necessary
		this.listRoutes = new HashMap<>();
	}

	public void addRoute(StopNode dest, Ruta route) {
		listRoutes.putIfAbsent(dest, new ArrayList<>());
		listRoutes.get(dest).add(route);
	}
	
	public List<StopNode> getAdjacentDestinations(){
		return new ArrayList<>(listRoutes.keySet());
	} 
	
	//si no hay rutas devuelve una lista vacía
	public List<Ruta> getRoutesToDestination(StopNode dest){
		return listRoutes.getOrDefault(dest, new ArrayList<>());
	}
	
	public String getIdNodo() {
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
