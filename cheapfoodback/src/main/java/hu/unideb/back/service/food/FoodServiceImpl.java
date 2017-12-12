package hu.unideb.back.service.food;

import hu.unideb.back.controller.food.converter.CreateFoodRequest;
import hu.unideb.back.controller.food.converter.CreateFoodRequestwithingerdietns;
import hu.unideb.back.controller.food.converter.FoodResponse;
import hu.unideb.back.controller.food.converter.UpdateFoodRequest;
import hu.unideb.back.model.Food;
import hu.unideb.back.repository.FoodRepository;
import hu.unideb.back.service.food.converter.CreateFoodRequestConverter;
import hu.unideb.back.service.food.converter.CreateFoodRequestWithIngerdientsFoodConverter;
import hu.unideb.back.service.food.converter.FoodResoponseCoverter;
import hu.unideb.back.service.food.converter.UpdateFoodRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
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
    @Autowired
    private CreateFoodRequestWithIngerdientsFoodConverter createFoodRequestWithIngerdientsFoodConverter;

    @Override
    public List<FoodResponse> getAllFoods(){

        logger.debug("getAllFoods() Service ");
        return foodRepository.findAll().stream()
                .map(foodResoponseCoverter::from)
                .collect(Collectors.toList());

    }

    @Override
    public List<FoodResponse> getAllFoodsbeetween(Integer money1, Integer money2){
        logger.debug("getAllFoodsbeetween() Service ");
        return foodRepository.findAllByOsszarBetween(money1,money2)
                .stream().map(foodResoponseCoverter::from)
                .collect(Collectors.toList());
    }

    @Override
    public void saveFood(CreateFoodRequest createFoodRequest) {
        logger.debug("saveFood() Service ");
        Food food=createFoodRequestConverter.from(createFoodRequest);
        //food.setElkeszitesi_ido(123);
        food.setOsszar(500);
        //till the frontend dont have it
        foodRepository.save(food);
    }

    @Override
    public void saveFoodwithingsfood(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns, int osszar) {
        logger.debug("saveFood() Service ");
        Food food= createFoodRequestWithIngerdientsFoodConverter.from(createFoodRequestwithingerdietns);
        food.setOsszar(osszar);
        foodRepository.save(food);
    }

    @Override
    public Integer findIngredientsIDByName(String Name){
        logger.debug("findIngredientsByName Service");
        Integer FoodName;
        FoodName = foodRepository.findIngredientsByName(Name);
        return FoodName;
    }

    @Override
    public boolean deleteFood(long id) {
        Optional<Food> foodOptional=foodRepository.findById(id);
        if(foodOptional.isPresent()){
            logger.debug("Food deleted");
            foodRepository.delete(id);
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
            foodRepository.save(updateFoodRequestConverter.from(updateFoodRequest));
            return true;

        }else {
            return false;
        }
    }

    @Override
    public List<FoodResponse> findFoodbyName(String name) {
        return foodRepository.findFoodByName(name).stream()
                .map(foodResoponseCoverter::from)
                .collect(Collectors.toList());
    }

}
