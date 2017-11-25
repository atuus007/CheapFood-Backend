package hu.unideb.back.service.ingredients;

import hu.unideb.back.model.Ingredients;
import java.util.List;

public interface IngredientsService {

    List<Ingredients> findAll();
    List<Ingredients> findIngredientsById(Long Id);
}
