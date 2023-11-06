import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	// JComboBox<String> comboBox;
	JComboBox<Integer> comboBox;
	
	MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(420, 420);
		setLayout(new FlowLayout());
		
		Integer[] nums = { 1, 2, 3 };
		
		comboBox = new JComboBox(nums);
		comboBox.addActionListener(this);
		
		/*
		String[] animals = { "Dog", "Cat", "Bird" };
		comboBox = new JComboBox(animals);
		comboBox.setEditable(true);
		comboBox.addItem("Horse");
		comboBox.insertItemAt("Fish", 1);
		comboBox.removeAll();
		*/
		
		add(comboBox);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			// System.out.println(comboBox.getSelectedItem());
			System.out.println(comboBox.getSelectedItem());
		}
	}

}
