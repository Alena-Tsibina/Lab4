package CheckBoxListener;

import javax.swing.JCheckBox;
import javax.swing.*;
import java.awt.*;

public class UI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("��� �� ����");
		frame.setLocation(400,400);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,1));
		
		frame.add(panel, BorderLayout.NORTH);
		
		JCheckBox check = new JCheckBox("�� ������������ ������ �� ���������");
		JTextField name = new JTextField("������� ���:");
		JTextField sname = new JTextField("������� �������");
		
		ButtonGroup group = new ButtonGroup();
		JRadioButton mrb = new JRadioButton("�������");
		JRadioButton frb = new JRadioButton("�������");
		group.add(mrb);
		group.add(frb);
		
		panel.add(check); panel.add(name); panel.add(sname);
		panel.add(mrb);panel.add(frb);
		
		CheckListener listener = new CheckListener();
		listener.components.add(name); listener.components.add(sname);
		listener.components.add(mrb); listener.components.add(frb);
		check.addActionListener(listener);
		frame.setVisible(true);
	}

}
