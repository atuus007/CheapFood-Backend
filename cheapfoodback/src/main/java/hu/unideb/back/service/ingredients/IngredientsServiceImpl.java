package hu.unideb.back.service.ingredients;

import hu.unideb.back.controller.food.converter.CreateFoodRequestwithingerdietns;
import hu.unideb.back.controller.food.converter.FoodResponse;
import hu.unideb.back.controller.ingredients.converter.CreateIngredientsRequest;
import hu.unideb.back.controller.ingredients.converter.IngredientsResponse;
import hu.unideb.back.controller.ingredients.converter.UpdateIngredientsRequest;
import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import hu.unideb.back.repository.IngredientsRepository;
import hu.unideb.back.service.ingredients.converter.CreateIngredientsRequestConverter;
import hu.unideb.back.service.ingredients.converter.IngredientsResoponseCoverter;
import hu.unideb.back.service.food.converter.CreateFoodRequestWithIngerdientsConverter;
import hu.unideb.back.service.ingredients.converter.UpdateIngredientsRequestConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service("ingredientsService")
public class IngredientsServiceImpl implements IngredientsService {
    private static final Logger logger = LoggerFactory.getLogger(IngredientsServiceImpl.class);

    @Autowired
    private IngredientsRepository ingredientsRepository;
    @Autowired
    private CreateIngredientsRequestConverter createIngredientsRequestConverter;
    @Autowired
    private UpdateIngredientsRequestConverter updateIngredientsRequestConverter;
    @Autowired
    private IngredientsResoponseCoverter ingredientsResoponseCoverter;
    @Autowired
    private CreateFoodRequestWithIngerdientsConverter createFoodRequestWithIngerdientsConverter;

    @Override
    public List<IngredientsResponse> findAllIngredients(){

        logger.debug("findAllIngredients Service ");
        return ingredientsRepository.findAll().stream()
                .map(ingredientsResoponseCoverter::from)
                .collect(Collectors.toList());
    }

    @Override
    public List<IngredientsResponse> findIngredientsById(Long Id){
        logger.debug("findIngredientsById");
        return ingredientsRepository.findIngredientsById(Id).stream()
                .map(ingredientsResoponseCoverter::from)
                .collect(Collectors.toList());
    }

    @Override
    public void saveFoodwithingsing(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns) {
        logger.debug("saveFood() Service ");
        List<Ingredients> ingredientsList = createFoodRequestWithIngerdientsConverter.ingfrom(createFoodRequestwithingerdietns);
        for(int i = 0; i < ingredientsList.size(); i++){
            Ingredients ingredients = new Ingredients(ingredientsList.get(i).getAtlagar(),ingredientsList.get(i).getMennyiseg(),ingredientsList.get(i).getName());
            ingredientsRepository.save(ingredients);
        }
    }

    @Override
    public void saveIngredients(CreateIngredientsRequest createIngredientsRequest) {
        logger.debug("saveIngredients() Service ");
        Ingredients ingredients=createIngredientsRequestConverter.from(createIngredientsRequest);
        ingredientsRepository.save(ingredients);
    }
    @Override
    public boolean deleteIngredients(long id) {
        Optional<Ingredients> ingredientsOptional=ingredientsRepository.findById(id);
        if(ingredientsOptional.isPresent()){
            logger.debug("Ingredients deleted");
            ingredientsRepository.delete(id);
            return true;
        }else{
            logger.debug("Ingredients deleted failed");
            return false;
        }
    }
    @Override
    public boolean updateIngredients(UpdateIngredientsRequest updateIngredientsRequest) {
        Optional<Ingredients> ingredientsOptional=ingredientsRepository.findById(updateIngredientsRequest.getId());
        if(ingredientsOptional.isPresent()){
            logger.debug("Ingredients deleted");
            ingredientsRepository.save(updateIngredientsRequestConverter.from(updateIngredientsRequest));
            return true;
        }else{
            logger.debug("Ingredients deleted failed");
            return false;
        }
    }

}
