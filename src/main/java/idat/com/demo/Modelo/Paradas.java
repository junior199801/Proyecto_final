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
@Table(name = "paradas")
public class Paradas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name ="id_bus")
	private Buses id_bus;
	@Column(name = "latitude")
	private double latitude;
	@Column(name = "longitude")
	private double longitude;
	
	
	
	public Paradas() {
		super();
	}
	public Paradas(int id, Buses id_bus, double latitude, double longitude) {
		super();
		this.id = id;
		this.id_bus = id_bus;
		this.latitude = latitude;
		this.longitude = longitude;
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
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	

}
