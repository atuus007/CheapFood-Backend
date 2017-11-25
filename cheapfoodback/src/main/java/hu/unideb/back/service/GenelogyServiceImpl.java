package hu.unideb.back.service;

import hu.unideb.back.model.Genelogy;
import hu.unideb.back.repository.GenelogyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("genelogyService")
public class GenelogyServiceImpl implements GenelogyService {
    private static final Logger logger = LoggerFactory.getLogger(GenelogyServiceImpl.class);
    @Autowired
    private GenelogyRepository genelogyRepository;


    @Override
    public List<Genelogy> findAll(){
        logger.debug("findAll Service ");
        return genelogyRepository.findAll();
    }




}
