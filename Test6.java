package fuel;

import static org.junit.Assert.*;

import org.junit.Test;


public class Test6 {

	@org.junit.Test
	public void test1() {

		Calc a = new Calc(756,24,31);
		assertEquals(a.getCost(),"5624.64");
	}

}
