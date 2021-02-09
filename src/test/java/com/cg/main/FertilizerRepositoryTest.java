package com.cg.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.model.*;
import com.cg.main.service.*;
import com.cg.main.repository.*;
@SpringBootTest
class FertilizerRepositoryTest {
	
	@Autowired
	FertilizerRepository repo;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		List<Fertilizer> fertilizers = repo.findAllByProductName("Blomer");
		String type =fertilizers.get(0).getProductName();
		assertEquals("Blomer", type);
	}
}
