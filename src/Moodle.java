
import java.util.Observable;

public class Moodle extends Observable {

	int compte;
	
	public Moodle() {
		this.compte = 0;
	}

	public void incremente() {
		this.compte += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.compte));
	}
	
}
