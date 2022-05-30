package gestorAplicacion.otros;

import java.util.ArrayList;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase representa a las personas en general que se relacionan con la inmobiliaria, ya sea en forma de agente o de cliente
 * 
 */

public abstract class Persona {
    protected int cedula;
    protected String nombreCompleto;
    protected int telefonoFijo;
    protected int telefonoCelular;

    public Persona(){
        this.cedula = 1;
        this.nombreCompleto = "Pepito perez";
        this.telefonoFijo = 1;
        this.telefonoCelular = 1;
    }

    public Persona(int cedula, String nombreCompleto, int telefonoFijo, int telefonoCelular){
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
    }


    public abstract ArrayList<Integer> listarInmuebles();


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
    public int gettelefonoFijo() {
        return telefonoFijo;
    }
    public void settelefonoFijo(int telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }
    public int gettelefonoCelular() {
        return telefonoCelular;
    }
    public void settelefonoCelular(int telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }
}
