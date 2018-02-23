

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener {

	Moodle refModl;
	
	public Controleur(Moodle m) {
		this.refModl = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		refModl.incremente();
	}

	
}
