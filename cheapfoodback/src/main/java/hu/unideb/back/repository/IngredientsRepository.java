package hu.unideb.back.repository;

import hu.unideb.back.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface IngredientsRepository extends CrudRepository<Ingredients, Long>{
    List<Ingredients> getAll();
}
