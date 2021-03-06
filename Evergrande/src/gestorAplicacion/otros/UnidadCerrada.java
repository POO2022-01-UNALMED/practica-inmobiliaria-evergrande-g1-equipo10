package gestorAplicacion.otros;
import java.io.Serializable;

/**
 * @Autores:
 * David Escobar Ruiz
 * Juli?n Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Representa un tipo de unidad residencial (las unidade cerradas) y sus caracteristicas que son presentadas a traves de un 
 * informe que puede ser de interes para el cliente 
 *
 */

public class UnidadCerrada extends UnidadResidencial{
	private static final long serialVersionUID = 1L;
	private int numero_torres;
	
	public UnidadCerrada(int idUnidadResidencial, String nombre, String barrio, int numero_torres) {
		super(idUnidadResidencial, nombre, barrio);
		this.numero_torres = numero_torres;
	}
	
	public String presentarInforme() {
		return  "UNIDAD CERRADA\n" + " Nombre de la Unidad: " + this.getNombre() + "\n" + 
				" Identificada con el id: " + this.getIdUnidadResidencial() + "\n" + 
				" Ubicada en el barrio " + this.getBarrio() + " en la ciudad de Medellin, cuyo alcalde es "+ ALCALDE + " y actualmente presenta un IVA del "+ IVA + "\n" +
				" Con " + this.getNumero_torres() + " torres" + "\n";
	}
	
    public int getNumero_torres() {
        return this.numero_torres;
    }

    public void setNumero_torres(int numero_torres) {
        this.numero_torres = numero_torres;
    }

}
