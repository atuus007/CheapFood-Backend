package hu.unideb.back.service;

import hu.unideb.back.model.Food;
import hu.unideb.back.repository.FoodRepository;
import hu.unideb.back.service.FoodService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;



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
