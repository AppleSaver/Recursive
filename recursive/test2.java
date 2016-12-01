package recursive;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	@Test
	public void powTest() {
		Factorial fct = new Factorial();
		int result = fct.pow(6, 2);
		assertEquals(36, result);
	}

}
