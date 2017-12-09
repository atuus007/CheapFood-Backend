package hu.unideb.back.service.ingredients.converter;

import hu.unideb.back.controller.food.converter.CreateFoodRequestwithingerdietns;
import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import hu.unideb.back.model.IngredientswithGenelogy;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CreateFoodRequestWithIngerdientsIngsConverter {
    private final ModelMapper modelMapper;
    private static final Logger logger = LoggerFactory.getLogger(CreateFoodRequestWithIngerdientsIngsConverter.class);

    @Autowired
    public CreateFoodRequestWithIngerdientsIngsConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public List<Ingredients> ingfrom(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns){
        logger.info("Convertin CreateFoodrequestwithing ING Part.");
        List<IngredientswithGenelogy> ingredientswithGenelogies = new ArrayList<>();
        ingredientswithGenelogies.addAll(createFoodRequestwithingerdietns.getIngredientsList());
        List<Ingredients> ingredientsList = new ArrayList<>();
        for(int i = 0; i< ingredientswithGenelogies.size(); i++){
            Ingredients ingredients = new Ingredients(ingredientswithGenelogies.get(i).getAtlagar(),ingredientswithGenelogies.get(i).getMennyisegfajta(),ingredientswithGenelogies.get(i).getName());
            ingredientsList.add(ingredients);
        }
        return  ingredientsList;
    }
}
