package com.cg.main;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.main.model.Seed;
import com.cg.main.repository.SeedRepository;


/**
 * 
 * @author manasa
 *RepositoryTestCase class includes testcases for customized repository function
 */
@SpringBootTest
class SeedRepositoryTest {
	@Autowired
	SeedRepository repository;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * findAllByCommonNameTestcase handles testcases for getting data using common name
	 */
	@Test
	void findAllByCommonNameTestcase() {
		List<Seed> seed = repository.findAllByCommonName("corn");
		String name= seed.get(0).getCommonName();
		assertEquals("corn", name);
	}

}
