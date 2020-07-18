package idat.com.demo.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import idat.com.demo.Modelo.Buses;

@Repository
public interface IBuses extends CrudRepository<Buses, Integer> {
	

}
