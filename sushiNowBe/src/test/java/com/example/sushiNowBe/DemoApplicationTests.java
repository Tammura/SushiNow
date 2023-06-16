package com.example.sushiNowBe;

import com.example.sushiNowBe.model.domain.Table;
import com.example.sushiNowBe.model.entity.TableEntity;
import com.example.sushiNowBe.model.entity.repository.TableRepository;
import com.example.sushiNowBe.service.SushiNowService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@SpringBootTest
class SushiNowServiceImplTest {

	//@Autowired
	private SushiNowService service;

	//@Autowired
	private TableRepository testRepository;

	private TableEntity entityToTest;

	private Table test;

	//@BeforeEach
	public void setUp(){
		entityToTest = new TableEntity();
		entityToTest.setId("ttyytt");
		entityToTest.setNumber(5);
		entityToTest.setTotFoodNumber(List.of(1));
		entityToTest.setTotFoodQta(List.of(1));

		testRepository.save(entityToTest);

		test = new Table();
		test.setId("ttyytt");
		test.setNumber(5);
		test.setTotFoodNumber(List.of(1));
		test.setTotFoodQta(List.of(2));
	}

	//@Test
	void insertNewTableTest() {

		TableEntity table = service.insertNewTable(test);

		Assertions.assertEquals(table.getId(), entityToTest.getId());
		Assertions.assertEquals(table.getNumber(), entityToTest.getNumber());
		Assertions.assertEquals(table.getTotFoodNumber(), entityToTest.getTotFoodNumber());
		Assertions.assertNotEquals(table.getTotFoodQta(), entityToTest.getTotFoodQta());
	}

	//@Test
	void insertNewTableTest1() {

		TableEntity table = service.insertNewTable(test);

		Assertions.assertEquals(table.getId(), entityToTest.getId());
		Assertions.assertEquals(table.getNumber(), entityToTest.getNumber());
		Assertions.assertEquals(table.getTotFoodNumber(), entityToTest.getTotFoodNumber());
		Assertions.assertNotEquals(table.getTotFoodQta(), entityToTest.getTotFoodQta());
	}


	//@Test
	void insertNewTableTest2() {

		TableEntity table = service.insertNewTable(test);

		Assertions.assertEquals(table.getId(), entityToTest.getId());
		Assertions.assertEquals(table.getNumber(), entityToTest.getNumber());
		Assertions.assertEquals(table.getTotFoodNumber(), entityToTest.getTotFoodNumber());
		Assertions.assertNotEquals(table.getTotFoodQta(), entityToTest.getTotFoodQta());
	}

}
