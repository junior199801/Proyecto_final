package idat.com.demo.Modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="buses")
public class Buses  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	@Column (name="linea", length = 30)
	private String linea;
	@Column (name="origen", length = 30)
	private String origen;
	

	public Buses() {
		super();
	}

	public Buses(int id, String linea, String origen) {
		super();
		this.id = id;
		this.linea = linea;
		this.origen = origen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	

}
