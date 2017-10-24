package hu.unideb.repository;


import hu.unideb.model.FoodModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("foodRepository")
public class FoodRepositoryImpl implements FoodRepository {


    @Override
    public List<FoodModel> findAll(){
        List<FoodModel> foods=new ArrayList<>();
        return foods;
    }


}
