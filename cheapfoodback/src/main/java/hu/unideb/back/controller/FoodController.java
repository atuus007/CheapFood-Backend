package hu.unideb.back.controller;

import hu.unideb.back.controller.converter.CreateFoodRequest;
import hu.unideb.back.controller.converter.UpdateFoodRequest;
import hu.unideb.back.model.Food;
import hu.unideb.back.service.FoodService;
import hu.unideb.back.service.FoodServiceImpl;
import hu.unideb.back.service.convertesrs.CreateFoodRequestConverter;
import hu.unideb.back.service.convertesrs.UpdateFoodRequestConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
@RequestMapping("/api/food")
public class FoodController {

    private static final Logger logger = LoggerFactory.getLogger(FoodController.class);

    @Autowired
    private FoodService foodService;
    @Autowired
    private CreateFoodRequestConverter createFoodRequestConverter;
    @Autowired
    private UpdateFoodRequestConverter updateFoodRequestConverter;

    @RequestMapping(value = "/foodslist")
    public @ResponseBody ResponseEntity<?> getFoods(){
        logger.info("FooodsAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa foodslist" );

        return new ResponseEntity<>(foodService.getAllFoods(), HttpStatus.OK);

    }

    @RequestMapping("/save")
    public ResponseEntity<?> saveFood(@RequestBody CreateFoodRequest createFoodRequest){
        foodService.saveFood(createFoodRequest);
        return new ResponseEntity<>(foodService.getAllFoods(), HttpStatus.OK);
    }
    @RequestMapping("/update")
    public ResponseEntity<?> deleteFood(@RequestBody UpdateFoodRequest updateFoodRequest){
        if (foodService.updateFood(updateFoodRequest)) {

            return new ResponseEntity<>(foodService.getAllFoods(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(foodService.getAllFoods(), HttpStatus.BAD_REQUEST);
        }


    }
    @RequestMapping("/{foodId}/delete")
    public ResponseEntity<?> deleteFood(@RequestBody CreateFoodRequest createFoodRequest){
        foodService.saveFood(createFoodRequest);
        return new ResponseEntity<>(foodService.getAllFoods(), HttpStatus.OK);
    }
}
