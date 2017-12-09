package hu.unideb.back.repository;

import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import sun.awt.FontDescriptor;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends CrudRepository<Food, Long> {
    List<Food> findAll();
    Optional<Food>findById(long id);
    //Food insertFood(Food food);
    //Food getFoodById(Integer id);

    @Query("SELECT et.id FROM Food et WHERE et.name LIKE CONCAT('%',:name1,'%')")
    Integer findIngredientsByName(@Param("name1") String name1);
}
