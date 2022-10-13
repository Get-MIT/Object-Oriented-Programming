import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestAdder {

	@Test
	void test() {
			// We create an instance of Adder
		Adder adder = new Adder();
		
			// We write the test (calling adder and passing it 2 numbers
		int actualResult = adder.add2(5, 6);
		
			// We give the correct result
		int expectedResult = 11;

			// We call a testing method 
		assertEquals(actualResult,expectedResult);
	}
}
