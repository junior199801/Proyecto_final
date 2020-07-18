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

import idat.com.demo.Interfaces.IHorarios;
import idat.com.demo.Modelo.Horarios;

@RestController

@RequestMapping("/horarios")
public class RestHorarios {
	@Autowired
	private IHorarios data;
	
	@GetMapping
	public List<Horarios> listar(){
		return (List<Horarios>)data.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody Horarios hor) {
		data.save(hor);
	}
	
	@PutMapping
	public void modificar(@RequestBody Horarios hor) {
		data.save(hor);
	}
	
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable ("id") Integer id) {
		data.deleteById(id);
	}

}
