package hu.unideb.back.repository;

import hu.unideb.back.model.Food;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Long>{
    List<Food> findAll();
    Food insertFood(Food food);
    Food getFoodById(Integer id);
}
