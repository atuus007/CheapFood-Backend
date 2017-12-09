package hu.unideb.back.repository;

import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;

public interface IngredientsRepository extends CrudRepository<Ingredients, Long>{
    List<Ingredients> findAll();

    @Query("SELECT i.name FROM Ingredients i where i.id = :id")
    List<Ingredients> findIngredientsById(@Param("id") Long id);

    Optional<Ingredients> findById(long id);

    @Query("SELECT i.id FROM Ingredients i WHERE i.name LIKE CONCAT('%',:name1,'%')")
    Integer findIngredientsByName(@Param("name1") String name1);
}