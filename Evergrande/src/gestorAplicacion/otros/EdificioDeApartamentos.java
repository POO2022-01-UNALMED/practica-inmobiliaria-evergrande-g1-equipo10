package gestorAplicacion.otros;
import java.io.Serializable;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Representa un tipo de unidad residencial (los edificios de apartamentos) y sus caracteristicas que son presentadas a traves de un 
 * informe que puede ser de interes para el cliente 
 */

public class EdificioDeApartamentos extends UnidadResidencial{
	private static final long serialVersionUID = 1L;
	private int numero_pisos;
	
	public EdificioDeApartamentos(int idUnidadResidencial, String nombre, String barrio, int numero_pisos) {
		super(idUnidadResidencial, nombre, barrio);
		this.numero_pisos = numero_pisos;
	}
	
	public String presentarInforme() {
		return  " Nombre del edificio: " + this.getNombre() + "\n" + 
				" Identificado con el id: " + this.getIdUnidadResidencial() + "\n" + 
				" Ubicado en el barrio: " + this.getBarrio() + " en la ciudad de Medellin, cuyo alcalde es "+ ALCALDE + " y actualmente presenta un IVA del "+ IVA + "\n" +
				" Con " + this.getNumero_pisos() + " pisos de altura";
	}
	
    public int getNumero_pisos() {
        return this.numero_pisos;
    }

    public void setNumero_pisos(int numero_pisos) {
        this.numero_pisos = numero_pisos;
    }
}
