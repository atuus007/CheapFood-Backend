package hu.unideb.back.service.quantity.converter;

import hu.unideb.back.controller.ingredients.converter.CreateIngredientsRequest;
import hu.unideb.back.controller.quantity.converter.CreateQuantityRequest;
import hu.unideb.back.model.Ingredients;
import hu.unideb.back.model.Quantity;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateQuantityRequestConverter {
    private final ModelMapper modelMapper;
    private static final Logger logger = LoggerFactory.getLogger(CreateQuantityRequestConverter.class);

    @Autowired
    public CreateQuantityRequestConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Quantity from(CreateQuantityRequest createQuantityRequest){
        logger.info("Convertin CreatePetRequest from Pet.");
        return modelMapper.map(createQuantityRequest,Quantity.class);

    }
}
