package hu.unideb.back.repository;


import hu.unideb.back.model.Food;
import hu.unideb.back.repository.utils.FoodRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("foodRepository")
public class FoodRepositoryImpl implements FoodRepository {


    //@Autowired
    //private JdbcTemplate jdbcTemplate;
    @Override
    public Food insertFood(Food food) {
        System.out.println("BBBBBBBBBBBBBBB");
      //  SimpleJdbcInsert insert=new SimpleJdbcInsert(jdbcTemplate);
       // insert.setGeneratedKeyName("id");


        Map<String, Object> data = new HashMap<>();
        data.put("name", food.getName());
        data.put("mennyiseg", food.getMennyiseg());
        data.put("mennyisegfajta", food.getMennyisegFajta());


        List<String> columns = new ArrayList<>();
        columns.add("name");
        columns.add("mennyiseg");
        columns.add("mennyisegfajta");

        //insert.setTableName("etel");
        //insert.setColumnNames(columns);
        //Number id = insert.executeAndReturnKey(data);

        return /*getFoodById(id.intValue())*/null;
    }

    @Override
    public Food getFoodById(Integer id) {
        //Food food = jdbcTemplate.queryForObject("select * from etel where id = ?", new FoodRowMapper(), id);

        return null;
    }



    @Override
    public List<Food> findAll(){
        System.out.println("findAll Repo");

       // List<Food> foods=jdbcTemplate.query("select * from etel", new FoodRowMapper());
/*
            @Override
            public Food mapRow(ResultSet resultSet, int i) throws SQLException {
                Food food=new Food();
                food.setId(resultSet.getInt("id"));
                return food;
            }
        });*/
        /*
        List<Food> foods=new ArrayList<>();
        Food food=new Food();
        food.setName("InsertTest");
        food.setMennyiseg(21);
        food.setMennyisegFajta(2);
        */
        return null;
    }




}
