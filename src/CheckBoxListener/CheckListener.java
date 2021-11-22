package CheckBoxListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.JComponent;

public class CheckListener implements ActionListener{
	
	public ArrayList<JComponent> components = new ArrayList<JComponent>();
	
	public void actionPerformed(ActionEvent arg0) {
		for(JComponent comp : components) {
			comp.setEnabled(!comp.isEnabled());
		}
	}

}
