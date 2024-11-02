package logic;

import java.util.ArrayList;
import java.util.List;

//Here we will implement the algorithms
public class MapControl {
	
	private List<StopNode> stops;
	private static MapControl myMap = null;
	
	public MapControl() {
		super();
		stops = new ArrayList<>();
	}
	
	public static MapControl getInstance() {
		if(myMap == null) {
			myMap = new MapControl();
		}return myMap;
	}

	public List<StopNode> getStops() {
		return stops;
	}

	public void setStops(List<StopNode> stops) {
		this.stops = stops;
	}
	
	
}
