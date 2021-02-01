package hu.unideb.back.service.ingredients.converter;

import hu.unideb.back.controller.food.converter.UpdateFoodRequest;
import hu.unideb.back.controller.ingredients.converter.UpdateIngredientsRequest;
import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UpdateIngredientsRequestConverter {

    private final ModelMapper modelMapper;

    private static final Logger logger = LoggerFactory.getLogger(UpdateIngredientsRequestConverter.class);

    public UpdateIngredientsRequestConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Ingredients from(UpdateIngredientsRequest updateIngredientsRequest){
        logger.info("Converting UpdateFoodRequestConverter from Food.");
        return modelMapper.map(updateIngredientsRequest,Ingredients.class);
    }
}
