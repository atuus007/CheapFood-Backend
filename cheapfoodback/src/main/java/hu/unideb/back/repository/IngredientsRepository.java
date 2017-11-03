package hu.unideb.back.repository;

import hu.unideb.back.model.Ingredients;

import java.util.List;

public interface IngredientsRepository {
    List<Ingredients> getAll();
}
