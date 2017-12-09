package hu.unideb.back.service.genelogy.converter;

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
public class CreateFoodRequestWithIngerdientsGenlgyConverter {
    private final ModelMapper modelMapper;
    private static final Logger logger = LoggerFactory.getLogger(CreateFoodRequestWithIngerdientsGenlgyConverter.class);

    @Autowired
    public CreateFoodRequestWithIngerdientsGenlgyConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public List<Integer> genelogyfrom(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns){
        logger.info("Convertin CreateFoodrequestwithing Genelogy Part.");
        List<Integer> genelogyList = new ArrayList<>();
        /*for(int i = 0; i<createFoodRequestwithingerdietns.getGenelogyList().size(); i++){
            logger.debug(createFoodRequestwithingerdietns.getGenelogyList().get(i).toString());
        }*/

        genelogyList.addAll(createFoodRequestwithingerdietns.getGenelogyList());
        return  genelogyList;
    }
    public List<String> ingfrom(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns){
        logger.info("Convertin CreateFoodrequestwithing ING Part for Genelogy.");
        List<String> ingredientsList = new ArrayList<>();
        for(int i = 0; i < createFoodRequestwithingerdietns.getIngredientsList().size(); i++){
            ingredientsList.add(createFoodRequestwithingerdietns.getIngredientsList().get(i).getName());
        }
        return ingredientsList;
    }
    public String foodfrom(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns){
        logger.info("Convertin CreateFoodrequestwithing Food Part for Genelogy.");
        String foodName = createFoodRequestwithingerdietns.getName();
        return foodName;
    }
}
