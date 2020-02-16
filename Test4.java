package fuel;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test4 {

	@org.junit.Test
	public void test1() {

		Calc a = new Calc(1000, 45, 50);
		assertEquals(a.getCost(),"22500.0");
	}

}
