package hu.unideb.back.repository;

import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sun.awt.FontDescriptor;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends CrudRepository<Food, Long> {
    List<Food> findAll();
    Optional<Food>findById(long id);
    //Food insertFood(Food food);
    //Food getFoodById(Integer id);
}
