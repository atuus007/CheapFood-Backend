package hu.unideb.back.service.food.converter;

import hu.unideb.back.controller.food.converter.CreateFoodRequest;
import hu.unideb.back.model.Food;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateFoodRequestConverter {
    private final ModelMapper modelMapper;
    private static final Logger logger = LoggerFactory.getLogger(CreateFoodRequestConverter.class);

    @Autowired
    public CreateFoodRequestConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Food from(CreateFoodRequest createFoodRequest){
        logger.info("Convertin CreatePetRequest from Pet.");
        return modelMapper.map(createFoodRequest,Food.class);

    }
}
