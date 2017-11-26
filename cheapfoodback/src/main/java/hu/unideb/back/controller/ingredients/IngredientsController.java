package hu.unideb.back.controller.ingredients;


import hu.unideb.back.controller.ingredients.converter.UpdateIngredientsRequest;
import hu.unideb.back.model.Ingredients;
import hu.unideb.back.service.food.converter.CreateFoodRequestConverter;
import hu.unideb.back.service.ingredients.IngredientsService;
import hu.unideb.back.service.ingredients.converter.UpdateIngredientsRequestConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientsController {
    private static final Logger logger = LoggerFactory.getLogger(IngredientsController.class);
    @Autowired
    private IngredientsService ingredientsService;
    @Autowired
    private CreateFoodRequestConverter createFoodRequestConverter;
    @Autowired
    private UpdateIngredientsRequestConverter updateIngredientsRequestConverter;


    @RequestMapping(value = "/ingredients", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> getAllIngredients() {

        logger.debug("IngredientsAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa ");
        return new ResponseEntity<>(ingredientsService.findAllIngredients(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{ingId}/asd", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<?> findIngredientsById(@PathVariable(value = "foodId") long id) {
        Long Id = Long.valueOf(1);
        return null /*ingredientsService.findIngredientsById(Id)*/;
    }

}
