package gestorAplicacion.otros;

import java.util.ArrayList;
import gestorAplicacion.herencia.Inmueble;

public class Pago{
    private int idPago;
    private double valor;
    private int ano;
    private int mes;
    private Inmueble inmueble;
    private Cliente cliente;

    private static ArrayList<Pago> pagos = new ArrayList<Pago>();

    public Pago(){
        this.idPago = generateId();
        pagos.add(this);
    }

    public Pago(double valor, int ano, int mes, Inmueble inmueble, Cliente cliente){
        this.valor = valor;
        this.ano = ano;
        this.mes = mes;
        this.inmueble = inmueble;
        this.cliente = cliente;

        this.idPago = generateId();
        pagos.add(this);
    }

    private static int generateId(){
        return pagos.size() + 1;
    }

    // metodo para ver todos los pagos
    public static ArrayList<Pago> verPagos(){
        return pagos;
    }

    // metodo para filtrar los pagos por cliente
    public static ArrayList<Pago> verPagos(Cliente cliente){
        ArrayList<Pago> pagosFiltro = new ArrayList<Pago>();

        for (Pago pago : pagos) {
            if (pago.cliente.equals(cliente)) {
                pagosFiltro.add(pago);
            }
        }

        return pagosFiltro;
    }

    // metodo para filtrar los pagos por inmueble
    public static ArrayList<Pago> verPagos(Inmueble inmueble){
        ArrayList<Pago> pagosFiltro = new ArrayList<Pago>();

        for (Pago pago : pagos) {
            if (pago.inmueble.equals(inmueble)) {
                pagosFiltro.add(pago);
            }
        }

        return pagosFiltro;
    }

    //  setters y getters
    
    public int getIdPago() {
        return idPago;
    }
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }
    public double getvalor() {
        return valor;
    }
    public void setvalor(double valor) {
        this.valor = valor;
    }
    public int getAno() {
        return ano;
    }
    public int getMes() {
        return mes;
    }
    public void setFecha(int ano, int mes) {
        this.ano = ano;
        this.mes = mes;
    }
    public Inmueble getInmueble() {
        return inmueble;
    }
    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}