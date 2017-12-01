package codes;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Student_login implements ActionListener {

	private JFrame frame;
	private JTextField txtLoginid;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_login window = new Student_login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Student_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtLoginid = new JTextField();
		//txtLoginid.setText("loginID");
		txtLoginid.setBounds(142, 105, 239, 30);
		frame.getContentPane().add(txtLoginid);
		txtLoginid.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(72, 107, 73, 28);
		frame.getContentPane().add(lblId);
		
		txtPassword = new JTextField();
		//txtPassword.setText("password");
		txtPassword.setBounds(142, 147, 239, 30);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(53, 147, 70, 15);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(158, 215, 117, 25);
		frame.getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = txtLoginid.getText();
		String pass = txtPassword.getText();
		
		studentlist list = new studentlist();
		
		if(list.getStudentList(id)) {
			System.out.println(id + " " + pass);
		}
		
		else {
			System.out.println("not matching");
		}
		//System.out.println(id + " " + pass);
		
	}
}
