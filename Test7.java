package fuel;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test7 {

	@org.junit.Test
	public void test1() {

		Calc a = new Calc(700, 10, 33);
		assertEquals(a.getFuel(),"70.0");
	}

}
