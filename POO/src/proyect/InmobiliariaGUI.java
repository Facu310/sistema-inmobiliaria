package proyect;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import proyect.MisMetodos;
import javax.swing.JLabel;
public class InmobiliariaGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtpassword;
	MisMetodos datos = new MisMetodos();
	CeoGUI ventanaCEO = new CeoGUI();
	AdministradorGUI ventanaAdministrador = new AdministradorGUI();
	GerenteGUI gerente =new GerenteGUI();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InmobiliariaGUI frame = new InmobiliariaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (Exception e) {

		}

		
	}

	public InmobiliariaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 496, 329);
		contentPane.add(tabbedPane);

		JPanel panelLogin = new JPanel();
		tabbedPane.addTab("Login", null, panelLogin, null);
		panelLogin.setLayout(null);

		txtUser = new JTextField();
		txtUser.setText("User");
		txtUser.setBounds(176, 62, 86, 20);
		panelLogin.add(txtUser);
		txtUser.setColumns(10);

		JButton btnLogin = new JButton("Ingresar");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String password = txtpassword.getText();
			        String us = txtUser.getText();

			        String rol = datos.BuscarUsuario(password, us);

			        if (!rol.isEmpty()) {
			            switch (rol) {
			                case "CEO":
			                    ventanaCEO.setVisible(true);
			                    break;
			                case "ADMINISTRADOR":
			                    ventanaAdministrador.setVisible(true);
			                    break;
			                case "GERENTE":
			                	gerente.setVisible(true);
			                    break;
			            
			                default:
			                    JOptionPane.showMessageDialog(null, "error","error",JOptionPane.ERROR_MESSAGE);
			                    break;
			            }

			            
			        } else {
			            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
			        }

				

				

			}//termina el evento de el boton login

		});
		btnLogin.setBounds(176, 200, 89, 23);
		panelLogin.add(btnLogin);

		txtpassword = new JTextField();
		txtpassword.setText("password");
		txtpassword.setBounds(176, 135, 86, 20);
		panelLogin.add(txtpassword);
		txtpassword.setColumns(10);
		
		JButton btnSalir = new JButton("salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(ABORT);
			}
		});
		btnSalir.setBounds(372, 262, 108, 30);
		panelLogin.add(btnSalir);
	}
}
