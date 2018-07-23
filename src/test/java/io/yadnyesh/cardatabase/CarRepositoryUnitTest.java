package io.yadnyesh.cardatabase;

import io.yadnyesh.cardatabase.model.Car;
import io.yadnyesh.cardatabase.repository.CarRepository;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class )
@DataJpaTest
public class CarRepositoryUnitTest {

	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	CarRepository carRepository;
	
	@Test
	public void testSaveCar(){
		Car car = new Car("Tesla", "Model X", "White", "ABC-1234", 2017, 86400);
		entityManager.persistAndFlush(car);
		Assertions.assertThat(car.getId()).isNotNull();
	}
	
	
	public void testDeleteCar(){
	
	}
}
