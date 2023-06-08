package lesson13;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class fon {
public static void main(String[] agrs) {
JFrame window2 = new JFrame();
window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window2.setVisible(true);
window2.setSize(100,100);
window2.getContentPane().setLayout(null);
JButton button1 = new JButton();
button1.setText("Clear");
button1.setSize(100,100);
ActionListener AListener1 = new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Hello");
	}
};
button1.addActionListener(AListener1);
window2.add(button1);
	}
}