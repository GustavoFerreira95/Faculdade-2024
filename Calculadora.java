package calc;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private double primeiroNumero;
	private String operador;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 25));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(5, 6, 344, 49);
		contentPane.add(textField);
		textField.setColumns(10);

		ActionListener numberListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				textField.setText(textField.getText() + button.getText());
			}
		};

		ActionListener operatorListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				operador = button.getText();
				primeiroNumero = Double.parseDouble(textField.getText());
				textField.setText("");
			}
		};

		for (int i = 0; i < 10; i++) {
			JButton button = new JButton(Integer.toString(i));
			button.setBounds(5 + (i % 3) * 86, 66 + (i / 3) * 60, 86, 49);
			button.addActionListener(numberListener);
			contentPane.add(button);
		}

		String[] operadores = {"+", "-", "*", "/"};

		for (int i = 0; i < operadores.length; i++) {
			JButton button = new JButton(operadores[i]);
			button.setBounds(263, 66 + i * 60, 86, 49);
			button.addActionListener(operatorListener);
			contentPane.add(button);
		}

		JButton equalsButton = new JButton("=");
		equalsButton.setBounds(177, 246, 86, 49);
		equalsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double segundoNumero = Double.parseDouble(textField.getText());
				switch (operador) {
					case "+":
						textField.setText(Double.toString(primeiroNumero + segundoNumero));
						break;
					case "-":
						textField.setText(Double.toString(primeiroNumero - segundoNumero));
						break;
					case "*":
						textField.setText(Double.toString(primeiroNumero * segundoNumero));
						break;
					case "/":
						textField.setText(Double.toString(primeiroNumero / segundoNumero));
						break;
				}
			}
		});
		contentPane.add(equalsButton);

		JButton clearButton = new JButton("C");
		clearButton.setBounds(91, 246, 86, 49);
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		contentPane.add(clearButton);
	}
}
