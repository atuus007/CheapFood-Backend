package hu.unideb.controller;


//import hu.unideb.back.model.Food;
import hu.unideb.back.model.Food;
import hu.unideb.back.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FoodController {

    @Autowired
    private FoodService foodService;


    @RequestMapping(value = "/foods", method = RequestMethod.GET)
    public @ResponseBody List<Food> getFoods(){
        System.out.println("FooodsAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        //List<Food> foods=new ArrayList<Food>();
/*
        Food food=new Food();
        food.setName("InsertTest");
        food.setMennyiseg(21);
        food.setMennyisegFajta(2);
        foods.add(food);
        food.setName("InsertTest2");
        food.setMennyiseg(41);
        food.setMennyisegFajta(5);
        foods.add(food);
        for(Food f:foods){
            System.out.println(food.getName()+" "+food.getMennyiseg()+" "+food.getMennyisegFajta());
        }

*/
        return foodService.findAll();

    }
/*
    @RequestMapping(value ="/yolo")
    public String sayHello (Model model) {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBB");
        model.addAttribute("valami", "Hello World");
        model.addAttribute("asd", "Hülye faszfej szar fos köcsög");
        return "asdf";
    }
  */

}
