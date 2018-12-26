package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstDemo {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		System.out.println("Setup before class\n used for creating objects classes");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("Setup after class \n for closing connections and releasing resources");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This is beforeeach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("This is after each");
	}

	@Test
	void test() {
		System.out.println("This is getting implemented @test1 ");
	}
	
	@Test
	void welcome() {
		System.out.println("   this is getting implemented @test2");
	}
	
	
}
