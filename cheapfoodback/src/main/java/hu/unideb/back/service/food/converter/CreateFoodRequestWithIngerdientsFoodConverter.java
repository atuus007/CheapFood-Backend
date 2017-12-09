package hu.unideb.back.service.food.converter;

import hu.unideb.back.controller.food.converter.CreateFoodRequestwithingerdietns;
import hu.unideb.back.model.Food;
import hu.unideb.back.model.Ingredients;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CreateFoodRequestWithIngerdientsFoodConverter {
    private final ModelMapper modelMapper;
    private static final Logger logger = LoggerFactory.getLogger(CreateFoodRequestWithIngerdientsFoodConverter.class);

    @Autowired
    public CreateFoodRequestWithIngerdientsFoodConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Food from(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns){
        logger.info("Convertin CreateFoodrequestwithing Food Part.");
        Food food = new Food();
        food.setName(createFoodRequestwithingerdietns.getName());
        food.setElkeszitesi_ido(createFoodRequestwithingerdietns.getElkeszitesi_ido());
        food.setMennyiseg(createFoodRequestwithingerdietns.getMennyiseg());
        food.setMennyisegfajta(createFoodRequestwithingerdietns.getMennyisegfajta());
        return food;
    }
}
