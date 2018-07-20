package io.yadnyesh.cardatabase.repository;

import io.yadnyesh.cardatabase.model.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by yadnyesh on 19/7/18.
 */
public interface CarRepository extends CrudRepository<Car, Long> {

    List<Car> findByBrand(String brand);

    List<Car> findByColor(String color);

    List<Car> findByYear(int year);
}
