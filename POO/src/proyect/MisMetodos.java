package proyect;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MisMetodos {

	// atributos de la clase, para manipular los datos
	private String ci;
	private String nombre;
	private String apellido;
	private String FechaNacimiento;
	private String Email;
	private String telefono;
	private String padron;
	private String NumContrato;
	public String getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	private String ClienteCompra;
	private String clienteVende;
	private String fechaCompraVenta;
	private String fechaIniAlquiler;
	private String fechaFinAlqui;
	private String duracionContrato;
	private String precioAlquiler;
	private String tipoGarantia;
	private String tipoContrato;
	private String DescripcionContrato;
	private String Ubicacion;
	private String valor;
	private String tipoInmueble;
	private String Tamaño;
	private String Servicios;
	private String tipoVivienda;
	private String CantBaños;
	private String cantHabitaciones;
	private String OtrasHabit;
	private String comodidades;
	private String atributoCambiar;
	
	private String idContrato;
	
	public String getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(String idContrato) {
		this.idContrato = idContrato;
	}
	private String cedulaElim;
	private String InmuebleElim;
	private String ContratoAlquilerElim;
	private String ContratoCompraVentaElim;
	
	private String us;
	private String passUs;
	private String Rol;
	
	public String getUs() {
		return us;
	}

	public void setUs(String us) {
		this.us = us;
	}

	public String getPassUs() {
		return passUs;
	}

	public void setPassUs(String passUs) {
		this.passUs = passUs;
	}

	public String getRol() {
		return Rol;
	}

	public void setRol(String rol) {
		Rol = rol;
	}

	public String getAtributoCambiar() {
		return atributoCambiar;
	}

	public void setAtributoCambiar(String atributoCambiar) {
		this.atributoCambiar = atributoCambiar;
	}
	
	
	
	
	
	public String getCedulaElim() {
		return cedulaElim;
	}

	public void setCedulaElim(String cedulaElim) {
		this.cedulaElim = cedulaElim;
	}

	public String getInmuebleElim() {
		return InmuebleElim;
	}

	public void setInmuebleElim(String inmuebleElim) {
		InmuebleElim = inmuebleElim;
	}

	public String getContratoAlquilerElim() {
		return ContratoAlquilerElim;
	}

	public void setContratoAlquilerElim(String contratoAlquilerElim) {
		ContratoAlquilerElim = contratoAlquilerElim;
	}

	public String getContratoCompraVentaElim() {
		return ContratoCompraVentaElim;
	}

	public void setContratoCompraVentaElim(String contratoCompraVentaElim) {
		ContratoCompraVentaElim = contratoCompraVentaElim;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		Ubicacion = ubicacion;
	}

	public String getTipoInmueble() {
		return tipoInmueble;
	}

	public void setTipoInmueble(String tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public String getTamaño() {
		return Tamaño;
	}

	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
	}

	public String getServicios() {
		return Servicios;
	}

	public void setServicios(String servicios) {
		Servicios = servicios;
	}

	public String getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public String getCantBaños() {
		return CantBaños;
	}

	public void setCantBaños(String cantBaños) {
		CantBaños = cantBaños;
	}

	public String getCantHabitaciones() {
		return cantHabitaciones;
	}

	public void setCantHabitaciones(String cantHabitaciones) {
		this.cantHabitaciones = cantHabitaciones;
	}

	public String getOtrasHabit() {
		return OtrasHabit;
	}

	public void setOtrasHabit(String otrasHabit) {
		OtrasHabit = otrasHabit;
	}

	public String getComodidades() {
		return comodidades;
	}

	public void setComodidades(String comodidades) {
		this.comodidades = comodidades;
	}

	public String getDescripcionContrato() {
		return DescripcionContrato;
	}

	public void setDescripcionContrato(String descripcionContrato) {
		DescripcionContrato = descripcionContrato;
	}

	public String getNumContrato() {
		return NumContrato;
	}

	public void setNumContrato(String numContrato) {
		NumContrato = numContrato;
	}

	public String getClienteCompra() {
		return ClienteCompra;
	}

	public void setClienteCompra(String clienteCompra) {
		ClienteCompra = clienteCompra;
	}

	public String getClienteVende() {
		return clienteVende;
	}

	public void setClienteVende(String clienteVende) {
		this.clienteVende = clienteVende;
	}

	public String getFechaCompraVenta() {
		return fechaCompraVenta;
	}

	public void setFechaCompraVenta(String fechaCompraVenta) {
		this.fechaCompraVenta = fechaCompraVenta;
	}

	public String getFechaIniAlquiler() {
		return fechaIniAlquiler;
	}

	public void setFechaIniAlquiler(String fechaIniAlquiler) {
		this.fechaIniAlquiler = fechaIniAlquiler;
	}

	public String getFechaFinAlqui() {
		return fechaFinAlqui;
	}

	public void setFechaFinAlqui(String fechaFinAlqui) {
		this.fechaFinAlqui = fechaFinAlqui;
	}

	public String getDuracionContrato() {
		return duracionContrato;
	}

	public void setDuracionContrato(String duracionContrato) {
		this.duracionContrato = duracionContrato;
	}

	public String getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(String precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public String getTipoGarantia() {
		return tipoGarantia;
	}

	public void setTipoGarantia(String tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPadron() {
		return padron;
	}

	public void setPadron(String padron) {
		this.padron = padron;
	}


	//mio
	private String user;
	private String contraseña;
	

	
	// constructor de la clase que permite definir objetos de tipo MisMetodos
	public MisMetodos() {
		super();
	}

	// métodos getters y setters para leer y escribir los atributos de la clase
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//mio
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	
	
	


	// Los datos para conectar con la base de datos
	
	private static String usuario="root";
	private static String pass="57110030";
	private static String baseDeDatos="cd";
	private static String url = "jdbc:mysql://127.0.0.1:3306/" + baseDeDatos + "?useSSL=false&serverTimezone=UTC";
	//Instancias de los objetos que usaremos en cada método 
	// para trabajar con la base de datos
	private static Connection conectar=null;
	private static Statement sentenciaSQL=null;
	private static ResultSet resultado=null;
	
	// Método para cargar el driver
	public static boolean cargarDrivers() {	
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver"); versiones nuevas
			Class.forName("com.mysql.jdbc.Driver");
			return true;
		} catch (Exception e2) {
			return false;
		}
	}// fin del método cargar

	

	
	public static boolean validarExisteInmueble(String Inmueble) {
		String sentencia="SELECT* FROM inmueble where idInmueble='"+Inmueble+"';";
		boolean encontro=false;
		 try {
	 			
	 			conectar=DriverManager.getConnection(url,usuario,pass);	
	 			sentenciaSQL=conectar.createStatement();
	 			
	 			resultado=sentenciaSQL.executeQuery(sentencia);
	 			
	 			if (resultado.next()) {
	 				encontro=true;
	 			}
	 			
	 			conectar.close();
	 			
	 		} catch (SQLException e) {
	 			
	 		//	System.out.println(e.getMessage()); solo si hay errores
	 			
	 		}
	 		return encontro;

	}
		
	  public static boolean validarExisteCliente(String ci){
	    	 String sentencia="SELECT * FROM Cliente where idCliente='"+ci+"';";

	    	 boolean encontro=false;
	    	 try {
	 			
	 			conectar=DriverManager.getConnection(url,usuario,pass);	
	 			sentenciaSQL=conectar.createStatement();
	 			
	 			resultado=sentenciaSQL.executeQuery(sentencia);
	 			
	 			if (resultado.next()) {
	 				encontro=true;
	 			}
	 			
	 			conectar.close();
	 			
	 		} catch (SQLException e) {
	 			
	 		//	System.out.println(e.getMessage()); solo si hay errores
	 			
	 		}
	 		return encontro;

	}	
	  
	  public static String BuscarUsuario(String password, String nomUs) {
		    String sentencia = "SELECT * FROM usuario WHERE idUsuario= '" + password + "' AND nombre = '" + nomUs + "';";
		    String rolEncontrado = ""; 

		    try {
		        conectar = DriverManager.getConnection(url, usuario, pass);
		        sentenciaSQL = conectar.createStatement();
		        resultado = sentenciaSQL.executeQuery(sentencia);

		        if (resultado.next()) {
		            
		            rolEncontrado = resultado.getString("rol");
		        }else {
		        	JOptionPane.showMessageDialog(null, "no se encontro el usuario");
		        }

		        conectar.close();

		    } catch (SQLException e) {
		        
		        // System.out.println(e.getMessage());
		    }
		    return rolEncontrado;
		}	  
		
	

	  public static void nuevoUsuario(MisMetodos datos) {
		  String sentencia = "INSERT INTO usuario (`idUsuario`, `nombre`, `rol`) VALUES ('" + datos.getContraseña() + "' , '" + datos.getUser() + "', '" + datos.getRol() + "');";

		    try {
		       
		    	conectar=DriverManager.getConnection(url,usuario,pass);	
				sentenciaSQL=conectar.createStatement();
				sentenciaSQL.executeUpdate(sentencia);
		        
		        
		
		        conectar.close();
		    } catch (SQLException e) {
		        System.out.println(e.getMessage());
		        JOptionPane.showMessageDialog(null, "Error al agregar usuario", "Error", JOptionPane.ERROR_MESSAGE);
		    }
		}

	  
	  public String buscarRol(MisMetodos datos, String NomUs, String pass) {
	    String rol = null;
	    String sentencia = "SELECT rol FROM usuario WHERE idUsuario = '" + pass + "' AND nombre = '" + NomUs + "';";
	    
	    try {
	    	conectar=DriverManager.getConnection(url,usuario,pass);	
			sentenciaSQL=conectar.createStatement();
			sentenciaSQL.executeUpdate(sentencia);
			conectar.close();

	        // Verifica si hay algún resultado en la consulta
	        if (resultado.next()) {
	           
	            rol = resultado.getString("rol");
	        }

	      
	        resultado.close();
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }

	    return rol;
	}
	  
	
	public static void nuevoCliente(MisMetodos datos) {
		
		String sentenciaIngresarCliente = "INSERT INTO Cliente " +
		        "(idCliente, nombre, apellido, fechaNacimiento, Email, telefono) " +
		        "VALUES ('" + Integer.parseInt(datos.getCi()) + "', '" + datos.getNombre() + "', '" + datos.getApellido() + "', '" +
		        datos.getFechaNacimiento() + "', '" + datos.getEmail() + "', '" + datos.getTelefono() + "');";

		
		try {
			conectar=DriverManager.getConnection(url,usuario,pass);	
			sentenciaSQL=conectar.createStatement();
			sentenciaSQL.executeUpdate(sentenciaIngresarCliente);
			conectar.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}

	
	}
	
	

	public static void nuevoContrato(MisMetodos datos) {
		
		String sentenciaIngresarContrato = "INSERT INTO contratos " +
	                "(idContrato, TipoContrato, ClienteCompra, ClienteVenta, Inmueble, DescripcionContrato) " +
	                "VALUES ('" + datos.getNumContrato() + "', 'Alquiler', '" +
	                datos.getClienteCompra() + "', '" + datos.getClienteVende() + "', '" +
	                datos.getPadron() + "', '" + datos.getDescripcionContrato() + "')";
		
		try {
	        conectar = DriverManager.getConnection(url, usuario, pass);
	        sentenciaSQL=conectar.createStatement();
			sentenciaSQL.executeUpdate(sentenciaIngresarContrato);
			conectar.close();
	     
	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	    }
	}
	
	public static void nuevoContratoAlquiler(MisMetodos datos) {
		String sentenciaIngresarContratoAlquiler = "INSERT INTO contratoalquiler " +
	            "(idContratoAlquiler, FechaInicioAlquiler, FechaFinalAlquiler, DuracionContrato, " +
	            "PrecioAlquiler, TipoGarantia, Inmueble, TipoContrato, ClienteCompra, ClienteVenta, DescripcionContrato) " +
	            "VALUES ('" + datos.getNumContrato() + "', '" + datos.getFechaIniAlquiler() + "', '" +
	            datos.getFechaFinAlqui() + "', '" + Integer.parseInt(datos.getDuracionContrato()) + "', '" +
	            datos.getPrecioAlquiler() + "', '" + datos.getTipoGarantia() + "', '" +
	            datos.getPadron() + "', '" + datos.getTipoContrato() + "', '" +
	            datos.getClienteCompra() + "', '" + datos.getClienteVende() + "', '" +
	            datos.getDescripcionContrato() + "')";
		
		 try {
		        conectar = DriverManager.getConnection(url, usuario, pass);
		        sentenciaSQL=conectar.createStatement();
				sentenciaSQL.executeUpdate(sentenciaIngresarContratoAlquiler);
				conectar.close();
		     
		    } catch (SQLException e) {
		        System.out.println(e.getMessage());
		    }
	}

	
	public static void nuevoContratoCompraVenta(MisMetodos datos){
		
		String sentenciaIngresarContratoCompraVenta = "INSERT INTO contratocompraventa " +
		        "(idContratoCompraVenta, TipoContrato, ClienteCompra, ClienteVenta, Inmueble, " +
		        "FechaCompraVenta, DescripcionContrato) " +
		        "VALUES ('" + datos.getNumContrato() + "', 'CompraVenta', '" +
		        datos.getClienteCompra() + "', '" + datos.getClienteVende() + "', '" +
		        datos.getPadron() + "', '"+datos.getFechaCompraVenta() + "', '" +
		        datos.getDescripcionContrato() + "')";

		try {
			
			conectar=DriverManager.getConnection(url,usuario,pass);	
			sentenciaSQL=conectar.createStatement();
			sentenciaSQL.executeUpdate(sentenciaIngresarContratoCompraVenta);
			conectar.close();
			JOptionPane.showMessageDialog(null, "Contrato agregado correctamente");
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public static void nuevoInmueble(MisMetodos datos)
	{
		
		
		String sentenciaIngresarNuevoInmueble = "INSERT INTO inmueble " +
			    "(idInmueble, Ubicacion, valor, tipo, tamanio, servicios, tipoVivienda, " +
			    "cantidadBanios, cantidadHabitaciones, OtrasHabitaciones, comodidades, idCliente) " +
			    "VALUES ('" + datos.getPadron() + "', '" + datos.getUbicacion() + "', '" +
			    datos.getValor() + "', '" + datos.getTipoInmueble() + "', '" + datos.getTamaño() + "', '" +
			    datos.getServicios() + "', '" + datos.getTipoVivienda() + "', '" + datos.getCantBaños() + "', '" +
			    datos.getCantHabitaciones() + "', '" + datos.getOtrasHabit() + "', '" + datos.getComodidades() + "', '" +
			    datos.getCi() + "')";

		

		try {
			
			conectar=DriverManager.getConnection(url,usuario,pass);	
			sentenciaSQL=conectar.createStatement();
			sentenciaSQL.executeUpdate(sentenciaIngresarNuevoInmueble);
			conectar.close();
			JOptionPane.showMessageDialog(null,"Se ingreso correctamente el Inmueble");
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}
		
	}




	

	public static void eliminarCliente(MisMetodos datos) {
	    String cedulaElim = datos.cedulaElim;
	    String eliminarClienteSQL = "DELETE FROM Cliente WHERE idCliente = '" + cedulaElim + "'";
	  
	    
	    try {
	        conectar = DriverManager.getConnection(url, usuario, pass);
	        sentenciaSQL = conectar.createStatement();
	        sentenciaSQL.executeUpdate(eliminarClienteSQL);
	        JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
	        conectar.close();
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "error al eliminar cliente");
	    }
	}

	
	public static void eliminarContratoAlquiler(int idContrato) {
	    String eliminarContratoSQL = "DELETE FROM contratoalquiler WHERE idContratoAlquiler = '" + idContrato + "'";
	    try {
	        conectar = DriverManager.getConnection(url, usuario, pass);
	        sentenciaSQL = conectar.createStatement();
	        sentenciaSQL.executeUpdate(eliminarContratoSQL);
	        JOptionPane.showMessageDialog(null, "Contrato de alquiler eliminado correctamente");
	    } catch (SQLException e) {
	    	JOptionPane.showMessageDialog(null, "error al eliminar contrato");
	    } 
	}

	
	

	public static void eliminarContratoCompraVenta(MisMetodos datos) {
	
	
	String sentencia="DELETE FROM `contratocompraventa` WHERE (`idContratoCompraVenta` = '"+ datos.ContratoCompraVentaElim +"')";
	
	
	try {
		
		conectar=DriverManager.getConnection(url,usuario,pass);	
		sentenciaSQL=conectar.createStatement();
		sentenciaSQL.executeUpdate(sentencia);
		//JOptionPane.showMessageDialog(null, "Se guardo el nuevo Contacto");
		conectar.close();
		
	} catch (SQLException e) {
		
		JOptionPane.showMessageDialog(null, "error al eliminar contrato");
		
	}

}
	
	public static void eliminarInmueble(MisMetodos datos) {
		
		String sentencia= "DELETE FROM inmueble WHERE (idInmueble = '"+ datos.InmuebleElim +"')";
		
		try {
			
			conectar=DriverManager.getConnection(url,usuario,pass);	
			sentenciaSQL=conectar.createStatement();
			sentenciaSQL.executeUpdate(sentencia);
			conectar.close();
			JOptionPane.showMessageDialog(null, "Inmueble eliminado correctamente");
		} catch (SQLException e) {
			
			JOptionPane.showMessageDialog(null, "no se puede eliminar el inmueble, verifque que no este asociado a ningun contrato.");
			
		}
		
	}
	
	public static void eliminarContrato(MisMetodos datos) {
		String sentencia="DELETE FROM contratos WHERE (idContrato =  '"+ datos.idContrato +"')";
		
		
	try {
			
			conectar=DriverManager.getConnection(url,usuario,pass);	
			sentenciaSQL=conectar.createStatement();
			sentenciaSQL.executeUpdate(sentencia);
			conectar.close();
			
		} catch (SQLException e) {

		
		}
	}
	
	
	
	
	
	
	
	public static JTable ConsultarCliente(JTable x,String nombre) {
		// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		
		// cantidad de columnas de la JTABLE	
        String[] columnas = {"idCliente", "nombre", "apellido", "fechaNacimiento", "email", "telefono"};
		// filas en las columnas
		Object filas[]= new Object[6];
		
		modeloMiTabla= new DefaultTableModel(null, columnas);
			
		 String sentencia = "SELECT * FROM Cliente;";
		
		try {
		
			conectar= DriverManager.getConnection(url,usuario,pass);
	
			sentenciaSQL = conectar.createStatement();
	
    		resultado = sentenciaSQL.executeQuery(sentencia);

    		while (resultado.next()) {
    			
    			for ( int i=0;i<filas.length;i++){
    				
    				filas[i] = resultado.getObject(i+1); 

    			} 
    			
    			modeloMiTabla.addRow(filas);
     		}
			
    		// Cierra la Base de Datos
			conectar.close();
			
			x.setModel(modeloMiTabla);
			
		} catch (SQLException e) {
		
			System.out.println(e.getMessage());
		}
		return x;
	}
	
	public static JTable ConsultarInmuebles(JTable x,String nombre) {
		// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		
		// cantidad de columnas de la JTABLE	
        String[] columnas = {"idInmueble", "Ubicacion", "Valor", "Tipo", "Tamanio", "servicios", "tipoVivienda", "cantidadBaños","cantidadHabitaciones","OtrasHabitaciones","Comodiades","Duenio"};
		// filas en las columnas
		Object filas[]= new Object[12];
		
		modeloMiTabla= new DefaultTableModel(null, columnas);
			
		 String sentencia = "SELECT * FROM inmueble;";
		
		try {
		
			conectar= DriverManager.getConnection(url,usuario,pass);
	
			sentenciaSQL = conectar.createStatement();
	
    		resultado = sentenciaSQL.executeQuery(sentencia);

    		while (resultado.next()) {
    			
    			for ( int i=0;i<filas.length;i++){
    				
    				filas[i] = resultado.getObject(i+1); 

    			} 
    			
    			modeloMiTabla.addRow(filas);
     		}
			
    		// Cierra la Base de Datos
			conectar.close();
			
			x.setModel(modeloMiTabla);
			
		} catch (SQLException e) {
		
			System.out.println(e.getMessage());
		}
		return x;
	}
	
	public static JTable ConsultarContratosCompraVenta(JTable x,String nombre) {
		// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		
		// cantidad de columnas de la JTABLE	
        String[] columnas = {"idContratoCompraVenta", "TipoContrato", "ClienteCompra", "ClienteVenta","Inmueble","FechaCompraVenta","DescripcionContrato"};
		// filas en las columnas
		Object filas[]= new Object[7];
		
		
		modeloMiTabla= new DefaultTableModel(null, columnas);
			
		 String sentencia = "SELECT * FROM contratocompraventa;";
		
		try {
		
			conectar= DriverManager.getConnection(url,usuario,pass);
	
			sentenciaSQL = conectar.createStatement();
	
    		resultado = sentenciaSQL.executeQuery(sentencia);

    		while (resultado.next()) {
    			
    			for ( int i=0;i<filas.length;i++){
    				
    				filas[i] = resultado.getObject(i+1); 

    			} 
    			
    			modeloMiTabla.addRow(filas);
     		}
			
    		// Cierra la Base de Datos
			conectar.close();
			
			x.setModel(modeloMiTabla);
			
		} catch (SQLException e) {
		
			System.out.println(e.getMessage());
		}
		return x;
	}
	
	public static JTable ConsultarContratosAlquiler(JTable x,String nombre) {
		// Declaro el modelo de la tabla
		DefaultTableModel modeloMiTabla;
		
		// cantidad de columnas de la JTABLE	
        String[] columnas = {"idContratoAlquiler", "tipoContrato", "ClienteAlquila", "ClienteArrendador","Inmueble","FechaInicioAlquiler","FechaFinalAlquiler","DuracionContrato","PrecioAlquiler","TipoGarantia","DescripcionContrato"};
		// filas en las columnas
		Object filas[]= new Object[11];
		
		
		modeloMiTabla= new DefaultTableModel(null, columnas);
			
		 String sentencia = "SELECT * FROM contratoalquiler;";
		
		try {
		
			conectar= DriverManager.getConnection(url,usuario,pass);
	
			sentenciaSQL = conectar.createStatement();
	
    		resultado = sentenciaSQL.executeQuery(sentencia);

    		while (resultado.next()) {
    			
    			for ( int i=0;i<filas.length;i++){
    				
    				filas[i] = resultado.getObject(i+1); 

    			} 
    			
    			modeloMiTabla.addRow(filas);
     		}
			
    		// Cierra la Base de Datos
			conectar.close();
			
			x.setModel(modeloMiTabla);
			
		} catch (SQLException e) {
		
			System.out.println(e.getMessage());
		}
		return x;
	}
	
	
	
	public void actualizarBaseDeDatos(int row, String columnName, Object data,Object idTabla,String columnaID ,String nomTabla) {
		
	
		String sentencia = "UPDATE " + nomTabla + " SET " + columnName + " = '" + data + "' WHERE " + columnaID + " = '" + idTabla + "'";


		 try {
		        conectar = DriverManager.getConnection(url, usuario, pass);
		        sentenciaSQL = conectar.createStatement();
		        sentenciaSQL.executeUpdate(sentencia);
		     

		    } catch (SQLException e) {
		        

		    	System.out.println(e.getMessage());
		    }
		}
	
	
	public boolean VerificarExisteContrato(String idCliente) {
		String verificarContratosSQL = "SELECT idContrato FROM contratos WHERE ClienteCompra = '" + idCliente + "' OR ClienteVenta = '" + idCliente + "'";
	    
		try {
	        conectar = DriverManager.getConnection(url, usuario, pass);
	        sentenciaSQL = conectar.createStatement();
	        ResultSet resultado = sentenciaSQL.executeQuery(verificarContratosSQL);

	       
	        boolean existeContrato = resultado.next();

	      
	        resultado.close();
	        sentenciaSQL.close();
	        conectar.close();

	        return existeContrato;
	    } catch (SQLException e) {
	        
	        return false;
	    }
	}

	
	
	
	
	
	public void actualizarContrato(Object atributoNuevo, Object idFilaSeleccionada ) {
		
		  String sentencia = "UPDATE `contratos` SET `idContrato` = " + atributoNuevo + " WHERE `idContrato` = " + idFilaSeleccionada;
		
	try {
			
			conectar=DriverManager.getConnection(url,usuario,pass);	
			sentenciaSQL=conectar.createStatement();
			sentenciaSQL.executeUpdate(sentencia);
			conectar.close();
			JOptionPane.showMessageDialog(null,"se cambio contrato");
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			
		}
	}
	
	
	
	public boolean verificarInmueblePerteneceCliente(MisMetodos datos) {
	    String idInmueble = datos.getPadron();  
	    String idCliente = datos.getClienteVende();  
	    String sentencia = "SELECT * FROM inmueble WHERE idInmueble = '" + idInmueble + "' AND idCliente = '" + idCliente + "'";

	    try {
	        Connection conectar = DriverManager.getConnection(url, usuario, pass);
	        Statement sentenciaSQL = conectar.createStatement();
	        ResultSet resultado = sentenciaSQL.executeQuery(sentencia);

	        if (resultado.next()) {
	            // Existe una fila que cumple con las condiciones
	            conectar.close();
	           
	            return true;
	        } else {
	            // No hay ninguna fila que cumpla con las condiciones
	            conectar.close();
	           
	            return false;
	        }

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        return false;
	    }
	}
	
	


public boolean verificarInmuebleContrato(String inmueble){
	
	String sentencia = "SELECT * FROM contratos WHERE Inmueble = '" + inmueble + "'";

	  
	try {
	        Connection conectar = DriverManager.getConnection(url, usuario, pass);
	        Statement sentenciaSQL = conectar.createStatement();
	        ResultSet resultado = sentenciaSQL.executeQuery(sentencia);

	     return resultado.next();

	    } catch (SQLException e) {
	        System.out.println(e.getMessage());
	        return false;
	    }

	}




public boolean VerificarExisteTelefono(String telefono) {
	
	String sentencia = "SELECT * FROM Cliente WHERE telefono = '" + telefono + "'";
	
	try {
        conectar = DriverManager.getConnection(url, usuario, pass);
        sentenciaSQL = conectar.createStatement();
        ResultSet resultado = sentenciaSQL.executeQuery(sentencia);

       
        boolean existeTelefono = resultado.next();

      
        resultado.close();
        sentenciaSQL.close();
        conectar.close();

        return existeTelefono;
    } catch (SQLException e) {
        
        return false;
    }
}



public boolean VerificarExisteEmail(String Email) {
	
	String sentencia = "SELECT * FROM Cliente WHERE email = '" + Email + "'";
	System.out.println(sentencia);
	try {
        conectar = DriverManager.getConnection(url, usuario, pass);
        sentenciaSQL = conectar.createStatement();
        ResultSet resultado = sentenciaSQL.executeQuery(sentencia);

       
        boolean existeEmail = resultado.next();

        System.out.println(existeEmail);
      
        resultado.close();
        sentenciaSQL.close();
        conectar.close();

        return existeEmail;
    } catch (SQLException e) {
        
        return false;
    }
}



}
	