package hu.unideb.back.service.convertesrs;

import hu.unideb.back.controller.converter.FoodResponse;
import hu.unideb.back.model.Food;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodResoponseCoverter {

    private final ModelMapper modelMapper;

    private static final Logger logger = LoggerFactory.getLogger(FoodResoponseCoverter.class);

    @Autowired
    public FoodResoponseCoverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public FoodResponse from(Food food){
        logger.info("Convertin CreateFoodRequest from Food.");
        return modelMapper.map(food, FoodResponse.class);
    }
}
