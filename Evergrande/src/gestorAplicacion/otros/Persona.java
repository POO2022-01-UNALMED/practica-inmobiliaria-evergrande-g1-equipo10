package gestorAplicacion.otros;

import java.util.ArrayList;

import gestorAplicacion.herencia.Inmueble;

public abstract class Persona {
    protected int cedula;
    protected String nombreCompleto;
    protected int telefonofijo;
    protected int telefonocelular;

    public Persona(){
        this.cedula = 1;
        this.nombreCompleto = "Pepito perez";
        this.telefonofijo = 1;
        this.telefonocelular = 1;
    }

    public Persona(int cedula, String nombreCompleto, int telefonofijo, int telefonocelular){
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.telefonofijo = telefonofijo;
        this.telefonocelular = telefonocelular;
    }


    public abstract ArrayList<Inmueble> listarInmuebles();


    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public int getTelefonofijo() {
        return telefonofijo;
    }
    public void setTelefonofijo(int telefonofijo) {
        this.telefonofijo = telefonofijo;
    }
    public int getTelefonocelular() {
        return telefonocelular;
    }
    public void setTelefonocelular(int telefonocelular) {
        this.telefonocelular = telefonocelular;
    }
}
