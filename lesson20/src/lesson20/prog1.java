package lesson20;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class prog1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prog1 frame = new prog1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public prog1() {
		setTitle("\u041C\u043E\u0451 \u043E\u043A\u043D\u043E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 265);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Вход");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText().trim();
				if (str.isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Введите имя!");
				}
				else
					JOptionPane.showMessageDialog(null, "Привет! "+str);
			}
		});
		btnNewButton.setBounds(305, 12, 75, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Введите имя: ");
		lblNewLabel.setBounds(15, 15, 113, 20);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(102, 12, 174, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
