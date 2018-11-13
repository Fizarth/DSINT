package ontologia;

public abstract class Personaje {
	
	private EstadoCivil estadoCivil;
	private EstadoSalud estadoSalud;
	private String nombre;
	private Origen origen;
	private boolean perteneceCuento;
	private Sexo sexo;
	private TipoImportancia tipoImportancia;
	private Lugar ubicacionActual;
	
	public Personaje(EstadoCivil estadoCivil, EstadoSalud salud, String nombre, Origen origen, boolean cuento,
			Sexo sexo, TipoImportancia importancia, Lugar ubicacion) {
		this.estadoCivil = estadoCivil;
		this.estadoSalud = salud;
		this.nombre = nombre;
		this.origen = origen;
		this.perteneceCuento = cuento;
		this.sexo = sexo;
		this.tipoImportancia = importancia;
		this.ubicacionActual = ubicacion; 
		
	}
	
	
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public EstadoSalud getEstadoSalud() {
		return estadoSalud;
	}
	public void setEstadoSalud(EstadoSalud estadoSalud) {
		this.estadoSalud = estadoSalud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Origen getOrigen() {
		return origen;
	}
	public void setOrigen(Origen origen) {
		this.origen = origen;
	}
	public boolean isPerteneceCuento() {
		return perteneceCuento;
	}
	public void setPerteneceCuento(boolean perteneceCuento) {
		this.perteneceCuento = perteneceCuento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public TipoImportancia getTipoImportancia() {
		return tipoImportancia;
	}
	public void setTipoImportancia(TipoImportancia tipoImportancia) {
		this.tipoImportancia = tipoImportancia;
	}
	public Lugar getUbicacionActual() {
		return ubicacionActual;
	}
	public void setUbicacionActual(Lugar ubicacionActual) {
		this.ubicacionActual = ubicacionActual;
	}
	
	
	
	
}
