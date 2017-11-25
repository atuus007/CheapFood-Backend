package hu.unideb.back.service.quantity.converter;

import hu.unideb.back.controller.ingredients.converter.IngredientsResponse;
import hu.unideb.back.controller.quantity.converter.QuantityResponse;
import hu.unideb.back.model.Ingredients;
import hu.unideb.back.model.Quantity;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuantityResoponseCoverter {

    private final ModelMapper modelMapper;

    private static final Logger logger = LoggerFactory.getLogger(QuantityResoponseCoverter.class);

    @Autowired
    public QuantityResoponseCoverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public QuantityResponse from(Quantity quantity){
        logger.info("Converting IngredientsResponse from Ingredients.");
        return modelMapper.map(quantity, QuantityResponse.class);
    }
}
