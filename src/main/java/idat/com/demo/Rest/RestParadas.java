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

import idat.com.demo.Interfaces.IParadas;
import idat.com.demo.Modelo.Paradas;

@RestController

@RequestMapping("/paradas")
public class RestParadas {
	@Autowired
	private IParadas data;
	
	@GetMapping
	public List<Paradas> listar(){
		return (List<Paradas>)data.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody Paradas par) {
		data.save(par);
	}
	
	@PutMapping
	public void modificar(@RequestBody Paradas par) {
		data.save(par);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable ("id") Integer id) {
		data.deleteById(id);
	}


}
