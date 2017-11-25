package hu.unideb.back.service;

import hu.unideb.back.model.Quantity;
import hu.unideb.back.repository.QuantityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("quantityService")
public class QuantityServiceImpl implements QuantityService {
    private static final Logger logger = LoggerFactory.getLogger(QuantityServiceImpl.class);
    @Autowired
    private QuantityRepository quantityRepository;


    @Override
    public List<Quantity> findAll(){

        logger.debug("findAll Service ");
        return quantityRepository.findAll();
    }




}
