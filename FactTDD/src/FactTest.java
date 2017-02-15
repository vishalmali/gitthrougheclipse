import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactTest {
	Fact fact;

	@Before
	public void setUp() {
		fact = new Fact();
	}

	@Test
	public void whenNumberIsZeroSystemShouldReturnOne() {
		assertEquals(1, fact.getFact(0));
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	public void whenNumberIsNegativeSystemShouldThrowException() {
		fact.getFact(-9);
	}

	@Test
	public void whenTheNumberIsPositiveSystemShouldReturnExpectedOutput() {
		assertTrue(24 == fact.getFact(4));
		assertFalse(25 == fact.getFact(4));
		assertEquals(24, fact.getFact(4));
	}
	
	@Test(timeout=2000)
	public void whenMethodIsTakingMoreThan2Seconds() throws Exception {
		
		Thread.sleep(3000);
	}
}
