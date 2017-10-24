package hu.unideb.service;

import hu.unideb.model.FoodModel;
import hu.unideb.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service("foodService")
public class FoodServiceImpl implements FoodService {
    //@Autowired
    private FoodRepository foodRepository;
    @Autowired
    public void setFoodRepository(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public List<FoodModel> findAll(){
        return foodRepository.findAll();
    }
}
