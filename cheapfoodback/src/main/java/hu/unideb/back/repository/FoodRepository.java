package hu.unideb.back.repository;

import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Long> {
    List<Food> findAll();
    Food insertFood(Food food);
    Food getFoodById(Integer id);
}
