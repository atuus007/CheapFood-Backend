package hu.unideb.back.service.genelogy;

import hu.unideb.back.controller.food.converter.CreateFoodRequestwithingerdietns;
import hu.unideb.back.model.Genelogy;
import java.util.List;

public interface GenelogyService {

    List<Genelogy> findAll();
    void saveFoodwithingsing(CreateFoodRequestwithingerdietns createFoodRequestwithingerdietns);

}
