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

//@Controller
@RestController
public class IngredientsController {
    private static final Logger logger = LoggerFactory.getLogger(IngredientsController.class);
    @Autowired
    private IngredientsService ingredientsService;
/*
    @RequestMapping(value = "/index")
    public String index(Model model){
        return "forward:index.jsp";
    }
*/

    /*
        @RequestMapping(value = "/index")
        public String creator(Model model){
            return "forward:index.jsp";
        }

        @RequestMapping(value = "/index", method = RequestMethod.POST)
        public String directCreator(@ModelAttribute("index") Model model){
            System.out.println("directCreatory");
            return "redirect:keszitok.html";
        }
        */
    @RequestMapping(value = "/ingredientslist", method = RequestMethod.GET)
    public @ResponseBody
    List<Ingredients> getFoods() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        logger.debug("IngredientsAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa " + dateFormat.format(date));
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
        return ingredientsService.findAll();

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
