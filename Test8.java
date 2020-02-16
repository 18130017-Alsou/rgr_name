package fuel;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test8 {

	@org.junit.Test
	public void test1() {

		Calc a = new Calc(200,5,78);
		assertEquals(a.getCost(),"780.0");
	}

}
