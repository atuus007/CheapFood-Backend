package hu.unideb.repository;


import hu.unideb.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("foodRepository")
public class FoodRepositoryImpl implements FoodRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Food> findAll(){
        List<Food> foods=jdbcTemplate.query("select * from food", new RowMapper<Food>() {
            @Nullable
            @Override
            public Food mapRow(ResultSet resultSet, int i) throws SQLException {
                Food food=new Food();
                food.setId(resultSet.getInt("id"));
                return food;
            }
        });
        return foods;
    }


}
