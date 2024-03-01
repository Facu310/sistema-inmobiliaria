package proyect;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class validaciones {

	
    public static boolean validarNombreUsuario(String nombreUsuario) {
        
        return nombreUsuario.matches("^[a-zA-Z]+$");
    }

    public static boolean validarContraseña(String contraseña) {
        
        return contraseña.matches("^[0-9]+$");
    
    }
    
    public static boolean validarCedula(String cedula) {
      
      
        return cedula.matches("^[0-9]+$");
    }
    
    public static boolean validarEmail(String email) {
    
        return email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
    
    }
    
    public static boolean validarTelefonoCelularUruguay(String telefono) {

     
        return telefono.matches("^09[0-9]{7}$");
    }

    public static boolean validarPadron(String padron) {
      
        return padron.matches("\\d{6,10}");
    }

    
    public boolean validarFecha(String fecha) {
        // Define el formato de la fecha que esperas
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); 

        try {
            // Intenta parsear la fecha
            java.util.Date utilDate = sdf.parse(fecha);
            // Convierte java.util.Date a java.sql.Date
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            // Si no lanza excepción, la fecha es válida
            return true;
        } catch (ParseException e) {
            
            return false;
        }
    }
    
    public static boolean validarDuracionContrato(String contrato){
    	
    	return contrato.matches("^[1-9]\\d*$");
    }
    public static boolean validarnumero(String numero)
    {
    	
    	
    return numero.matches("^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?$")	;
    }

    public static boolean validarUbicacion(String ubicacion) {
        
        
        return ubicacion.matches("^[a-zA-Z0-9\\s.,#-]+$");
    }
   
    public static boolean validarTipoInmueble(String tipoInmueble) {
        
        return tipoInmueble.matches("^(terreno|habitable)$");
    }
    
    public static boolean validarServicios(String servicios) {
        return servicios.matches("^(OSE|UTE)(,OSE|,UTE)*$");
    }

    
    
    public static boolean validarTipoVivienda(String tipoVivienda) {
     
        return tipoVivienda.matches("^(apartamento|casa|mejoras)$");
    }
    
 
    public static boolean validarnum(String numero)
    {
    	
    	
    return numero.matches("\\d+")	;
    }

    
    
}



