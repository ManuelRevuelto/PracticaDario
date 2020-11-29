package GUI;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import DAO.BuilderClienteDao;
import DAO.BuilderPedidoDao;
import DAO.ClienteDao;
import DAO.PedidoDao;
import EXCEPCIONES.MisExcepciones;
import MODEL.Cliente;
import MODEL.Pedido;
import MODEL.misDocumentos;
import MODEL.misEstados;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {
	static List<Cliente> misClientes = new ArrayList<Cliente>();
	static List<Pedido> misPedidos = new ArrayList<Pedido>();
	static ClienteDao clienteDao = new ClienteDao(misClientes);
	static PedidoDao pedidoDao = new PedidoDao(misPedidos);

	private JPanel panel;
	private JTextField userName_text;
	private JPasswordField password_text;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 * @throws MisExcepciones
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MisExcepciones {
		Cliente c1 = BuilderClienteDao.build(misDocumentos.DNI, "25359770W", "email1@gmail.com", "pass1", 1, "nom1",
				"nom1", "nom1", 0, 0, null, null, null, null, null, 0, 0, 0, misClientes, false);
		Cliente c2 = BuilderClienteDao.build(misDocumentos.NIE, "X6893412X", "email2@gmail.com", "pass2", 2, "nom2",
				"nom2", "nom2", 0, 0, null, null, null, null, null, 0, 0, 0, misClientes, false);
		clienteDao.guardar(c1);
		clienteDao.guardar(c2);

		Pedido p1 = BuilderPedidoDao.build(1, new Date(120, 10, 28), new Date(120, 11, 2), null, misEstados.Entregado, "com1", 1,
				misPedidos, misClientes, false);
		Pedido p2 = BuilderPedidoDao.build(2, new Date(120, 10, 28), new Date(120, 11, 3), null, misEstados.Entregado, "com2", 2,
				misPedidos, misClientes, false);
		pedidoDao.guardar(p1);
		pedidoDao.guardar(p2);
		new Login(args);
	}

	/**
	 * Create the frame.
	 * 
	 * @throws MisExcepciones
	 */
	public Login(final String[] args) throws MisExcepciones {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		
		// Message Label
		JLabel message = new JLabel();

		// Username Label
		JLabel user_label = new JLabel("Username");
		user_label.setFont(new Font("Tahoma", Font.PLAIN, 20));

		userName_text = new JTextField();
		userName_text.setFont(new Font("Tahoma", Font.PLAIN, 20));

		// Password Label
		JLabel password_label = new JLabel("Password :");
		password_label.setFont(new Font("Tahoma", Font.PLAIN, 20));

		password_text = new JPasswordField();
		password_text.setFont(new Font("Tahoma", Font.PLAIN, 20));

		final JCheckBox ver_CheckBox = new JCheckBox("Ver");
		ver_CheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ver_CheckBox.isSelected()) {
					password_text.setEchoChar((char) 0);
				} else {
					password_text.setEchoChar('*');
				}
			}
		});

		JButton btnButton = new JButton("Continuar");
		btnButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					boolean encontrado = false;
					for (Cliente cliente : misClientes) {
						if (cliente.getUsername().equals(userName_text.getText())
								&& cliente.getPassword().equals(password_text.getText())) {
							encontrado = true;
							dispose();
							CreateUser.main(args);
							break;
						}
					}
					if (!encontrado) {
						userName_text.setText(null);
						password_text.setText(null);
						throw new MisExcepciones(999);
					}

				} catch (MisExcepciones e1) {
					e1.printStackTrace();
				}
			}
		});
		btnButton.setFont(new Font("Tahoma", Font.PLAIN, 20));

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(password_label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
										GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(user_label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 127,
										Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(userName_text, GroupLayout.PREFERRED_SIZE, 170,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(password_text, GroupLayout.PREFERRED_SIZE, 170,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(ver_CheckBox))))
						.addComponent(message, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(59, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup().addContainerGap(336, Short.MAX_VALUE).addComponent(btnButton)
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(20)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(user_label, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(userName_text, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
				.addGap(36)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(password_label, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(password_text, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(ver_CheckBox))
				.addGap(38).addComponent(btnButton).addGap(38)
				.addComponent(message, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)));
		panel.setLayout(gl_panel);
		setTitle("Login page");
		setSize(451, 259);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}