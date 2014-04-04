
/**
 * Write a description of class NameGenerator here.
 * 
 * @author diego
 * @version 0.01
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
    }

    /**
     * Metodo para devolver tu nombre de como seria en la guerra de las galaxias segun George Lucas
     * 
     * @param  
     * @return  el nombre que tendrias en la peliculas.
     */
    public String generateStarWarsName(String apellido,String nombre,String apellidoMadre,String ciudadNacimiento)
    {
        String nombrePelicula = apellido.substring(0, 1). toUpperCase();
        nombrePelicula +=apellido.substring(1, 3)+nombre.substring(0, 3)+apellidoMadre.substring(0, 2)+ciudadNacimiento.substring(0, 3);
        return nombrePelicula;
    }
}
