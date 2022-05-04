package gestorAplicación;
public class Inmueble {
	private static int totalInmuebles;
	private int idInmueble;
	private double precio;
	private String direccion;
	private double area;
	private int numPisos;
	private boolean parqueaderoCarros;
	private boolean parqueaderoMotos;
	private boolean amueblado;
	private boolean vendido;
	private TipoContrato tipoContrato;
	
	public Inmueble(double precio, String direccion, double area)
	{
		this.precio = precio;
		this.direccion = direccion;
		this.area = area;
		Inmueble.totalInmuebles++;
		this.idInmueble = Inmueble.totalInmuebles;
 	}
	
	public int getIdInmueble() {
		return this.idInmueble;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public int getNumPisos() {
		return this.numPisos;
	}
	
	public boolean getParqueaderoCarros() {
		return this.parqueaderoCarros;
	}
	
	public boolean getParqueaderoMotos() {
		return this.parqueaderoMotos;
	}
	
	public boolean getAmueblado() {
		return this.amueblado;
	}
	
	public boolean getVendido() {
		return this.vendido;
	}
	
	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setDirrecion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}
	
	public void setParqueaderoCarros(boolean isParqueaderoCarros) {
		this.parqueaderoCarros = isParqueaderoCarros;
	}
	
	public void setParqueaderoMotos(boolean isParqueaderoMotos) {
		this.parqueaderoMotos = isParqueaderoMotos;
	}
	
	public void setAmueblado(boolean isAmueblado) {
		this.amueblado = isAmueblado;
	}
	
	public void setVendido(boolean isVendido) {
		this.vendido = isVendido;
	}
	
}
