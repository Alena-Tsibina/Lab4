package Actions;
import java.awt.BorderLayout;
import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Это моё окно");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JComboBox<String> box = new JComboBox<String>(CountryInformation.COUNTRIES);
		
		JTextArea area = new JTextArea();
		area.setText("Выберите страну");
		area.setEditable(false);
		
		BoxListener myListener = new BoxListener(box, area);
		box.addActionListener(myListener);
		
		frame.add(box, BorderLayout.SOUTH);
		frame.add(area, BorderLayout.CENTER);
		frame.setVisible(true);
		// TODO Auto-generated method stub

	}

}
