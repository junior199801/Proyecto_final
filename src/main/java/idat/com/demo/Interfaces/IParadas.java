package idat.com.demo.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import idat.com.demo.Modelo.Paradas;
@Repository
public interface IParadas extends CrudRepository<Paradas, Integer>{

}
