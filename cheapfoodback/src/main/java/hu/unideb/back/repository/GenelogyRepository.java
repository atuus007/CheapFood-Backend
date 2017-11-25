package hu.unideb.back.repository;

import hu.unideb.back.model.Genelogy;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenelogyRepository extends CrudRepository<Genelogy, Long>{
    List<Genelogy> findAll();
}