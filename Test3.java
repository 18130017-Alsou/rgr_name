package fuel;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test3 {

	@org.junit.Test
	public void test1() {

		Calc a = new Calc(100, 20, 60);
		assertEquals(a.getFuel(),"20.0");
	}

}
