package proyect;

import java.awt.EventQueue;
import java.awt.JobAttributes;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.event.AncestorEvent;

public class AdministradorGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtci;
	private JTextField txtNom;
	private JTextField txtApe;
	private JTextField txtFechaNac;
	private JTextField txtEmail;
	private JTextField txtTel;
	MisMetodos datos = new MisMetodos();
	validaciones validaciones= new validaciones();
	private JTextField txtNumContrato;
	private JTextField txtNumInmueble;
	private JTable table;
	private JTextField txtIdClieCompra;
	private JTextField txtIdClieVende;
	private JTextField txtFechaIniAlquiler;
	private JTextField txtFechaFinAlqui;
	private JTextField txtDuracionContrato;
	private JTextField txtPrecioAlqui;
	private JTextField txtnumContratoCompraVemta;
	private JTextField txtPadronCompraVenta;
	private JTextField txtCiCompraContratosCompraVenta;
	private JTextField txtCiVendeContatosCompraVenta;
	private JTextField txtFecahComrpaVenta;
	private JTextField txtPadronInmueble;
	private JTextField txtUbicacion;
	private JTextField txtValor;
	private JTextField txtTipo;
	private JTextField txtTamaño;
	private JTextField txtServicios;
	private JTextField txtTipoVivienda;
	private JTextField txtCantBaños;
	private JTextField txtCantHabit;
	private JTextField txtOtrasHabit;
	private JTextField txtComodidades;
	private JTextField txtElimContratoCompraVenta;
	private JTextField txtElimContratoAlquiler;
	private String nombreTabla;

	MisMetodos metodosInstancia= new MisMetodos();
	private JTextField txtCliente;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CeoGUI frame = new CeoGUI();
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
	public AdministradorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 730, 496);
		contentPane.add(tabbedPane);

		JPanel panel = new JPanel();
		tabbedPane.addTab("Cliente", null, panel, null);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cedula");
		lblNewLabel.setBounds(39, 32, 46, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(39, 72, 46, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Apedllido");
		lblNewLabel_2.setBounds(39, 111, 46, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("fecha de nacimiento");
		lblNewLabel_3.setBounds(39, 158, 101, 14);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setBounds(39, 206, 46, 14);
		panel.add(lblNewLabel_4);

		txtci = new JTextField();
		txtci.setBounds(150, 32, 135, 20);
		panel.add(txtci);
		txtci.setColumns(10);

		txtNom = new JTextField();
		txtNom.setBounds(150, 72, 135, 20);
		panel.add(txtNom);
		txtNom.setColumns(10);

		txtApe = new JTextField();
		txtApe.setBounds(150, 111, 135, 20);
		panel.add(txtApe);
		txtApe.setColumns(10);

		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(150, 158, 135, 20);
		panel.add(txtFechaNac);
		txtFechaNac.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(150, 206, 135, 20);
		panel.add(txtEmail);
		txtEmail.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Telefono");
		lblNewLabel_5.setBounds(39, 259, 46, 14);
		panel.add(lblNewLabel_5);

		txtTel = new JTextField();
		txtTel.setBounds(150, 259, 135, 20);
		panel.add(txtTel);
		txtTel.setColumns(10);

		JButton btnNewButton_1 = new JButton("cargar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String ci = txtci.getText();
				String nombre = txtNom.getText();
				String apellido = txtApe.getText();
				String fechaNacimiento = txtFechaNac.getText();
				String email = txtEmail.getText();
				String telefono = txtTel.getText();
				

				//posible error en las mayusculas fijarse en los atributos de ci 



				if(validaciones.validarCedula(ci)) {
					if (validaciones.validarNombreUsuario(nombre)) {
						if (validaciones.validarNombreUsuario(apellido)) {
							if (validaciones.validarEmail(email) && !datos.VerificarExisteEmail(email)) {
								if (validaciones.validarTelefonoCelularUruguay(telefono) && !datos.VerificarExisteTelefono(telefono)) {
									if (validaciones.validarFecha(fechaNacimiento)) {
										
								



									datos.setCi(ci);
									datos.setNombre(nombre);
									datos.setApellido(apellido);
									datos.setFechaNacimiento(fechaNacimiento);
									datos.setEmail(email);
									datos.setTelefono(telefono);

									MisMetodos.nuevoCliente(datos);
									JOptionPane.showMessageDialog(null, "Cliente Ingresado correctamente");



									} else {
										JOptionPane.showMessageDialog(null, "no ingreso correctamente la fecha");
									}

								} else {
									JOptionPane.showMessageDialog(null, "El telefono ingresado no es correcto o ya existe");
									txtTel.setText("");
									txtTel.requestFocus();
								}


							} else {
								JOptionPane.showMessageDialog(null, "El Email ingresado no es correcto o ya existe ");
								txtEmail.setText("");
								txtEmail.requestFocus();
							}

						} else {
							JOptionPane.showMessageDialog(null, "El apellido ingresado no es correcto");
							txtApe.setText("");
							txtApe.requestFocus();						}

					} else {
						JOptionPane.showMessageDialog(null, "El nombre ingresado no es correcto");

						txtNom.setText("");
						txtNom.requestFocus();
					}

				}else {
					JOptionPane.showMessageDialog(null, "La cedula ingresada no es correcta");
					txtci.setText("");
					txtci.requestFocus();
				}



			}
		});
		btnNewButton_1.setBounds(445, 320, 89, 23);
		panel.add(btnNewButton_1);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Contratos Alquiler", null, panel_1, null);
		panel_1.setLayout(null);

		JLabel lblncontrato = new JLabel("Ingrese el Numero de contrato");
		lblncontrato.setBounds(10, 51, 169, 14);
		panel_1.add(lblncontrato);

		JLabel lblNewLabel_12 = new JLabel("Padron del Inmueble");
		lblNewLabel_12.setBounds(22, 147, 157, 14);
		panel_1.add(lblNewLabel_12);

		txtNumContrato = new JTextField();
		txtNumContrato.setBounds(192, 48, 126, 20);
		panel_1.add(txtNumContrato);
		txtNumContrato.setColumns(10);

		txtNumInmueble = new JTextField();
		txtNumInmueble.setToolTipText("de 6 a 10 digitos numericos");
		txtNumInmueble.setBounds(182, 144, 126, 20);
		panel_1.add(txtNumInmueble);
		txtNumInmueble.setColumns(10);

		JLabel lblNewLabel_13 = new JLabel("Contrato");
		lblNewLabel_13.setBounds(247, 11, 46, 14);
		panel_1.add(lblNewLabel_13);



		JLabel lblNewLabel_14 = new JLabel("CI Cliente Compra/Alquila");
		lblNewLabel_14.setBounds(10, 178, 169, 14);
		panel_1.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel("CI Clientre Vende/Arrendador");
		lblNewLabel_15.setBounds(10, 213, 169, 14);
		panel_1.add(lblNewLabel_15);

		txtIdClieCompra = new JTextField();
		txtIdClieCompra.setBounds(182, 175, 124, 20);
		panel_1.add(txtIdClieCompra);
		txtIdClieCompra.setColumns(10);

		txtIdClieVende = new JTextField();
		txtIdClieVende.setBounds(182, 210, 124, 20);
		panel_1.add(txtIdClieVende);
		txtIdClieVende.setColumns(10);

		JTextArea textAreAcuerdo = new JTextArea();
		textAreAcuerdo.setBounds(427, 26, 181, 190);
		panel_1.add(textAreAcuerdo);

		JLabel lblNewLabel_17 = new JLabel("Acuerdo de los Clientes");
		lblNewLabel_17.setBounds(457, 11, 151, 14);
		panel_1.add(lblNewLabel_17);

		JLabel lblNewLabel_9 = new JLabel("fechaInicioAlquiler");
		lblNewLabel_9.setBounds(22, 244, 138, 14);
		panel_1.add(lblNewLabel_9);

		JLabel lblNewLabel_18 = new JLabel("Fecha Fin de Alquiler");
		lblNewLabel_18.setBounds(22, 273, 157, 14);
		panel_1.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("Duracion del Contrato");
		lblNewLabel_19.setBounds(22, 311, 157, 14);
		panel_1.add(lblNewLabel_19);

		JLabel lblNewLabel_20 = new JLabel("Precio Alquiler");
		lblNewLabel_20.setBounds(346, 256, 101, 14);
		panel_1.add(lblNewLabel_20);

		JLabel lblNewLabel_21 = new JLabel("Tipo de Garantia");
		lblNewLabel_21.setBounds(343, 289, 104, 14);
		panel_1.add(lblNewLabel_21);

		txtFechaIniAlquiler = new JTextField();
		txtFechaIniAlquiler.setToolTipText("Debe ser la fecha en formato: YYYY-MM-DD");
		txtFechaIniAlquiler.setBounds(182, 241, 126, 20);
		panel_1.add(txtFechaIniAlquiler);
		txtFechaIniAlquiler.setColumns(10);

		txtFechaFinAlqui = new JTextField();
		txtFechaFinAlqui.setToolTipText("Debe ser la fecha en formato: YYYY-MM-DD");
		txtFechaFinAlqui.setBounds(182, 270, 126, 20);
		panel_1.add(txtFechaFinAlqui);
		txtFechaFinAlqui.setColumns(10);

		txtDuracionContrato = new JTextField();
		txtDuracionContrato.setToolTipText("");
		txtDuracionContrato.setBounds(182, 308, 126, 20);
		panel_1.add(txtDuracionContrato);
		txtDuracionContrato.setColumns(10);

		txtPrecioAlqui = new JTextField();
		txtPrecioAlqui.setBounds(457, 253, 135, 20);
		panel_1.add(txtPrecioAlqui);
		txtPrecioAlqui.setColumns(10);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Modificacion", null, panel_3, null);
		panel_3.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 620, 299);
		panel_3.add(scrollPane);

		JComboBox comboBoxG = new JComboBox();

		comboBoxG.setModel(new DefaultComboBoxModel(new String[] {"ANDA", " CONTADURIA ", " DEPÓSITO"}));
		comboBoxG.setBounds(457, 285, 135, 22);
		panel_1.add(comboBoxG);

		JButton AgreContrato = new JButton("Agragar contrato");
		AgreContrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String numContrato= txtNumContrato.getText();
				String ClienteCompra= txtIdClieCompra.getText();
				String ClienteVende= txtIdClieVende.getText();
				String IdInmueble= txtNumInmueble.getText();
				String fechaIniAlquiler= txtFechaFinAlqui.getText();
				String fechaFinAlqui= txtFechaIniAlquiler.getText();
				String duracionContrato=txtDuracionContrato.getText();
				String precioAlquiler= txtPrecioAlqui.getText();
				String garantia;


				if (validaciones.validarContraseña(numContrato)) {
					if (validaciones.validarCedula(ClienteCompra) && MisMetodos.validarExisteCliente(ClienteCompra) &&  !ClienteCompra.equals(ClienteVende)) {
						if (validaciones.validarCedula(ClienteVende) && MisMetodos.validarExisteCliente(ClienteVende)) {
							if (validaciones.validarPadron(IdInmueble) && MisMetodos.validarExisteInmueble(IdInmueble)) {
								if (validaciones.validarFecha(fechaIniAlquiler)) {
									if (validaciones.validarFecha(fechaFinAlqui)) {
										if (validaciones.validarDuracionContrato(duracionContrato)) {
											if (validaciones.validarnum(precioAlquiler)) {
												datos.setClienteVende(ClienteVende);
												datos.setPadron(IdInmueble);
												if (datos.verificarInmueblePerteneceCliente(datos)) {
													
											
												ClienteCompra = ClienteCompra.isEmpty() ? null : ClienteCompra;
												ClienteVende = ClienteVende.isEmpty() ? null : ClienteVende;
												fechaIniAlquiler = fechaIniAlquiler.isEmpty() ? null : fechaIniAlquiler;
												fechaFinAlqui = fechaFinAlqui.isEmpty() ? null : fechaFinAlqui;
												precioAlquiler = precioAlquiler.isEmpty() ? null : precioAlquiler;

												garantia= comboBoxG.getSelectedItem().toString();

												datos.setNumContrato(numContrato);
												datos.setClienteCompra(ClienteCompra);
												datos.setFechaIniAlquiler(fechaIniAlquiler);
												datos.setFechaFinAlqui(fechaFinAlqui);
												datos.setDuracionContrato(duracionContrato);
												datos.setPrecioAlquiler(precioAlquiler);
												datos.setDescripcionContrato( textAreAcuerdo.getText());
												datos.setTipoGarantia(garantia);
												datos.setTipoContrato("Alquiler");
												MisMetodos.nuevoContrato(datos);
												MisMetodos.nuevoContratoAlquiler(datos);
												JOptionPane.showMessageDialog(null, "Alquiler agregado correctamente");

												}else {
													JOptionPane.showMessageDialog(null, "el inmueble no pertenece a ese cliente");
													txtIdClieVende.setText("");
													txtIdClieVende.requestFocus();
												}

											} else {
												JOptionPane.showMessageDialog(null, "El precio no es correcto");
												txtPrecioAlqui.setText("");
												txtPrecioAlqui.requestFocus();
											}
										} else {
											JOptionPane.showMessageDialog(null, "No ingresó correctamente la duración del contrato. Ingrese nuevamente.");
											txtDuracionContrato.setText("");
											txtDuracionContrato.requestFocus();
										}
									} else {
										JOptionPane.showMessageDialog(null, "La fecha está en formato incorrecto. Recuerda que es YYYY-MM-DD");
										txtFechaFinAlqui.setText("");
										txtFechaFinAlqui.requestFocus();
									}
								} else {
									JOptionPane.showMessageDialog(null, "La fecha está en formato incorrecto. Recuerda que es YYYY-MM-DD");
									txtFechaIniAlquiler.setText("");
									txtFechaIniAlquiler.requestFocus();
								}
							} else {
								JOptionPane.showMessageDialog(null, "El padron del inmueble no es correcto");
								txtNumInmueble.setText("");
								txtNumInmueble.requestFocus();
							}
						} else {
							JOptionPane.showMessageDialog(null, "La cedula del cliente vendedor no es correcta");
							txtIdClieVende.setText("");
							txtIdClieVende.requestFocus();
						}
					} else {
						JOptionPane.showMessageDialog(null, "La cedula del cliente comprador no es correcta o estas repitiendo la cedula en el vendedor");
						txtIdClieCompra.setText("");
						txtIdClieCompra.requestFocus();
					}
				} else {
					JOptionPane.showMessageDialog(null, "El número de contrato ingresado no es correcto");
					txtNumContrato.setText("");
					txtNumContrato.requestFocus();
				}
			}





		}

				);
		AgreContrato.setBounds(451, 375, 157, 23);
		panel_1.add(AgreContrato);





		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		scrollPane.setViewportView(table);
		DefaultTableModel model = new DefaultTableModel();

		table.setModel(model);





		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Cliente", "inmueble", "contratoalquiler", "contratocompraventa"}));

		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Asignar el valor a la variable global nombreTabla
				nombreTabla = comboBox1.getSelectedItem().toString();

				if (comboBox1.getSelectedIndex() == 0) {
					MisMetodos.ConsultarCliente(table, nombreTabla);
				} else if (comboBox1.getSelectedIndex() == 1) {
					MisMetodos.ConsultarInmuebles(table, nombreTabla);
				} else if (comboBox1.getSelectedIndex() == 2) {
					MisMetodos.ConsultarContratosAlquiler(table, nombreTabla);
				} else if (comboBox1.getSelectedIndex() == 3) {
					MisMetodos.ConsultarContratosCompraVenta(table, nombreTabla);
				}


			}
		});


		System.out.println("el nombreTabla vale: "+nombreTabla);

		comboBox1.setBounds(52, 332, 158, 22);
		panel_3.add(comboBox1);
		//opciones de las modificaciones en la combobox 

		JButton btnNewButton_9 = new JButton("Agregar cambios");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				int column = table.getSelectedColumn();
				if (row != -1 && column != -1) {
				String columnName = table.getColumnName(column);
				String columnaId = table.getColumnName(0);      	          
				Object idFilaSeleccionada = table.getValueAt(row, 0);
				datos.setAtributoCambiar(idFilaSeleccionada.toString());
				table.getCellEditor().stopCellEditing(); // Asegura que cualquier edición en curso se complete
			
				Object atributoNuevo = table.getValueAt(row, column);
		

				System.out.println("el valor de atributoNuevo es :"+ atributoNuevo);

				switch (comboBox1.getSelectedIndex()) {
				//cliente
				case 0:

						if (datos.VerificarExisteContrato(idFilaSeleccionada.toString())) {
							if (columnName.equals("idCliente")) {

								
								int op=JOptionPane.showConfirmDialog(null, "el cliente tiene contratos asociados desea modificarlos tambien?");

								
								switch (op) {
								case 0 :
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
									JOptionPane.showMessageDialog(null, "modificado correctamente");
									break;
								case 1, -1,2:

									break;
					
								}

								
								
							} else {
								switch (column) {
							
								case 1:
									if (validaciones.validarNombreUsuario(atributoNuevo.toString())) {
										datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);

									}else {
										JOptionPane.showMessageDialog(null, "el nombre no es correcto");
									}

									break;
								case 2:
									if (validaciones.validarNombreUsuario(atributoNuevo.toString())) {
										datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);

									}else {
										JOptionPane.showMessageDialog(null, "el apellido no es correcto");
									}

									break;
								case 4:
									if (validaciones.validarEmail(atributoNuevo.toString())) {
										
										datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
									}else {
										JOptionPane.showMessageDialog(null, "el email no es correcto");
									}

									break;
								case 5:
									
									if (validaciones.validarTelefonoCelularUruguay(atributoNuevo.toString())) {
										datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
										
										
									}else {
										JOptionPane.showMessageDialog(null, "el telefono no es correcto");
									}
									break;
								}
							}

						}else {

							switch (column) {
							case 0:

								if(validaciones.validarCedula(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);

								}else {
									JOptionPane.showMessageDialog(null, "la cedula ingresada no es correcta");
								}
								break;
							case 1:
								if (validaciones.validarNombreUsuario(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);

								}else {
									JOptionPane.showMessageDialog(null, "el nombre no es correcto");
								}

								break;
							case 2:
								if (validaciones.validarNombreUsuario(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);

								}else {
									JOptionPane.showMessageDialog(null, "el apellido no es correcto");
								}

								break;
							case 4:
								if (validaciones.validarEmail(atributoNuevo.toString())) {
									
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								}else {
									JOptionPane.showMessageDialog(null, "el email no es correcto");
								}

								break;
							case 5:
								if (validaciones.validarTelefonoCelularUruguay(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								}else {
									JOptionPane.showMessageDialog(null, "el telefono no es correcto");
								}
								break;
							}

 

						}
					
					break;
					//inmueble
			
				case 1:
					
					
							switch (column) {
							case 0:								
								if (validaciones.validarPadron(atributoNuevo.toString())) {
									if (datos.verificarInmuebleContrato(idFilaSeleccionada.toString())) {
								
											
											int op=JOptionPane.showConfirmDialog(null, "el inmueble tiene contratos asociados desea modificarlos tambien?");

											
											switch (op) {
											case 0 :
												datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
												JOptionPane.showMessageDialog(null, "modificado correctamente");
												break;
											case 1, -1,2:

												break;
								
											}
											
									} else {
										datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
										JOptionPane.showMessageDialog(null, "modificado correctamente");
									}
									
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								}else {
									JOptionPane.showMessageDialog(null, "el padron no es correcto");
								}
							

								break;

							case 1:

								if (validaciones.validarUbicacion(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								}else {
									JOptionPane.showMessageDialog(null, "la ubicacion no es correcto");
								}
								break;
							case 2,4,7,8,9:
								if (validaciones.validarnumero(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
									JOptionPane.showMessageDialog(null, "se cambio correctamente");
								}else{
									JOptionPane.showMessageDialog(null, "el valor no es correcto");
								}
								break;
							case 3:
								if (validaciones.validarTipoInmueble(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
									JOptionPane.showMessageDialog(null, "se cambio correctamente");
								}else{
									JOptionPane.showMessageDialog(null, "el tipo de inmueble  no es correcto");
								}

								break;
							case 5:
								if (validaciones.validarServicios(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
									JOptionPane.showMessageDialog(null, "se cambio correctamente");

								}else{
									JOptionPane.showMessageDialog(null, "los servicios no son correctos");
								}
								break;
							case 6:
								if (validaciones.validarTipoVivienda(atributoNuevo.toString())) {
									datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								}else {
									JOptionPane.showMessageDialog(null, "el tipo de vivivienda no es correcto ");
								}

								break;
							case 11:
							if (datos.validarExisteCliente(atributoNuevo.toString())) {
								datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);

							} else {
								JOptionPane.showMessageDialog(null, "el cilente que esta intentando ingresar como dueño no existe ");

							}
							
							break;
							}

							
						
				

						
				
					

					break;
					
					
					//alquiler
				case 2:
					if (columnName.equals("idContratoAlquiler")) {
						datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
						JOptionPane.showMessageDialog(null, "contrato modificado correctamente");
				}
				
					switch (column) {
					case 1:
						if(!atributoNuevo.toString().equals("Alquiler")) {
							JOptionPane.showMessageDialog(null, "debe ser contrato Alquiler");
						}
						break;
					case 2,3:
						if (validaciones.validarCedula(atributoNuevo.toString())) {
							if (MisMetodos.validarExisteCliente(atributoNuevo.toString())) {

								datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								
							} else {
								JOptionPane.showMessageDialog(null, "el cliente no existe");
							}
							
							
						} else {
							JOptionPane.showMessageDialog(null, "la cedula no es correcta");
						}

						
						break;
						
					case 4:
						if (validaciones.validarPadron(atributoNuevo.toString())) {
							if (MisMetodos.validarExisteInmueble(atributoNuevo.toString())) {
								datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								JOptionPane.showMessageDialog(null, "padron actualizado correctamente");
							} else {
								JOptionPane.showMessageDialog(null, "ese inmueble no existe");
							}
							
						} else {	
							JOptionPane.showMessageDialog(null, "no ingreso correctamente el padron");
						}

						break;
						
					case 5,6:

						if (validaciones.validarFecha(atributoNuevo.toString())) {
							
							datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
							
							
						} else {
							JOptionPane.showMessageDialog(null, "no ingreso fecha correctamente");
						}
						break;
					case 7:
						if (validaciones.validarDuracionContrato(atributoNuevo.toString())) {
							datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
						} else {
							JOptionPane.showMessageDialog(null, "la duracion no es correcta");
						}
						
						break;
						
					case 8:
						if (validaciones.validarnumero(atributoNuevo.toString())) {
							
							datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
						} else {
							JOptionPane.showMessageDialog(null, "preciono ingresado no es correcto");
						}
						
						break;
						
					}
					
					
					break;
					//compraVenta
				case 3:
					if (columnName.equals("idContratoCompraVenta")) {
						datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
						JOptionPane.showMessageDialog(null, "contrato modificado correctamente");
				}
				
					switch (column) {
					case 1:
						if(!atributoNuevo.toString().equals("CompraVenta")) {
							JOptionPane.showMessageDialog(null, "debe ser contrato CompraVenta");
						}
						break;
					case 2,3:
						if (validaciones.validarCedula(atributoNuevo.toString())) {
							if (MisMetodos.validarExisteCliente(atributoNuevo.toString())) {

								datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								
							} else {
								JOptionPane.showMessageDialog(null, "el cliente no existe");
							}
							
							
						} else {
							JOptionPane.showMessageDialog(null, "la cedula no es correcta");
						}

						
						break;
						
					case 4:
						if (validaciones.validarPadron(atributoNuevo.toString())) {
							if (MisMetodos.validarExisteInmueble(atributoNuevo.toString())) {
								datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
								JOptionPane.showMessageDialog(null, "padron actualizado correctamente");
							} else {
								JOptionPane.showMessageDialog(null, "ese inmueble no existe");
							}
							
						} else {	
							JOptionPane.showMessageDialog(null, "no ingreso correctamente el padron");
						}

						break;
						
					case 5,6:

						if (validaciones.validarFecha(atributoNuevo.toString())) {
							
							datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
							
							
						} else {
							JOptionPane.showMessageDialog(null, "no ingreso fecha correctamente");
						}
						break;
					case 7:
						if (validaciones.validarDuracionContrato(atributoNuevo.toString())) {
							datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
						} else {
							JOptionPane.showMessageDialog(null, "la duracion no es correcta");
						}
						
						break;
						
					case 8:
						if (validaciones.validarnumero(atributoNuevo.toString())) {
							
							datos.actualizarBaseDeDatos(row, columnName, atributoNuevo, idFilaSeleccionada, columnaId, nombreTabla);
						} else {
							JOptionPane.showMessageDialog(null, "preciono ingresado no es correcto");
						}
						
						break;
						
					}
	
					break;

				}


				}else {
					JOptionPane.showMessageDialog(null, "no a seleccionado ninguna celda");
				}


			} 

		});
		btnNewButton_9.setBounds(478, 390, 152, 23);
		panel_3.add(btnNewButton_9);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Contratos CompraVenta", null, panel_2, null);
		panel_2.setLayout(null);



		JLabel lblncontrato_1 = new JLabel("Ingrese el Numero de contrato");
		lblncontrato_1.setBounds(10, 91, 169, 14);
		panel_2.add(lblncontrato_1);

		txtnumContratoCompraVemta = new JTextField();
		txtnumContratoCompraVemta.setColumns(10);
		txtnumContratoCompraVemta.setBounds(192, 88, 126, 20);
		panel_2.add(txtnumContratoCompraVemta);

		JLabel lblNewLabel_12_1 = new JLabel("Padron del Inmueble");
		lblNewLabel_12_1.setBounds(22, 187, 157, 14);
		panel_2.add(lblNewLabel_12_1);

		txtPadronCompraVenta = new JTextField();
		txtPadronCompraVenta.setToolTipText("de 6 a 10 digitos numericos");
		txtPadronCompraVenta.setColumns(10);
		txtPadronCompraVenta.setBounds(182, 184, 126, 20);
		panel_2.add(txtPadronCompraVenta);

		JLabel lblNewLabel_14_1 = new JLabel("CI Cliente Compra");
		lblNewLabel_14_1.setBounds(10, 218, 169, 14);
		panel_2.add(lblNewLabel_14_1);

		txtCiCompraContratosCompraVenta = new JTextField();
		txtCiCompraContratosCompraVenta.setColumns(10);
		txtCiCompraContratosCompraVenta.setBounds(182, 215, 124, 20);
		panel_2.add(txtCiCompraContratosCompraVenta);

		JLabel lblNewLabel_15_1 = new JLabel("CI Clientre Vende");
		lblNewLabel_15_1.setBounds(10, 253, 169, 14);
		panel_2.add(lblNewLabel_15_1);

		txtCiVendeContatosCompraVenta = new JTextField();
		txtCiVendeContatosCompraVenta.setColumns(10);
		txtCiVendeContatosCompraVenta.setBounds(182, 250, 124, 20);
		panel_2.add(txtCiVendeContatosCompraVenta);

		txtFecahComrpaVenta = new JTextField();
		txtFecahComrpaVenta.setBounds(192, 134, 126, 20);
		panel_2.add(txtFecahComrpaVenta);
		txtFecahComrpaVenta.setColumns(10);

		JTextArea textAreAcuerdoCompraVenta = new JTextArea();

		textAreAcuerdoCompraVenta.setBounds(427, 66, 181, 190);
		panel_2.add(textAreAcuerdoCompraVenta);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String numContrato= txtnumContratoCompraVemta.getText();
				String ClienteCompra= txtCiCompraContratosCompraVenta.getText();
				String ClienteVende= txtCiVendeContatosCompraVenta.getText();
				String IdInmueble= txtPadronCompraVenta.getText();
				String fechaCompraVenta= txtFecahComrpaVenta.getText();
				String DescripcionContrato= textAreAcuerdoCompraVenta.getText();


				if (validaciones.validarContraseña(numContrato)) {
					if (validaciones.validarCedula(ClienteCompra) && MisMetodos.validarExisteCliente(ClienteCompra) && !ClienteCompra.equals(ClienteVende)) {
						if (validaciones.validarCedula(ClienteVende) && MisMetodos.validarExisteCliente(ClienteVende)) {
							if (validaciones.validarPadron(IdInmueble) && MisMetodos.validarExisteInmueble(IdInmueble)) {
								if (validaciones.validarFecha(fechaCompraVenta)) {

									datos.setNumContrato(numContrato);
									datos.setClienteCompra(ClienteCompra);
									datos.setClienteVende(ClienteVende);
									datos.setPadron(IdInmueble);
									datos.setDescripcionContrato(DescripcionContrato);
									datos.setFechaCompraVenta(fechaCompraVenta);
								
									if (datos.verificarInmueblePerteneceCliente(datos)) {
										MisMetodos.nuevoContrato(datos);
										MisMetodos.nuevoContratoCompraVenta(datos);
									} else {
										JOptionPane.showMessageDialog(null, "el inmueble no pertenece la cliente vendedor");
									}
								


								} else {
									JOptionPane.showMessageDialog(null, "la fecha no esta en el formato adecuado");
									txtFecahComrpaVenta.setText("");
									txtFecahComrpaVenta.requestFocus();
								}


							} else {
								JOptionPane.showMessageDialog(null, "El padron del inmueble no es correcto");
								txtNumInmueble.setText("");
								txtNumInmueble.requestFocus();
							}
						} else {
							JOptionPane.showMessageDialog(null, "La cedula del cliente vendedor no es correcta");
							txtIdClieVende.setText("");
							txtIdClieVende.requestFocus();
						}
					} else {
						JOptionPane.showMessageDialog(null, "La cedula del cliente comprador no es correcta o se repitio la cedula en el vendedor tambien");
						txtIdClieCompra.setText("");
						txtIdClieCompra.requestFocus();
					}
				} else {
					JOptionPane.showMessageDialog(null, "El número de contrato ingresado no es correcto");
					txtNumContrato.setText("");
					txtNumContrato.requestFocus();
				}


			}
		});
		btnNewButton_2.setBounds(434, 339, 89, 23);
		panel_2.add(btnNewButton_2);



		JLabel lblNewLabel_11 = new JLabel("fecha CompraVenta");
		lblNewLabel_11.setBounds(10, 137, 140, 17);
		panel_2.add(lblNewLabel_11);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Inmuebles", null, panel_4, null);
		panel_4.setLayout(null);

		JLabel lblNewLabel_16 = new JLabel("Padron");
		lblNewLabel_16.setBounds(22, 25, 120, 14);
		panel_4.add(lblNewLabel_16);

		JLabel lblNewLabel_22 = new JLabel("Ubicacion");
		lblNewLabel_22.setBounds(22, 65, 85, 14);
		panel_4.add(lblNewLabel_22);

		JLabel lblNewLabel_23 = new JLabel("Valor");
		lblNewLabel_23.setBounds(22, 102, 143, 14);
		panel_4.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("Tipo");
		lblNewLabel_24.setToolTipText("terreno,habitable");
		lblNewLabel_24.setBounds(22, 141, 143, 14);
		panel_4.add(lblNewLabel_24);

		JLabel lblNewLabel_25 = new JLabel("tamaño");
		lblNewLabel_25.setBounds(22, 182, 143, 14);
		panel_4.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("servicios");
		lblNewLabel_26.setBounds(22, 217, 143, 14);
		panel_4.add(lblNewLabel_26);

		JLabel lblNewLabel_27 = new JLabel("tipoVivienda");
		lblNewLabel_27.setBounds(22, 255, 85, 14);
		panel_4.add(lblNewLabel_27);

		JLabel lblNewLabel_28 = new JLabel("Cantidad Baños");
		lblNewLabel_28.setBounds(22, 300, 143, 14);
		panel_4.add(lblNewLabel_28);

		JLabel lblNewLabel_29 = new JLabel("cantidad Habitaciones");
		lblNewLabel_29.setBounds(22, 337, 143, 14);
		panel_4.add(lblNewLabel_29);

		JLabel lblNewLabel_30 = new JLabel("Otras Habitaciones");
		lblNewLabel_30.setBounds(22, 378, 143, 14);
		panel_4.add(lblNewLabel_30);

		JLabel lblNewLabel_31 = new JLabel("comodidades");
		lblNewLabel_31.setBounds(373, 25, 88, 14);
		panel_4.add(lblNewLabel_31);

		txtPadronInmueble = new JTextField();
		txtPadronInmueble.setBounds(87, 18, 163, 29);
		panel_4.add(txtPadronInmueble);
		txtPadronInmueble.setColumns(10);

		txtUbicacion = new JTextField();
		txtUbicacion.setText("EJ:Departamento 123, Calle Principal #456");
		txtUbicacion.setBounds(117, 62, 186, 20);
		panel_4.add(txtUbicacion);
		txtUbicacion.setColumns(10);

		txtValor = new JTextField();
		txtValor.setBounds(127, 99, 176, 20);
		panel_4.add(txtValor);
		txtValor.setColumns(10);

		txtTipo = new JTextField();
		txtTipo.setToolTipText("terreno.habitable");
		txtTipo.setBounds(117, 138, 186, 20);
		panel_4.add(txtTipo);
		txtTipo.setColumns(10);

		txtTamaño = new JTextField();
		txtTamaño.setBounds(117, 176, 186, 20);
		panel_4.add(txtTamaño);
		txtTamaño.setColumns(10);

		txtServicios = new JTextField();
		txtServicios.setToolTipText("OSE,UTE o solo 1");
		txtServicios.setBounds(117, 207, 186, 20);
		panel_4.add(txtServicios);
		txtServicios.setColumns(10);

		txtTipoVivienda = new JTextField();
		txtTipoVivienda.setToolTipText("apartamento,casa,mejoras");
		txtTipoVivienda.setBounds(117, 252, 186, 20);
		panel_4.add(txtTipoVivienda);
		txtTipoVivienda.setColumns(10);

		txtCantBaños = new JTextField();
		txtCantBaños.setBounds(117, 297, 186, 20);
		panel_4.add(txtCantBaños);
		txtCantBaños.setColumns(10);

		txtCantHabit = new JTextField();
		txtCantHabit.setBounds(127, 334, 199, 20);
		panel_4.add(txtCantHabit);
		txtCantHabit.setColumns(10);

		txtOtrasHabit = new JTextField();
		txtOtrasHabit.setBounds(119, 375, 199, 20);
		panel_4.add(txtOtrasHabit);
		txtOtrasHabit.setColumns(10);

		txtComodidades = new JTextField();
		txtComodidades.setBounds(471, 22, 157, 20);
		panel_4.add(txtComodidades);
		txtComodidades.setColumns(10);

		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Ubicacion = txtUbicacion.getText();
				String valor= txtValor.getText();
				String tipoInmueble= txtTipo.getText();
				String Tamaño= txtTamaño.getText();
				String Servicios= txtServicios.getText();
				String tipoVivienda= txtTipoVivienda.getText();
				String CantBaños = txtCantBaños.getText();
				String cantHabitaciones = txtCantHabit.getText();
				String OtrasHabit= txtOtrasHabit.getText();
				String comodidades= txtComodidades.getText();
				String padron=txtPadronInmueble.getText();
				String ciCliente=txtCliente.getText();

				if (validaciones.validarPadron(padron)) {
					if (validaciones.validarnumero(valor)) {
						if (validaciones.validarUbicacion(Ubicacion)) {
							if (validaciones.validarTipoInmueble(tipoInmueble)) {
								if (Double.parseDouble(Tamaño)>0) {
									if (validaciones.validarServicios(Servicios)) {
										if (validaciones.validarTipoVivienda(tipoVivienda)) {
											if (validaciones.validarnumero(CantBaños)) {
												if (validaciones.validarnumero(cantHabitaciones)) {
													if (validaciones.validarCedula(ciCliente) && MisMetodos.validarExisteCliente(ciCliente)) {




														datos.setPadron(padron);
														datos.setUbicacion(Ubicacion);
														datos.setValor(valor);
														datos.setTipoInmueble(tipoInmueble);
														datos.setTamaño(Tamaño);
														datos.setServicios(Servicios);
														datos.setTipoVivienda(tipoVivienda);
														datos.setCantBaños(CantBaños);
														datos.setCantHabitaciones(cantHabitaciones);
														datos.setOtrasHabit(OtrasHabit);
														datos.setComodidades(comodidades);
														datos.setCi(ciCliente);
														MisMetodos.nuevoInmueble(datos);


													} else {
														JOptionPane.showMessageDialog(null, "el cliente ingresado no existe");
													}

												} else {
													JOptionPane.showMessageDialog(null, "la cantidad de habitaciones no es correcta");
													txtCantHabit.setText("");
													txtCantHabit.requestFocus();
												}


											} else {
												JOptionPane.showMessageDialog(null, "La contida de baños no es correcta");
												txtCantBaños.setText("");
												txtCantBaños.requestFocus();
											}

										} else {
											JOptionPane.showMessageDialog(null, "El tipo de vivienda no es correcto (apartamento casa mejoras)");
											txtTipoVivienda.setText("");
											txtTipoVivienda.requestFocus();
										}
									} else {
										JOptionPane.showMessageDialog(null, "Los servicios deben ser OSE o UTE en mayuscula");
										txtServicios.setText("");
										txtServicios.requestFocus();
									}
								} else {
									JOptionPane.showMessageDialog(null, "el tamaño no puede ser menor a 0");
									txtTamaño.setText("");
									txtTamaño.requestFocus();
								}


							} else {
								JOptionPane.showMessageDialog(null, "el tipo de inmueble no es el correcto terreno o habitable");
								txtTipo.setText("");
								txtTipo.requestFocus();
							}

						} else {
							JOptionPane.showMessageDialog(null, "la ubicacion es incorrecta");
							txtUbicacion.setText("");
							txtUbicacion.requestFocus();

						}

					} else {
						JOptionPane.showMessageDialog(null, "El valor no es correcto");
						txtValor.setText("");
						txtValor.requestFocus();
					}


				}else {
					JOptionPane.showMessageDialog(null, "El padron del inmueble no es correcto");
					txtPadronInmueble.setText("");
					txtPadronInmueble.requestFocus();
				}









			}
		});
		btnNewButton_7.setBounds(516, 374, 89, 23);
		panel_4.add(btnNewButton_7);

		txtCliente = new JTextField();
		txtCliente.setBounds(471, 84, 157, 20);
		panel_4.add(txtCliente);
		txtCliente.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Cliente");
		lblNewLabel_6.setBounds(373, 87, 69, 14);
		panel_4.add(lblNewLabel_6);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Eliminaciones", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel lblNewLabel_34 = new JLabel("Eliminar Contrato Compra VEnta");
		lblNewLabel_34.setBounds(57, 92, 194, 14);
		panel_5.add(lblNewLabel_34);

		JLabel lblNewLabel_35 = new JLabel("Eliminar Contrato Alquiler");
		lblNewLabel_35.setBounds(57, 195, 156, 14);
		panel_5.add(lblNewLabel_35);

		txtElimContratoCompraVenta = new JTextField();
		txtElimContratoCompraVenta.setBounds(276, 89, 200, 20);
		panel_5.add(txtElimContratoCompraVenta);
		txtElimContratoCompraVenta.setColumns(10);

		txtElimContratoAlquiler = new JTextField();
		txtElimContratoAlquiler.setBounds(276, 192, 200, 20);
		panel_5.add(txtElimContratoAlquiler);
		txtElimContratoAlquiler.setColumns(10);

		JLabel lblNewLabel_38 = new JLabel("Ingrese el id contrato compra venta");
		lblNewLabel_38.setBounds(276, 52, 214, 14);
		panel_5.add(lblNewLabel_38);

		JLabel lblNewLabel_39 = new JLabel("Ingrese el id contrato alquiler");
		lblNewLabel_39.setBounds(276, 157, 183, 14);
		panel_5.add(lblNewLabel_39);

		JButton btnNewButton_8 = new JButton("Eliminar");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			
				
				String ContratoAlquiler= txtElimContratoAlquiler.getText();
				String ContratoCompraVenta= txtElimContratoCompraVenta.getText();

				
					
						if (ContratoAlquiler.isEmpty()) {
							if (ContratoCompraVenta.isEmpty()) {
								JOptionPane.showMessageDialog(null, "no ingreso nada");
							} else {
								datos.setContratoCompraVentaElim(ContratoCompraVenta);
								datos.setIdContrato(ContratoCompraVenta);
								MisMetodos.eliminarContrato(datos);
								MisMetodos.eliminarContratoCompraVenta(datos);
								
								
							}
						} else {
							datos.setContratoAlquilerElim(ContratoAlquiler);
							datos.setIdContrato(ContratoAlquiler);
							MisMetodos.eliminarContrato(datos);
							MisMetodos.eliminarContratoAlquiler(Integer.parseInt(ContratoAlquiler));
							
						}

					
			}
		});
		btnNewButton_8.setBounds(479, 359, 89, 23);
		panel_5.add(btnNewButton_8);
	}
}
