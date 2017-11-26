package hu.unideb.back.service.query;

import hu.unideb.back.model.Querys;
import java.util.List;

public interface QueryService {
    List<Querys> findIngredientsById(Long Id);
}
