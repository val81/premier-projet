
import java.awt.Frame;

import javax.swing.JFrame;

public class Application extends JFrame {

	public static void main(String[] args) {
		new Application();
	}
	
	public Application() {
		super();
		
		Moodle modl = new Moodle();
		Controleur ctrl = new Controleur(modl); 
		Vue vue = new Vue();
		modl.addObserver(vue);
		vue.addActionListener(ctrl);
		
		this.add(vue);
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}
