package hu.unideb.back.controller;


import hu.unideb.back.model.Ingredients;
import hu.unideb.back.service.IngredientsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class IngredientsController {
    private static final Logger logger = LoggerFactory.getLogger(IngredientsController.class);
    @Autowired
    private IngredientsService ingredientsService;
    @RequestMapping(value = "/ingredientslist", method = RequestMethod.GET)
    public @ResponseBody
    List<Ingredients> getFoods() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        logger.debug("IngredientsAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa " + dateFormat.format(date));
    return ingredientsService.findAll();
    }

    @RequestMapping(value = "/ingredientslist2", method = RequestMethod.GET)
    public @ResponseBody
    List<Ingredients> findIngredientsById() {
        Long Id = Long.valueOf(1);
        return ingredientsService.findIngredientsById(Id);
    }

}
