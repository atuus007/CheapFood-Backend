package hu.unideb.back.repository;

import hu.unideb.back.model.Ingredients;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("ingredientRepository")
public class IngredientsRepositoryImpl implements IngredientsRepository {
   // @Autowired
   // private JdbcTemplate jdbcTemplate;

    @Override
    public List<Ingredients> getAll(){
     //   List<Ingredients>ingredients = jdbcTemplate.query("select * from hozzavalok", new RowMapper<Ingredients>() {
/*
            @Override
            public Ingredients mapRow(ResultSet resultSet, int i) throws SQLException {
                Ingredients ingreg=new Ingredients();
                ingreg.setId(resultSet.getInt("id"));
                ingreg.setName(resultSet.getString("name"));
                ingreg.setAtlagar(resultSet.getInt("atlagar"));
                ingreg.setMennyiseg(resultSet.getInt("mennyiseg"));
                return ingreg;

            }
        });
        */
        return null;
    }

}
