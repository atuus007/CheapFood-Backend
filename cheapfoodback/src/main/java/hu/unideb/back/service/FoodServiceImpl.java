package hu.unideb.back.service;

import hu.unideb.back.model.Food;
import hu.unideb.back.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;


@Service("foodService")
public class FoodServiceImpl implements FoodService {
    private static final Logger logger = LoggerFactory.getLogger(FoodServiceImpl.class);
    @Autowired
    private FoodRepository foodRepository;
   // @Autowired
   // public void setFoodRepository(FoodRepository foodRepository) {
    //    this.foodRepository = foodRepository;
    //}

    @Override
    public List<Food> findAll(){
        logger.error("findAll Service");
        return null;
    }

    @Override
    public void sdf() {
        System.out.println("dfasfasfdasdfasdfasf");
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
