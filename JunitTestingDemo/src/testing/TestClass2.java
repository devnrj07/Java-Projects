package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.internal.runners.TestClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.SuiteClass);

@Suite.SuiteClasses({
	FirstDemo.class,
	TestClass.class
})
class TestClass2 {

	

}
