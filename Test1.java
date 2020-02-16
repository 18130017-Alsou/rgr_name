package fuel;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test1 {

	@org.junit.Test
	public void test1() {

		Calc a = new Calc(500, 30, 150);
		assertEquals(a.getFuel(),"150.0");
	}

}
