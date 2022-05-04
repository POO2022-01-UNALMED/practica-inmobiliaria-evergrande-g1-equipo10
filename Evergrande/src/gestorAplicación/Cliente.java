import java.util.ArrayList;

public class Cliente{
    private int cedula;
    private String nombreCompleto;
    private int telefonofijo;
    private int telefonocelular;
    private ArrayList<Inmueble> InmueblesComp = new ArrayList<Inmueble>();
    private ArrayList<Inmueble> InmueblesArri = new ArrayList<Inmueble>();

    public void comprarInmueble(Inmueble inmueble){
        this.InmueblesComp.add(inmueble);   
    }

    public ArrayList<Inmueble> listarInmuebles(String tipo){
        if (tipo.equalsIgnoreCase("comprados")) {
            return this.InmueblesComp;
        } else {
            return this.InmueblesArri;
        }
    }

    public Cita pedirCita(int ano, int mes, int dia, String hora){
       // crear una cita con el constructor cuando lo hagan
    }

    public void cancelarCita(Cita cita){
        // borrar la cita usando el metodo que creen
    }

    public void iniciarContrato(Inmueble inmueble){
        this.InmueblesArri.add(inmueble);
    }

    public boolean finalizarContrato(Inmueble inmueble){
        return this.InmueblesArri.remove(inmueble);
    }

    public Pago realizarPago(double valor, int ano, int mes, Inmueble inmueble){
        return new Pago(valor, ano, mes, inmueble, this);
    }

    // setteres y getters

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