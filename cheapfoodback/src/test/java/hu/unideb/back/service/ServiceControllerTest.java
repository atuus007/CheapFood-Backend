package hu.unideb.back.service;

import hu.unideb.back.service.food.FoodService;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;


// @RunWith(SpringRunner.class)
// @SpringBootTest
public class ServiceControllerTest
{

    @Autowired
    private FoodService foodService;

    @Test(timeout=3000)
    public void testInsert(){
        System.out.println("AAAAAAAAAAAAAAAA");
        /*
        List<Food> asd=new ArrayList<>();
        asd=foodService.findAll();
        System.out.println("BBBBBBBBBBBBBBB");
        for(Food f:asd){
            System.out.println(f.getId()+" "+f.getName());
        }
        */
        //foodService.sdf();
        //repo.insertFood(food);

    }


}
