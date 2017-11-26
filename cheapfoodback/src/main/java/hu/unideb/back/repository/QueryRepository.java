package hu.unideb.back.repository;

import hu.unideb.back.model.Ingredients;
import hu.unideb.back.model.Querys;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface QueryRepository extends CrudRepository<Ingredients, Long>{

    @Query("SELECT et.id FROM Food et, Ingredients hv, Genelogy gy, Quantity my WHERE 1=1 AND et.id = gy.parentid AND gy.gyerekid = hv.id  AND hv.mennyiseg = my.id AND et.id = :id")
    List<Long> findetelById(@Param("id") Long id);
    @Query("SELECT hv.name FROM Food et, Ingredients hv, Genelogy gy, Quantity my WHERE 1=1 AND et.id = gy.parentid AND gy.gyerekid = hv.id  AND hv.mennyiseg = my.id AND et.id = :id")
    List<String> findIngredientsById(@Param("id") Long id);
    @Query("SELECT gy.szorzo FROM Food et, Ingredients hv, Genelogy gy, Quantity my WHERE 1=1 AND et.id = gy.parentid AND gy.gyerekid = hv.id  AND hv.mennyiseg = my.id AND et.id = :id")
    List<Long> findSzorzoById(@Param("id") Long id);
    @Query("SELECT  my.name FROM Food et, Ingredients hv, Genelogy gy, Quantity my WHERE 1=1 AND et.id = gy.parentid AND gy.gyerekid = hv.id  AND hv.mennyiseg = my.id AND et.id = :id")
    List<String> findmennyisegById(@Param("id") Long id);
}