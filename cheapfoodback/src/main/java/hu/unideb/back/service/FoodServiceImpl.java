package hu.unideb.back.service;

import hu.unideb.back.controller.converter.CreateFoodRequest;
import hu.unideb.back.controller.converter.FoodResponse;
import hu.unideb.back.controller.converter.UpdateFoodRequest;
import hu.unideb.back.model.Food;
import hu.unideb.back.repository.FoodRepository;
import hu.unideb.back.service.convertesrs.CreateFoodRequestConverter;
import hu.unideb.back.service.convertesrs.FoodResoponseCoverter;
import hu.unideb.back.service.convertesrs.UpdateFoodRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service("foodService")
public class FoodServiceImpl implements FoodService {
    private static final Logger logger = LoggerFactory.getLogger(FoodServiceImpl.class);
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private CreateFoodRequestConverter createFoodRequestConverter;
    @Autowired
    private UpdateFoodRequestConverter updateFoodRequestConverter;
    @Autowired
    private FoodResoponseCoverter foodResoponseCoverter;

    // @Autowired
   // public void setFoodRepository(FoodRepository foodRepository) {
    //    this.foodRepository = foodRepository;
    //}

    @Override
    public List<FoodResponse> getAllFoods(){

        logger.debug("getAllFoods() Service ");
        return foodRepository.findAll().stream()
                .map(foodResoponseCoverter::from)
                .collect(Collectors.toList());

    }

    @Override
    public void saveFood(CreateFoodRequest createFoodRequest) {
       Food food=createFoodRequestConverter.form(createFoodRequest);
       foodRepository.save(food);
    }

    @Override
    public boolean deleteFood(long id) {
        Optional<Food> foodOptional=foodRepository.findById(id);
        if(foodOptional.isPresent()){
            logger.debug("Food deleted");
            return true;
        }else {
            logger.debug("Food deleted failed YOLO");
            return false;
        }
    }

    @Override
    public boolean updateFood(UpdateFoodRequest updateFoodRequest) {
        Optional<Food> foodOptional = foodRepository.findById(updateFoodRequest.getId());
        if(foodOptional.isPresent()){
            foodRepository.save(updateFoodRequestConverter.form(updateFoodRequest));
            return true;

        }else {
            return false;
        }
    }

}
