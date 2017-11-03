package hu.unideb.back.service;

import hu.unideb.back.model.Food;
import hu.unideb.back.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service("foodService")
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepository foodRepository;
   // @Autowired
   // public void setFoodRepository(FoodRepository foodRepository) {
    //    this.foodRepository = foodRepository;
    //}

    @Override
    public List<Food> findAll(){
        System.out.println("findAll Service");
        return foodRepository.findAll();
    }
/*
    @Override
    public Food insertFood(Food food) {
        System.out.println("AAAAAAAAAAAAAAAAAAAA");
        return foodRepository.insertFood(food);
    }

    @Override
    public Food getFoodById(Integer id) {
        return foodRepository.getFoodById(id);
    }
*/
}
