package hu.unideb.back.repository.utils;

import hu.unideb.back.model.Food;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FoodRowMapper implements RowMapper<Food>{

    @Override
    public Food mapRow(ResultSet rs, int rowNum)throws SQLException{
       Food food = new Food();
       food.setId(rs.getInt("id"));
       food.setName(rs.getString("name"));
       food.setMennyiseg(rs.getInt("mennyiseg"));
       food.setMennyisegFajta(rs.getInt("mennyisegfajta"));
       return food;
       //food.setMennyisegFajta();
    }
}
