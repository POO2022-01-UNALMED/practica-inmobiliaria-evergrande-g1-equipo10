package gestorAplicacion.otros;

public abstract class UnidadResidencial implements Ciudad{
	private int idUnidadResidencial;
	private String nombre;
	private String barrio;
	
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

}
