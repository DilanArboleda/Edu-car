package educar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JToggleButton;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JButton btningresar;
	private JFormattedTextField ingrusuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(207, 35, 54, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(90, 101, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contrase\u00F1a:");
		lblNewLabel_2.setBounds(90, 151, 69, 14);
		contentPane.add(lblNewLabel_2);
		
		ingrusuario = new JFormattedTextField();
		ingrusuario.setBounds(162, 98, 134, 20);
		contentPane.add(ingrusuario);
		
		JPasswordField ingresecontras = new JPasswordField();
		ingresecontras.setBounds(162, 148, 134, 20);
		contentPane.add(ingresecontras);
		
		btningresar = new JButton("Ingresar");
		btningresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			char [] clave = ingresecontras.getPassword();
			String clavefinal = new String (clave);
			
			if (ingrusuario.getText().equals("Admin") && clavefinal.equals("Admin")) {
			  dispose();
			  JOptionPane.showMessageDialog(null, "Bienvenido a Edu-car", "Ingresaste",
			  	JOptionPane.INFORMATION_MESSAGE);
			  	Principal p = new Principal();
			  	p.setVisible(true);
			  	}
			else {
				JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "ERROR",
						JOptionPane.ERROR_MESSAGE);
				ingrusuario.setText("");
				ingresecontras.setText("");
				ingrusuario.requestFocus();
			}
			
			}
		});
		btningresar.setBounds(182, 214, 89, 23);
		contentPane.add(btningresar);
	}
}
