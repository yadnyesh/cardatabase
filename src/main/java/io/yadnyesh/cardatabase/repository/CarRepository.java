package io.yadnyesh.cardatabase.repository;

import io.yadnyesh.cardatabase.model.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yadnyesh on 19/7/18.
 */
public interface CarRepository extends CrudRepository<Car, Long> {
}
