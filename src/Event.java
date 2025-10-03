package programming_paradigm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Event {

	public static void main(String[] args) {
		JFrame frame1 = new JFrame("Welcome");
		frame1.setVisible(true);
		JTextField box1 = new JTextField(5);
		JTextField box2 = new JTextField(5);
		JButton Button1 = new JButton("the result");
		JLabel result = new JLabel("result: ");
		frame1.setLayout(new java.awt.FlowLayout());
		frame1.add(new JLabel("number one:"));
		frame1.add(box1);
		frame1.add(new JLabel("number tow:"));
		frame1.add(box2);
		frame1.add(Button1);
		frame1.add(result);

		Button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				product_num(box1.getText(), box2.getText(), result);

			}
		});
	}

	public static void product_num(String number1, String number2, JLabel resulte) {

		int num1 = Integer.parseInt(number1);
		int num2 = Integer.parseInt(number2);

		int result = num1 * num2;
		resulte.setText("Result: " + result);

	}
}
