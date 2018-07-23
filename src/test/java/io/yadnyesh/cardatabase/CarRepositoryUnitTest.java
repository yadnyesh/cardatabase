package io.yadnyesh.cardatabase;

import io.yadnyesh.cardatabase.repository.CarRepository;
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
	
	public void saveCar(){
	
	}
}
