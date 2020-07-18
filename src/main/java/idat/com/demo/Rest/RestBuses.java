package idat.com.demo.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.com.demo.Interfaces.IBuses;
import idat.com.demo.Modelo.Buses;

@RestController

@RequestMapping("/buses")
public class RestBuses {
	@Autowired
	private IBuses data;
	
	@GetMapping
	public List<Buses> listar(){
		return (List<Buses>)data.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody Buses bus) {
		data.save(bus);
	}
	
	@PutMapping
	public void modificar(@RequestBody Buses bus) {
		data.save(bus);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable ("id") Integer id) {
		data.deleteById(id);
	}

}
