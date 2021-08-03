package Calculo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtpeso;
	private JTextField txtaltura;
	private JTextField txtimc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC frame = new IMC();
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
	public IMC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("PESO");
		lblNewLabel.setBounds(26, 56, 50, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ALTURA");
		lblNewLabel_1.setBounds(12, 100, 50, 13);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("IMC");
		lblNewLabel_2.setBounds(26, 141, 50, 13);
		contentPane.add(lblNewLabel_2);

		txtpeso = new JTextField();
		txtpeso.setBounds(72, 53, 142, 19);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);

		txtaltura = new JTextField();
		txtaltura.setBounds(72, 97, 142, 19);
		contentPane.add(txtaltura);
		txtaltura.setColumns(10);

		txtimc = new JTextField();
		txtimc.setEditable(false);
		txtimc.setBounds(74, 138, 140, 19);
		contentPane.add(txtimc);
		txtimc.setColumns(10);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// variaveis
				double peso, altura, imc;
				// entrada
				peso = Double.parseDouble(txtpeso.getText().replace(",", "."));
				altura = Double.parseDouble(txtaltura.getText().replace(",", "."));
				imc = peso / (altura * altura);

				// saida
				txtimc.setText("" + imc);

				if (imc < 16.99) {
					JOptionPane.showMessageDialog(null, "Muito abaixo do Peso", "Status",
							JOptionPane.INFORMATION_MESSAGE);
				} else if (imc >= 16.99 && imc < 18.5) {
					JOptionPane.showMessageDialog(null, "Abaixo do peso", "Status", JOptionPane.INFORMATION_MESSAGE);

				} else if (imc >= 18.5 && imc < 24.99) {

					JOptionPane.showMessageDialog(null, "Peso Normal ", "Status", JOptionPane.INFORMATION_MESSAGE);

				} else if (imc >= 25 && imc < 29.99) {

					JOptionPane.showMessageDialog(null, "Acima do Peso ", "Status", JOptionPane.INFORMATION_MESSAGE);

				} else if (imc >= 30 && imc < 34.99) {

					JOptionPane.showMessageDialog(null, "Obesidade  I", "Status", JOptionPane.INFORMATION_MESSAGE);

				} else if (imc >= 35 && imc < 39.99) {

					JOptionPane.showMessageDialog(null, "Obesidae  I I", "Status", JOptionPane.INFORMATION_MESSAGE);

				} else if (imc >= 40) {

					JOptionPane.showMessageDialog(null, "Obesidade  I I  I", "Status", JOptionPane.INFORMATION_MESSAGE);

				}

			}
		});
		btnNewButton.setIcon(new ImageIcon(IMC.class.getResource("/Calculo/imc.png")));
		btnNewButton.setBounds(41, 176, 126, 75);
		contentPane.add(btnNewButton);

		JButton btnlimpar = new JButton("");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtpeso.setText(null);
				txtaltura.setText(null);
				txtimc.setText(null);

			}
		});
		btnlimpar.setIcon(new ImageIcon(IMC.class.getResource("/Calculo/boracha.png")));
		btnlimpar.setBounds(213, 176, 91, 75);
		contentPane.add(btnlimpar);

		JButton btnNewButton_2 = new JButton("SOBRE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Calculadora de IMC mver 1.0\nAutor:  Vinicius Akio ", "Sobre",
						JOptionPane.DEFAULT_OPTION);

			}
		});
		btnNewButton_2.setBounds(258, 52, 91, 21);
		contentPane.add(btnNewButton_2);
	}
}
