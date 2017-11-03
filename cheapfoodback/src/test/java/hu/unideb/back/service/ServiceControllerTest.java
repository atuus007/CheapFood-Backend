package hu.unideb.back.service;

import hu.unideb.back.model.Food;
import hu.unideb.back.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.junit.Test;

public class ServiceControllerTest
{
    @Autowired
    private FoodRepository repo;

    @Test(timeout=3000)
    public void testInsert(){
        Food food=new Food();
        food.setName("InsertTest");
        food.setMennyiseg(21);
        food.setMennyisegFajta(2);

        //repo.insertFood(food);

    }


}
