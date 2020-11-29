package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class CreateOrder extends JFrame {

	private JPanel contentPane;
	private JTextField textField_IDPedido;
	private JTextField textField_IDCliente;
	private JTextField textField_Comentarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateOrder frame = new CreateOrder();
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
	public CreateOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Crear Pedidos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JLabel lblIDPedido = new JLabel("IDPedido");
		lblIDPedido.setFont(new Font("Tahoma", Font.PLAIN, 16));

		textField_IDPedido = new JTextField();
		textField_IDPedido.setColumns(10);
		textField_IDPedido.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
					e.consume(); // ignorar el evento de teclado
				}
			}
		});

		JLabel lblIDCliente = new JLabel("IDCliente");
		lblIDCliente.setFont(new Font("Tahoma", Font.PLAIN, 16));

		textField_IDCliente = new JTextField();
		textField_IDCliente.setColumns(10);
		textField_IDCliente.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char caracter = e.getKeyChar();

				// Verificar si la tecla pulsada no es un digito
				if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
					e.consume(); // ignorar el evento de teclado
				}
			}
		});

		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setFont(new Font("Tahoma", Font.PLAIN, 16));

		textField_Comentarios = new JTextField();
		textField_Comentarios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_Comentarios.setColumns(10);

		JLabel lblFechaEsperada = new JLabel("FechaEsperada");
		lblFechaEsperada.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblFechaEntrega = new JLabel("FechaEntrega");
		lblFechaEntrega.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblFechaPedido = new JLabel("FechaPedido");
		lblFechaPedido.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JSpinner spinner_d1 = new JSpinner();

		JSpinner spinner_m1 = new JSpinner();

		JSpinner spinner_y1 = new JSpinner();

		JSpinner spinner_d2 = new JSpinner();

		JSpinner spinner_m2 = new JSpinner();

		JSpinner spinner_y2 = new JSpinner();

		JSpinner spinner_d3 = new JSpinner();

		JSpinner spinner_m3 = new JSpinner();

		JSpinner spinner_y3 = new JSpinner();

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JComboBox<String> JComboBox_Estado = new JComboBox<String>();
		JComboBox_Estado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		JComboBox_Estado.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "Entregado", "Pendiente", "Rechazado" }));

		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JTextPane textPane = new JTextPane();

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 602,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
												.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
														.createSequentialGroup().addGroup(gl_contentPane
																.createParallelGroup(Alignment.TRAILING, false)
																.addComponent(lblIDPedido, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(lblIDCliente, GroupLayout.PREFERRED_SIZE,
																		80, GroupLayout.PREFERRED_SIZE))
														.addGap(27)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																.addComponent(textField_IDCliente,
																		GroupLayout.PREFERRED_SIZE, 119,
																		GroupLayout.PREFERRED_SIZE)
																.addComponent(textField_IDPedido,
																		GroupLayout.PREFERRED_SIZE, 119,
																		GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_contentPane
														.createSequentialGroup().addComponent(lblComentarios).addGap(18)
														.addComponent(textField_Comentarios, GroupLayout.PREFERRED_SIZE,
																198, GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED, 92,
																		Short.MAX_VALUE)
																.addGroup(gl_contentPane
																		.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addComponent(lblFechaPedido,
																						GroupLayout.PREFERRED_SIZE, 97,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(18)
																				.addComponent(spinner_d1,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(spinner_m1,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(spinner_y1,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addComponent(lblFechaEsperada)
																				.addPreferredGap(
																						ComponentPlacement.UNRELATED)
																				.addComponent(spinner_d2,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(spinner_m2,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(spinner_y2,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addComponent(lblFechaEntrega,
																						GroupLayout.PREFERRED_SIZE, 97,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(18)
																				.addComponent(spinner_d3,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(spinner_m3,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)
																				.addComponent(spinner_y3,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_contentPane.createSequentialGroup()
																				.addComponent(lblEstado,
																						GroupLayout.PREFERRED_SIZE, 69,
																						GroupLayout.PREFERRED_SIZE)
																				.addGap(18)
																				.addComponent(JComboBox_Estado,
																						GroupLayout.PREFERRED_SIZE,
																						GroupLayout.DEFAULT_SIZE,
																						GroupLayout.PREFERRED_SIZE)))
																.addGap(5))
														.addGroup(gl_contentPane.createSequentialGroup().addGap(30)
																.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 94,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(91)
																.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE,
																		94, GroupLayout.PREFERRED_SIZE)))))
								.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE).addGap(21)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblIDPedido)
								.addComponent(textField_IDPedido, GroupLayout.PREFERRED_SIZE, 26,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(14).addComponent(
										textField_IDCliente, GroupLayout.PREFERRED_SIZE, 26,
										GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblIDCliente,
												GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
						.addGap(29)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_Comentarios, GroupLayout.PREFERRED_SIZE, 129,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblComentarios, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(42, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFechaPedido, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_d1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_m1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_y1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFechaEsperada, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_d2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_m2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_y2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblFechaEntrega, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_d3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_m3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(spinner_y3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblEstado, GroupLayout.PREFERRED_SIZE, 25,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(JComboBox_Estado, GroupLayout.PREFERRED_SIZE, 23,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(19))
										.addGroup(gl_contentPane
												.createSequentialGroup().addComponent(textPane,
														GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
												.addGap(31)))))));
		contentPane.setLayout(gl_contentPane);
	}
}
