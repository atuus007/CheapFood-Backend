package hu.unideb.back.repository;

import hu.unideb.back.model.Ingredients;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QueryRepository extends CrudRepository<Ingredients, Long>{

    @Query("SELECT hv.name, hv.mennyiseg, my.name FROM Ingredients hv, Quantity my where 1=1 and hv.mennyiseg = my.id and hv.id = :id")
    String findIngredientsByIdAndmennyisegnev(@Param("id") Long id);
    
}