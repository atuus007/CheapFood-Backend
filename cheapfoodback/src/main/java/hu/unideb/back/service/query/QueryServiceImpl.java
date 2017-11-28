package hu.unideb.back.service.query;

import hu.unideb.back.model.Querys;
import hu.unideb.back.repository.QueryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service("queryService")
public class QueryServiceImpl implements QueryService {
    private static final Logger logger = LoggerFactory.getLogger(QueryServiceImpl.class);
    @Autowired
    private QueryRepository queryRepository;

    @Override
    public List<Querys> findIngredientsById(Long Id){
        logger.debug("findIngredientsById");
        List<Querys> returnlist1 = new ArrayList<>();
        List<Long>  etellist = new ArrayList<>();
        etellist = queryRepository.findetelById(Id);
        List<String>  hozzavaloklist = new ArrayList<>();
        hozzavaloklist = queryRepository.findIngredientsById(Id);
        List<Long>  szorzolist = new ArrayList<>();
        szorzolist = queryRepository.findSzorzoById(Id);
        List<String>  mennyiseglist = new ArrayList<>();
        mennyiseglist = queryRepository.findmennyisegById(Id);
        List<Integer>  atalgarlist = new ArrayList<>();
        atalgarlist = queryRepository.findcostById(Id);
        for(int i = 0; i<etellist.size();i++){
            Querys qasd = new Querys(etellist.get(i),hozzavaloklist.get(i),szorzolist.get(i),mennyiseglist.get(i),atalgarlist.get(i));
            returnlist1.add(qasd);
        }
        return returnlist1;
    }
}
