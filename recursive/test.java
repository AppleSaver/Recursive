package recursive;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void factTest() {
		Factorial fct = new Factorial();
		int result = fct.fact(5);
		assertEquals(120, result);
	}

}
