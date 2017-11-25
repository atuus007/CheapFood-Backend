package hu.unideb.back.repository;

import hu.unideb.back.model.Quantity;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface QuantityRepository extends CrudRepository<Quantity, Long>{
    List<Quantity> findAll();
}