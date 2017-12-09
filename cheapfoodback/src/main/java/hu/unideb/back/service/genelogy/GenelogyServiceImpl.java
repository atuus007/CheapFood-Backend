package hu.unideb.back.service.genelogy;

import hu.unideb.back.controller.food.converter.CreateFoodRequestwithingerdietns;
import hu.unideb.back.model.Genelogy;
import hu.unideb.back.repository.GenelogyRepository;
import hu.unideb.back.service.food.FoodService;
import hu.unideb.back.service.genelogy.converter.CreateFoodRequestWithIngerdientsGenlgyConverter;
import hu.unideb.back.service.ingredients.IngredientsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("genelogyService")
public class GenelogyServiceImpl implements GenelogyService {
    private static final Logger logger = LoggerFactory.getLogger(GenelogyServiceImpl.class);
    @Autowired
    private GenelogyRepository genelogyRepository;

    @Autowired
    private FoodService foodService;

    @Autowired
    private IngredientsService ingredientsService;

    @Autowired
    private CreateFoodRequestWithIngerdientsGenlgyConverter createFoodRequestWithIngerdientsGenlgyConverter;


    @Override
    public List<Genelogy> findAll(){
        logger.debug("findAll Service ");
        return genelogyRepository.findAll();
    }

    @Override
    public void saveFoodwithingsing(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns){
        logger.debug("saveFood() Service ");
        List<Integer> genelogyList = createFoodRequestWithIngerdientsGenlgyConverter.genelogyfrom(createFoodRequestwithingerdietns);
        Integer FoodID = foodService.findIngredientsIDByName(createFoodRequestWithIngerdientsGenlgyConverter.foodfrom(createFoodRequestwithingerdietns));
        List<String> IngerdientsNamesS = createFoodRequestWithIngerdientsGenlgyConverter.ingfrom(createFoodRequestwithingerdietns);
        List<Integer> IngerdientsIDS = new ArrayList<>();
        for(int i = 0; i < IngerdientsIDS.size(); i++){
                IngerdientsIDS.add(ingredientsService.findIngredientsIDByName(IngerdientsNamesS.get(i)));
        }
        logger.debug("FoodID" + FoodID);
        for (int i = 0; i < IngerdientsIDS.size(); i++){
            logger.debug("IngedientsID i: " + i + " ID: " + IngerdientsIDS.get(i));
        }
        /*for(int i = 0; i < genelogyList.size(); i++){
            Genelogy genelogy = new Genelogy();
        }*/
    }




}
