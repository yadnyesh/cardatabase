package io.yadnyesh.cardatabase;

import io.yadnyesh.cardatabase.Controller.CarController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CardatabaseApplicationTests {
	
	@Autowired
	private CarController carController;

	@Test
	public void contextLoads() {
	}

}
