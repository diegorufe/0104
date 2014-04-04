
/**
 * Write a description of class NameGenerator here.
 * 
 * @author diego
 * @version 0.01
 */
public class NameGenerator
{
    private static final int  SUB_0 = 0;
    private static final int   SUB_1 = 1;
    private static final int  SUB_2 = 2;
    private static final int SUB_3 = 3;
    
    
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
        String nombrePelicula = apellido.substring(SUB_0, SUB_1). toUpperCase();
        nombrePelicula +=apellido.substring(SUB_1, SUB_3)+nombre.substring(SUB_0, SUB_3)+apellidoMadre.substring(SUB_0,  SUB_2)+ciudadNacimiento.substring(SUB_0, SUB_3);
        return nombrePelicula;
    }
}
