package idat.com.demo.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import idat.com.demo.Modelo.Horarios;
@Repository
public interface IHorarios extends CrudRepository<Horarios, Integer> {

}
