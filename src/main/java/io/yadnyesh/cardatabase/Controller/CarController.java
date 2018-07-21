package io.yadnyesh.cardatabase.Controller;

import io.yadnyesh.cardatabase.model.Car;
import io.yadnyesh.cardatabase.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

  @Autowired
  CarRepository carRepository;

  @GetMapping("/cars")
  public Iterable<Car> getAllCars() {
      return carRepository.findAll();
  }
}
