package hu.unideb.back.service;

import hu.unideb.back.model.Ingredients;
import hu.unideb.back.repository.IngredientsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("ingredientsService")
public class IngredientsServiceImpl implements IngredientsService {
    private static final Logger logger = LoggerFactory.getLogger(IngredientsServiceImpl.class);
    @Autowired
    private IngredientsRepository ingredientsRepository;


    @Override
    public List<Ingredients> findAll(){

        logger.debug("findAll Service ");
        return ingredientsRepository.findAll();
    }

    @Override
    public List<Ingredients> findIngredientsById(Long Id){
        logger.debug("findIngredientsById");
        return ingredientsRepository.findIngredientsById(Id);
    }
}
