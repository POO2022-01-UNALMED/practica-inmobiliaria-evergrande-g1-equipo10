package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;

public class Pago implements Serializable{
    private int idPago;
    private double valor;
    private int ano;
    private int mes;
    private int idInmueble;

    private static ArrayList<Pago> pagos = new ArrayList<Pago>();

    public Pago(){
        this.idPago = generateId();
        pagos.add(this);
    }

    public Pago(double valor, int ano, int mes, int idInmueble){
        this.valor = valor;
        this.ano = ano;
        this.mes = mes;
        this.idInmueble = idInmueble;

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

    // metodo para filtrar los pagos por idInmueble
    public static ArrayList<Pago> verPagos(int idInmueble){
        ArrayList<Pago> pagosFiltro = new ArrayList<Pago>();

        for (Pago pago : pagos) {
            if (pago.idInmueble == idInmueble) {
                pagosFiltro.add(pago);
            }
        }

        return pagosFiltro;
    }

    public static void setPagos(ArrayList<Pago> pagos){
        Pago.pagos = pagos;
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
    public int getidInmueble() {
        return idInmueble;
    }
    public void setidInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }
}