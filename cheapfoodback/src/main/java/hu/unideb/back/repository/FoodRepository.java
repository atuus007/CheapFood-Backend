package hu.unideb.back.repository;

import hu.unideb.back.controller.food.converter.FoodResponse;
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

    @Query("SELECT id, name, mennyiseg, mennyisegfajta, osszar, elkeszitesi_ido FROM Food et WHERE osszar BETWEEN :money1 and :money2")
    List<Food> findAllBeetween(@Param("money1") Integer money1, @Param("money2") Integer money2); //not working somewhy

    List<Food> findAllByOsszarBetween(@Param("money1") Integer money1, @Param("money2") Integer money2);

    @Query("SELECT id FROM Food et WHERE upper(name) LIKE upper(CONCAT('%',:name1,'%'))")
    Integer findFoodidByName(@Param("name1") String name1);

    @Query("SELECT name FROM Food et WHERE upper(name) LIKE upper(CONCAT('%',:name1,'%'))")
    String findFoodexactnameByName(@Param("name1") String name1);

    @Query("SELECT mennyisegfajta FROM Food et WHERE upper(name) LIKE upper(CONCAT('%',:name1,'%'))")
    Integer findFoodmennyisegfajtaByName(@Param("name1") String name1);

    @Query("SELECT mennyiseg FROM Food et WHERE upper(name) LIKE upper(CONCAT('%',:name1,'%'))")
    Integer findmennyisegFoodByName(@Param("name1") String name1);

    @Query("SELECT elkeszitesi_ido FROM Food et WHERE upper(name) LIKE upper(CONCAT('%',:name1,'%'))")
    Integer findFoodelkeszitesiidoByName(@Param("name1") String name1);

    @Query("SELECT osszar FROM Food et WHERE upper(name) LIKE upper(CONCAT('%',:name1,'%'))")
    Integer findFoodosszarByName(@Param("name1") String name1);


}
