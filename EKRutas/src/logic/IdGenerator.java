package logic;
import java.util.UUID;

public class IdGenerator {
	
	public static String generateId() {
		UUID id = UUID.randomUUID();
		return id.toString().substring(0,7);
	}
}

