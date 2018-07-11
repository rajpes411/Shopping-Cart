package com.abc.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.abc.bean.Card;



class CardServiceTest {
static CardService service;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	  service=new CardService();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValidateCard() {
	
		Card card =new Card(11, "11111", "raj", new Date(), 111, 1001);
	boolean valid=service.validateCard(card);
	assertTrue(valid);
	
	}

}
