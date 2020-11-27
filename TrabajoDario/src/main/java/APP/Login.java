package APP;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Login extends JFrame implements ActionListener {
	JPanel panel;
	JLabel user_label, password_label, message;
	JTextField userName_text;
	JPasswordField password_text;
	JButton submit, cancel;

	Login() {
		// Username Label
		user_label = new JLabel();
		user_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		user_label.setText("User Name :");
		userName_text = new JTextField();
		userName_text.setFont(new Font("Tahoma", Font.PLAIN, 20));
		// Password Label
		password_label = new JLabel();
		password_label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password_label.setText("Password :");
		password_text = new JPasswordField();
		password_text.setFont(new Font("Tahoma", Font.PLAIN, 20));
		// Submit
		submit = new JButton("Continuar");
		submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel = new JPanel();
		message = new JLabel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adding the listeners to components..
		submit.addActionListener(this);
		getContentPane().add(panel, BorderLayout.NORTH);
		submit.addActionListener(this);
		
		final JCheckBox ver_CheckBox = new JCheckBox("Ver");
		ver_CheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (ver_CheckBox.isSelected()) {
						password_text.setEchoChar((char)0);
					}
					else {
						password_text.setEchoChar('*');
					}
				}
			});

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(password_label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(user_label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(userName_text, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(password_text, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(ver_CheckBox))))
						.addComponent(message, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(59, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(249, Short.MAX_VALUE)
					.addComponent(submit, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(user_label, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(userName_text, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(password_label, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(password_text, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(ver_CheckBox))
					.addGap(27)
					.addComponent(submit, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(message, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		setTitle("Login page");
		setSize(451, 259);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String userName = userName_text.getText();
		String password = password_text.getText();
		if (userName.trim().equals("admin") && password.trim().equals("admin")) {
			message.setText(" Hello " + userName + "");
		} else {
			message.setText(" Invalid user.. ");
		}
	}

	public void actionPerformed1(ActionEvent arg0) {
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}