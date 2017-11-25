package hu.unideb.back.service.quantity.converter;

import hu.unideb.back.controller.ingredients.converter.UpdateIngredientsRequest;
import hu.unideb.back.controller.quantity.converter.UpdateQuantityRequest;
import hu.unideb.back.model.Ingredients;
import hu.unideb.back.model.Quantity;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UpdateQuantityRequestConverter {

    private final ModelMapper modelMapper;

    private static final Logger logger = LoggerFactory.getLogger(UpdateQuantityRequestConverter.class);

    public UpdateQuantityRequestConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Quantity from(UpdateQuantityRequest updateQuantityRequest){
        logger.info("Converting UpdateFoodRequestConverter from Food.");
        return modelMapper.map(updateQuantityRequest,Quantity.class);
    }
}
