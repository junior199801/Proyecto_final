package idat.com.demo.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="horarios")
public class Horarios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	@ManyToOne
	@JoinColumn (name = "id_bus")
	private Buses id_bus;
	@Column (name="dias", length = 30)
	private String dias;
	@Column (name="hora", length = 30)
	private String hora;
	
	
	public Horarios() {
		super();
	}
	public Horarios(int id, Buses id_bus, String dias, String hora) {
		super();
		this.id = id;
		this.id_bus = id_bus;
		this.dias = dias;
		this.hora = hora;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Buses getId_bus() {
		return id_bus;
	}
	public void setId_bus(Buses id_bus) {
		this.id_bus = id_bus;
	}
	public String getDias() {
		return dias;
	}
	public void setDias(String dias) {
		this.dias = dias;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	

}
