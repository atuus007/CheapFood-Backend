package hu.unideb.back.repository;

import hu.unideb.back.model.Quantity;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface QuantityRepository extends CrudRepository<Quantity, Long>{
    List<Quantity> findAll();
    Optional<Quantity> findById(long id);

}