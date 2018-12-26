package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass1 {

	@Test
	public void NotSohappy() {
		
		System.out.println("Why so not happy");
	} 
	
	@Before
	public void Sohappy() {
		System.out.println("Yes I'm happy");
	}

}
