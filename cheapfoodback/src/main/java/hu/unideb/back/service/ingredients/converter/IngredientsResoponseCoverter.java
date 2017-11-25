package hu.unideb.back.service.ingredients.converter;

import hu.unideb.back.controller.food.converter.FoodResponse;
import hu.unideb.back.controller.ingredients.converter.IngredientsResponse;
import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientsResoponseCoverter {

    private final ModelMapper modelMapper;

    private static final Logger logger = LoggerFactory.getLogger(IngredientsResoponseCoverter.class);

    @Autowired
    public IngredientsResoponseCoverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public IngredientsResponse from(Ingredients ingredient){
        logger.info("Converting IngredientsResponse from Ingredients.");
        return modelMapper.map(ingredient, IngredientsResponse.class);
    }
}
