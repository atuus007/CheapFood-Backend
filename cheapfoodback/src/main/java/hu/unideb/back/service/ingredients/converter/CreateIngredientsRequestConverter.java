package hu.unideb.back.service.ingredients.converter;

import hu.unideb.back.controller.food.converter.CreateFoodRequest;
import hu.unideb.back.controller.ingredients.converter.CreateIngredientsRequest;
import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateIngredientsRequestConverter {
    private final ModelMapper modelMapper;
    private static final Logger logger = LoggerFactory.getLogger(CreateIngredientsRequestConverter.class);

    @Autowired
    public CreateIngredientsRequestConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Ingredients from(CreateIngredientsRequest createIngredientsRequest){
        logger.info("Convertin CreatePetRequest from Pet.");
        return modelMapper.map(createIngredientsRequest,Ingredients.class);

    }
}
