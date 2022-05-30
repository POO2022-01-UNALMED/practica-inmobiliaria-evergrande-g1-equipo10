package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase representa las unidades residenciales asociadas a cada inmueble
 *
 */

public abstract class UnidadResidencial implements Ciudad, Serializable{
	private static final long serialVersionUID = 1L;
	private int idUnidadResidencial;
	private String nombre;
	private String barrio;
	private static ArrayList<UnidadResidencial> unidades = new ArrayList<UnidadResidencial>();
	
    public UnidadResidencial(int idUnidadResidencial, String nombre, String barrio) {
        this.idUnidadResidencial = idUnidadResidencial;
        this.nombre = nombre;
        this.barrio = barrio;
    }
    
    public int getIdUnidadResidencial() {
        return this.idUnidadResidencial;
    }

    public void setIdUnidadResidencial(int idUnidadResidencial) {
        this.idUnidadResidencial = idUnidadResidencial;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return this.barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    public static ArrayList<UnidadResidencial> getUnidades() {
        return UnidadResidencial.unidades;
    }

    public static void setUnidades(ArrayList<UnidadResidencial> unidades) {
        UnidadResidencial.unidades = unidades;
    }

}
