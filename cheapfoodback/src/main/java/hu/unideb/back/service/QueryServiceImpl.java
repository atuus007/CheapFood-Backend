package hu.unideb.back.service;

import hu.unideb.back.repository.QuantityRepository;
import hu.unideb.back.repository.QueryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("queryService")
public class QueryServiceImpl implements QueryService {
    private static final Logger logger = LoggerFactory.getLogger(QueryServiceImpl.class);
    @Autowired
    private QueryRepository queryRepository;

    @Override
    public String findIngredientsByIdAndmennyisegnev(Long Id){
        logger.debug("findIngredientsById");
        return queryRepository.findIngredientsByIdAndmennyisegnev(Id);
    }
}
