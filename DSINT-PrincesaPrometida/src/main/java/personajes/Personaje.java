package personajes;

import java.util.*;

import lugares.*;
import utilidades.*;
import relaciones.*;

public abstract class Personaje {

	private EstadoCivil estadoCivil;
	private EstadoSalud estadoSalud;
	private String nombre;
	private Origen origen;
	private boolean perteneceCuento;
	private Sexo sexo;
	private TipoImportancia tipoImportancia;
	private Lugar ubicacionActual;

	private ArrayList<Relacion> relacionesPersonaje;

	public Personaje(String nombre, Origen origen, Sexo sexo, EstadoCivil estadoCivil, EstadoSalud salud,
			boolean cuento, TipoImportancia importancia, Lugar ubicacionAct) {
		this.estadoCivil = estadoCivil;
		this.estadoSalud = salud;
		this.nombre = nombre;
		this.origen = origen;
		this.perteneceCuento = cuento;
		this.sexo = sexo;
		this.tipoImportancia = importancia;
		this.ubicacionActual = ubicacionAct;
		this.relacionesPersonaje = new ArrayList<Relacion>();

	}

	public ArrayList<Relacion> getRelacionesPersonaje() {
		return relacionesPersonaje;
	}

	public void setRelacionesPersonaje(ArrayList<Relacion> relacionesPersonje) {
		this.relacionesPersonaje = relacionesPersonje;
	}

	public void addRelacion(Relacion rel) {
		this.relacionesPersonaje.add(rel);
	}

	public void deleteRelacion(Relacion rel) {
		this.relacionesPersonaje.remove(rel);
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

	@Override
	public String toString() {
		String cadena =  estadoSalud + " y " + estadoCivil + " es de "+ origen + " es un "
				+ sexo + "." +nombre + " es un personaje " + tipoImportancia 
				+ " actualmente se encuentra en " + ubicacionActual + "." + nombre 
				+ relacionesPersonaje;
		if (perteneceCuento)
			cadena = nombre + " pertenece al cuento y esta " + cadena;
		else 
			cadena = nombre + " no pertenece al cuento y esta " + cadena;
		return cadena;
				
	
	}

	
}
